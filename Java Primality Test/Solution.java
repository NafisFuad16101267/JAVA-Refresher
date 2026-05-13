import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String inputString = bufferedReader.readLine();

        BigInteger inputBigInteger = new BigInteger(inputString);

        System.out.println((inputBigInteger.isProbablePrime(1)) ? "prime" : "not prime");

        bufferedReader.close();
    }
}
