import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> inputArrList = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                inputArrList.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .toList()
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        int biggestSum = Integer.MIN_VALUE;

        for(int row = 1; row < 5; row++){
            for(int column = 1; column < 5; column++){
                int sum = inputArrList.get(row - 1).get(column-1) + 
                          inputArrList.get(row-1).get(column) + 
                          inputArrList.get(row-1).get(column+ 1) + 
                          inputArrList.get(row).get(column) + 
                          inputArrList.get(row+1).get(column-1) + 
                          inputArrList.get(row+1).get(column) + 
                          inputArrList.get(row+1).get(column+1);

                if(sum > biggestSum)
                    biggestSum = sum;
            }
        }

        System.out.println(biggestSum);
    }
}