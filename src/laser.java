import java.util.Scanner;

public class laser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            
            String[] firstLine = line.split(" ");
            int A = Integer.parseInt(firstLine[0]);
            int C = Integer.parseInt(firstLine[1]);
            
            if (!sc.hasNextLine()) break;
            String[] secondLine = sc.nextLine().trim().split(" ");
            
            int[] blocos = new int[C];
            for (int i = 0; i < C; i++) {
                blocos[i] = Integer.parseInt(secondLine[i]);
            }
            
            int laserOn = 0;
            for (int i = 1; i < C; i++) {
                if (blocos[i] > blocos[i - 1]) {
                    laserOn += blocos[i] - blocos[i - 1];
                }
            }
            laserOn += A - blocos[C - 1];

            System.out.println(laserOn);
        }

        sc.close();
    }
}
