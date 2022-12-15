import java.io.*;
import java.util.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws Throwable {

        partOne();
        partTwo();

    }

    private static void partTwo() throws Throwable {
        Scanner infile = new Scanner(new File("test.dat"));

    }

    private static void partOne() throws Throwable {
        Scanner infile = new Scanner(new File("basic.dat"));

        int answer = -1;
        while(infile.hasNext()) {
            String blast = infile.nextLine();
            char[] burst = blast.toCharArray();
            ArrayList<Character> group = new ArrayList<>();
            boolean dupes = false;
            group.add(burst[0]);
            group.add(burst[1]);
            group.add(burst[2]);

            for(int x = 3; x < burst.length; x++){
                if(!group.contains(burst[x]))
                    dupes = true;
                group.add(burst[x]);
                if(dupes) {
                    answer = x;
                    break;
                }
                group.remove(0);
            }
            out.println(answer);
        }


    }
}
