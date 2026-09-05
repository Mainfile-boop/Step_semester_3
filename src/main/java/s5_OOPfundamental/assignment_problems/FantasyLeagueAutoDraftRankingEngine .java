package Step_semester_3.src.main.java.s5_OOPfundamental.assignment_problems;

import java.util.Arrays;

class FantasyLeagueAutoDraftRankingEngine {

    static class Player implements Comparable<Player> {

        String name;
        int matchesPlayed;
        double battingAverage;
        boolean injured;

        public Player(String name, int matchesPlayed,
                      double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        // Established player: experience alone is enough
        static boolean isDraftable(int matchesPlayed) {
            return matchesPlayed >= 10;
        }

        // Other players: must have enough experience and be fit
        static boolean isDraftable(int matchesPlayed, boolean injured) {
            return matchesPlayed >= 5 && !injured;
        }

        // Sort by batting average in descending order
        @Override
        public int compareTo(Player other) {
            return Double.compare(other.battingAverage, this.battingAverage);
        }
    }

    static String draftAndRank(Player[] players) {

        Player[] draftable = new Player[players.length];
        int count = 0;

        for (Player player : players) {

            boolean qualifies;

            if (player.matchesPlayed >= 10) {
                qualifies = Player.isDraftable(player.matchesPlayed);
            } else {
                qualifies = Player.isDraftable(
                    player.matchesPlayed,
                    player.injured
                );
            }

            if (qualifies) {
                draftable[count] = player;
                count++;
            }
        }

        // Remove unused positions
        draftable = Arrays.copyOf(draftable, count);

        // Rank using compareTo()
        Arrays.sort(draftable);

        String result = "";

        for (int i = 0; i < draftable.length; i++) {
            if (i > 0) {
                result += " | ";
            }

            result += (i + 1) + ". " + draftable[i].name;
        }

        return result;
    }

    public static void main(String[] args) {

        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}
