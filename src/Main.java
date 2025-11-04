import java.util.Arrays;

public class Main {
    public static void main(String[] args) { //task1
        int[] anIntegerArray = new int[3];
        anIntegerArray[0] = 1;
        anIntegerArray[1] = 2;
        anIntegerArray[2] = 3;
        float[] realArray = {1.57f, 7.654f, 9.986f};
        String[] stringTheSeasons = new String[4];
        stringTheSeasons[0] = "зима";
        stringTheSeasons[1] = "весна";
        stringTheSeasons[2] = "лето";
        stringTheSeasons[3] = "осень";
        String winter = "зима";
        String spring = "весна";
        String summer = "лето";
        String autumn = "осень";
        // task2
        for (int i = 0; i < anIntegerArray.length; i++) {
            System.out.print(anIntegerArray[i]);
            if (i != anIntegerArray.length - 1) {
                System.out.print(", ");
            } else {
                break;
            }
        }
        System.out.println();
        for (int k = 0; k < realArray.length; k++) {
            if (k == realArray.length - 1) {
                System.out.print(realArray[k]);
                break;
            }
            System.out.print(realArray[k] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(stringTheSeasons));
        System.out.println("второй способ вывода данных третьего массива");
        for (int f = 0; f < stringTheSeasons.length; f++) {
            if (f == stringTheSeasons.length - 1) {
                System.out.print(stringTheSeasons[f]);
                break;
            }
            System.out.print(stringTheSeasons[f] + ", ");
        }
        System.out.println();
        System.out.println("другой способ вывода данных третьего массива");
        System.out.println(winter + ", " + spring + ", " + summer + ", " + autumn);
        //Task 3
        System.out.println();
        System.out.println();
        for (int h = 2; h >= 0; h--) {
            System.out.print(anIntegerArray[h]);
            if (h > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int t = realArray.length - 1; t >= 0; t--) {
            System.out.print(realArray[t]);
            if (t > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int w = stringTheSeasons.length - 1; w >= 0; w--) {
            System.out.print(stringTheSeasons[w]);
            if (w > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Task 4
        for (int i = 0; i < anIntegerArray.length; i++) {
            if (anIntegerArray[i] % 2 == 1) {
                anIntegerArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(anIntegerArray));
    }
}
