import java.util.Random;

public class Main {
    public static void main(String[] args) {

          /* Creer un tableau de personne (prénom, age)
        sélectionner aléatoirement une personne dans un tableau
         */

        String[] arrayName = new String[5];

        arrayName [0] = "Eric, 59 ans";
        arrayName [1] = "Gaelle, 60 ans";
        arrayName [2] = "Alice, 31 ans";
        arrayName [3] = "Vivien, 35 ans";
        arrayName [4] = "Madeleine, 28 ans";

        for (int i = 0; i < arrayName.length; i++){
            Random rnd = new Random();
            System.out.println(arrayName[rnd.nextInt(arrayName.length)]);
        }
    }


}
