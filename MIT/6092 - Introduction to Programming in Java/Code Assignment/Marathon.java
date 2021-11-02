import java.util.*;

public class Marathon {
    public static void main(String[] args) {
        String [] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
            };
        
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Hamilton")) {
                System.out.println(names[i] + ": " + times[i]);
                continue;
            }
            System.out.println(names[i] + "\t: " + times[i]);
        } 

        winner(names, times);
    } // main
    private static void winner(String[] people, int[] times) {
        int time_temp;
        String win ="temp", people_temp, secWin = "temp", secWin_temp;
        for (int i = 0; i < people.length; i++) {
            people_temp = people[i];
            time_temp = times[i];
            secWin_temp = people[i];
            sectime = times[i];
            for (int j = 1; j < times.length; j++){
                if (time_temp < times[j]) {
                    win = people_temp;
                    secWin = people[i];
                    continue;
                }
                else {
                    win = people[j];
                    break;
                }
            }
            
        }

        System.out.println("The winner is : " + win);
        System.out.println("The seccond winner is : " + secWin);
    }
}