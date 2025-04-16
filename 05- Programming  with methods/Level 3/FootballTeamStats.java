
import java.util.Random;

class FootballTeamStats {


    public int[] generateRandomHeights(int numberOfPlayers) {
        Random random = new Random();
        int[] heights = new int[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            heights[i] = random.nextInt(101) + 150;         }
        return heights;
    }


    public int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public int findShortestHeight(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            if (height < minHeight) {
                minHeight = height;
            }
        }
        return minHeight;
    }


    public int findTallestHeight(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }

    public double calculateMeanHeight(int sum, int numberOfPlayers) {
        return sum / (double) numberOfPlayers;
    }

    public static void main(String[] args) {
        FootballTeamStats teamStats = new FootballTeamStats();
        int numberOfPlayers = 11;
        int[] heights = teamStats.generateRandomHeights(numberOfPlayers);

        int sumOfHeights = teamStats.calculateSum(heights);
        double meanHeight = teamStats.calculateMeanHeight(sumOfHeights, numberOfPlayers);
        int shortestHeight = teamStats.findShortestHeight(heights);
        int tallestHeight = teamStats.findTallestHeight(heights);

        System.out.println("Football Team Heights:");
        System.out.println("Shortest Height: " + shortestHeight + " cm");
        System.out.println("Tallest Height: " + tallestHeight + " cm");
        System.out.println("Mean Height: " + meanHeight + " cm");
    }
}

