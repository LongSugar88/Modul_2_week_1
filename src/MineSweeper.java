public class MineSweeper {
    public static void main(String[] args){
        String maps[][] = {
                {".","*",".","*",".","."},
                {".",".",".",".","*","."},
                {"*",".","*",".",".","."},
                {"*",".",".","*",".","."},
                {".",".",".",".","*","*"}
        };
        final int MAP_WIDTH = maps.length;
        for(int i=0; i<MAP_WIDTH; i++) {
            for (int j = 0; j < maps[0].length; j++) {
                if (maps[i][j].equals("*")) {
                    maps[i][j] = "*";
                } else {
                    final int checkPosition[][] = {
                            {i-1, j}, {i+1,j}, {i, j - 1}, {i, j + 1},{i-1, j-1},{i+1, j+1},{i+1, j-1},{i-1, j+1}
                    };
                    int count = 0;
                    for (int k = 0; k < checkPosition.length; k++) {
                        int myCheck[] = checkPosition[k];
                        int frontCheck = myCheck[0];
                        int behindCheck = myCheck[1];
                        boolean checkPositionCondition = behindCheck < 0 || behindCheck == maps[0].length||
                                frontCheck <0 || frontCheck == MAP_WIDTH;
                        if (checkPositionCondition)
                            continue;
                        boolean checkContentCondition = maps[frontCheck][behindCheck].equals("*");
                        if (checkContentCondition)
                            count++;
                    }
                    maps[i][j] = String.valueOf(count);
                }
            }
        }
        for(int i=0; i<MAP_WIDTH; i++) {
            for (int j = 0; j < maps[0].length; j++) {
                System.out.printf(maps[i][j]);
            }
            System.out.println();
        }
    }
}
