import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] stats = new int[10];

        try(BufferedReader br = new BufferedReader(new FileReader("Aid_received_java.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                if(line != null) {
                    String[] tokens = line.split("\t");
                    if(tokens.length > 0) {
                        for(int i = 0; i < tokens.length; i++) {
                            if(tokens[i].length() > 0) {
                                char minus = tokens[i].charAt(0);
                                char first = tokens[i].charAt(0);

                                if(minus == '-') {
                                    first = tokens[i].charAt(1);
                                }

                                if(first == '0')
                                    stats[0]++;
                                else if(first == '1')
                                    stats[1]++;
                                else if(first == '2')
                                    stats[2]++;
                                else if(first == '3')
                                    stats[3]++;
                                else if(first == '4')
                                    stats[4]++;
                                else if(first == '5')
                                    stats[5]++;
                                else if(first == '6')
                                    stats[6]++;
                                else if(first == '7')
                                    stats[7]++;
                                else if(first == '8')
                                    stats[8]++;
                                else
                                    stats[9]++;
                            }
                        }
                    }
                }
            }
            String everything = sb.toString();
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(stats[i] + " ");
        }
    }
}
