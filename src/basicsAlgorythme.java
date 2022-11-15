import java.util.Scanner;
import java.util.Random;

public class basicsAlgorythme {
    public static void main(String[] args) {
        /*TODO Travaux pratiques
          Exercice 1
          Quelle sera la valeur de C à la fin de cet algorithme ?
          A = 12
          B = 2
          C = A * B
         */
        System.out.println("🎓--Exercice 1--🎓");
        int A = 12;
        int B = 2;
        int C = A * B;
        System.out.println(C);

        // Exercice 2
        //Ecrire un algorithme qui inverse les valeurs de deux variables D et E
        // quel que soit le contenu de D et de E
         System.out.println("🎓--Exercice 2--🎓");

         int D = 2;
         int E = 5;
         int F = D;
          D = E;
          E = F;


        // Exercice 3gi
        //Quel serait la valeur de I à la fin de cette algorithme ?
        //    G = "123  H = "12"  I = G + H
        System.out.println("🎓--Exercice 3--🎓");
        String G = "123";
        String H = "12";
        String I = G + H;
        System.out.println(I);


        //Exercice 4
        //Ecrire un algorithme qui demande à l'utilisateur le prix Hors taxe
        // d'un objet et qui donne sa valeur TTC (multiplier le prix par 1.196).
        System.out.println("🎓--Exercice 4--🎓");
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Veuillez entrer un entier du prix Hors Taxe d'un objet");
        double ht = saisieUtilisateur.nextDouble();
        double ttc = ht * 1.196;
        System.out.println("Prix Hors taxe :" + ht);
        System.out.println("Prix TTC : " + ttc);

        /*Exercice 5
        Ecrire un algorithme qui demande à l'utilisateur son prénom et son nom
        et qui affiche ensuite la phrase "Bonjour prénom votre nom est nom"
         */
        System.out.println("🎓--Exercice 5--🎓");
        System.out.println("Veuillez entrer votre prénom");
        String lastName = saisieUtilisateur.next();
        System.out.println("Veuillez entrer votre nom");
        String name = saisieUtilisateur.next();
        System.out.println("Bonjour " + lastName + " votre nom est " + name);

        /*Exercice 6
        Ecrire un algorithme qui demande 2 nombres à un utilisateur.
        Il indique ensuite à l'utilisateur si le produit de ces 2 nombre (A * B) est positif ou négatif
         */
        System.out.println("🎓--Exercice 6--🎓");
        System.out.println("MULTIPLICATOR");
        System.out.println("Veuillez entrer le premier nombre");
        double firstNumber = saisieUtilisateur.nextDouble();
        System.out.println("Veuillez entrer le second nombre");
        double secondNumber = saisieUtilisateur.nextDouble();
        double multiply = firstNumber * secondNumber;

        if (multiply >= 0){
            System.out.println("le nombre est positif, la multiplication est " + multiply);
        } else {
            System.out.println("le nombre est négatif, la multiplication est " + multiply);
        }

        /* Exercice 7
        Ecrire un algorithme qui demande à l'utilisateur son age.
        Il indique ensuite à l'utilisateur quel film il peut aller voir.
        "Action Man" si moins de 13 ans
        "Matrix" si il a entre 13 et 18 ans
        "Evil Dead" si plus de 18ans
         */
        System.out.println("🎓--Exercice 7--🎓");
        System.out.println("CINEMA - Quel est votre âge");
        int age = saisieUtilisateur.nextInt();

        if (age < 13) {
            System.out.println("Vous pouvez regarder Action Man");
        } else if (age <= 18) {
            System.out.println("Vous pouvez regarder Matrix");
        } else {
            System.out.println("Vous pouvez regarder Evil Dead");
        }

        /* Exercice 8
        Ecrire un algorithme qui demande à l'utilisateur un nombre compris
        entre 0 et 10 jusqu'à ce que la réponse soit bonne.
         */
        System.out.println("🎓--Exercice 8--🎓");
        System.out.println("Entre un chiffre");
        double number = saisieUtilisateur.nextDouble();
        while (number < 0 || number > 10) {
            if (number < 0) {
                System.out.println("Plus haut que " + number);
                number = saisieUtilisateur.nextDouble();
            } else if (number > 10) {
                System.out.println("Plus bas que " + number);
                number = saisieUtilisateur.nextDouble();
            }
        } if (number >0 && number<11) {
            System.out.println("Bravo !");
            }

        /* Exercice 9
        Ecrire un algorithme qui demande un chiffre
        et qui affiche ensuite tous les chiffres jusqu'à 0.
         */
        System.out.println("🎓--Exercice 9--🎓");
        System.out.println("Entrez un chiffre de 10 à 100");
        int suite = saisieUtilisateur.nextInt();
        while (suite >0) {
            suite = suite - 1;
            System.out.println(suite);
        }

        /* Exercice 10
        Ecrire un algorithme qui fait deviner un chiffre à l'utilisateur en lui
        indiquant si il est au dessus ou au dessous de la bonne valeur
         */
      System.out.println("🎓--Exercice 10--🎓");
      System.out.println("Vous devez deviner un chiffre compris entre 0 et 100." +
      "Entrez un chiffre");
        int numberTarget = saisieUtilisateur.nextInt();
        int target = 56;

        while (numberTarget != target){
            if (numberTarget < target) {
                System.out.println("Plus haut que " + numberTarget);
                numberTarget = saisieUtilisateur.nextInt();
            } else {
                System.out.println("Plus bas que " + numberTarget);
                numberTarget = saisieUtilisateur.nextInt();
            }
        } if (numberTarget == target) {
            System.out.println("Bravo ! Vous avez trouvé 🥳️");
        }


        /*Exercice 11
        Ecrire un algorithme qui calcule la somme des valeurs d'un tableau.
        chiffres = [10, 15, 20, 15, 14, 8]
         */
        System.out.println("🎓--Exercice 11--🎓");
        int[] myArray = new int[]{10, 15, 20, 15, 14, 8};
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("la somme du tableau est " + sum);


        /* Exercice 12
        Ecrire un algorithme qui permette de rentrer les notes des élèves de la classe.
        On demande dans un premier temps le nombre d'élève.
        */
        System.out.println("🎓--Exercice 12--🎓");
        System.out.println("Combien il y a t-il d'élèves ?");
        int numberOfStudents = saisieUtilisateur.nextInt();
        int notes = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Entrez les notes");
            notes = saisieUtilisateur.nextInt();
        }


          /* Exercice 13
        Reprendre l'algorithme précédent et afficher le nombre d'élève au dessus de la moyenne
           */
        System.out.println("🎓--Exercice 13--🎓");
        System.out.println("Combien il y a t-il d'élèves dans la classe ?");
        int numberOfStudentsEx13 = saisieUtilisateur.nextInt();
        int notes = 0;
        int sumEx13 = 0;
        int moyenne = 0;
        int topNote = 0;
        int topStudent = 0;

        for (int i = 0; i < numberOfStudentsEx13; i++) {
            System.out.println("Entrez les notes (maximum 20)");
            notes = saisieUtilisateur.nextInt();
            sumEx13 = sumEx13 + notes;
            moyenne = sumEx13 / numberOfStudentsEx13;
            if (notes > topNote) {
                topNote = notes;
            }
            if (notes > moyenne) {
                topStudent = topStudent + 1 ;
            }
        }

        System.out.println("La moyenne de la classe est "  + moyenne + "/20");
        System.out.println("La meilleure note de la classe est " + topNote);
        System.out.println("le nombre d'éleves au dessus de la moyenne est : " + topStudent);
        // je n'arrive pas à faire ressortir le nombre d'éèves au dessus de la moyenne !


        /*Exercice 14
        Ecrire un algorithme qui trouve la plus grande valeur dans ce tableau multidimensionel.
        nbres = [[0, 18], [1, 45], [45, 48], [-3, 2]]
         */
        System.out.println("🎓--Exercice 14--🎓");
        int maxValueOfArray = 0;

        int[][] multiArray = {{0,18},{1,45},{45,48},{-3,2}};

        for (int i=0; i < multiArray.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (multiArray[i][j] > maxValueOfArray) {
                    maxValueOfArray = multiArray[i][j];
                }
            }
        }
        System.out.println("la plus grande valeur du tableau est : " + maxValueOfArray);

        /*Exercice 15
        Ecrivez un algorithme qui demande un mot à l'utilisateur et lui affiche ensuite
        le nombre de lettre qui compose le mot.
         */
        System.out.println("🎓--Exercice 15--🎓");
        System.out.println("Entrez un mot ");
        String word = saisieUtilisateur.next();

        // Ne prends pas en compte les espaces d'une chaîne de caractères :
        int stringLenght = word.length();
        System.out.println("Le nombre de lettre qui compose le mot est : " + stringLenght);

        // Prends en compte les espaces d'une chaîne :
        String phrases = "Bonjour tout le monde";
        int stringLenghtWithoutSpaces = phrases.replace(" ", "").length();
        System.out.println(phrases);
        System.out.println("Le nombre de lettre qui compose la phrase est : " + stringLenghtWithoutSpaces);



        /*Exercice 16
        Ecrivez un algorithme qui génère un chiffre aléatoire entre 0 et 5.
        Demandez ensuite à l'utilisateur de deviner ce chiffre avec des indices ("plus grand", "plus petit").
        La fonction a utiliser est ALEATOIRE(nbre)
         */
        // nous devons importer le paquet "import java.util.Random;"

        System.out.println("🎓--Exercice 16--🎓");
        int min = 0;
        int max = 10;
        int lookingForTarget = 0;

        Random random = new Random();
        int target = random.nextInt(max - min) + min;

        System.out.println("Trouvez le chiffre à deviner entre 0 et 10 !");
        System.out.println("Entrer un chiffre");
        lookingForTarget = saisieUtilisateur.nextInt();

        while (lookingForTarget != target){
            if (lookingForTarget > target) {
                System.out.println("Plus bas 👎️");
                lookingForTarget = saisieUtilisateur.nextInt();
            } else if (lookingForTarget < target) {
                System.out.println("Plus haut 👍️");
                lookingForTarget = saisieUtilisateur.nextInt();
            }
        } if (lookingForTarget == target) {
            System.out.println("Bravo vous avez trouvé le chiffre 👏");
        }

         /*Exercice 17
            Ecrire une fonction qui prend 2 paramètre (A et B) et qui retourne
            0 si A est plus grand que B et 1 sinon.
             */
        System.out.println("🎓--Exercice 17--🎓");
        Scanner saisieUtilisateur = new Scanner(System.in);

        System.out.println("Ecrire la valeur de A");
        int A = saisieUtilisateur.nextInt();
        System.out.println("Ecrire la valeur de B");
        int B = saisieUtilisateur.nextInt();

        if (A > B) {
            System.out.println ("0");
        } else {
            System.out.println ("1");
        }


        /* Exercice 18
        Boss final : le tri à bulle
         */

        System.out.println("🎓--Exercice 18--🎓");
        int[] arrayUnOrder = { 12, 46, 2, -6, 33, 56, 29, 22, 35, 49, 19, 100 };
        int[] arrayInOrder = arrayUnOrder;
        int i = 0 ;

        while (i < arrayInOrder.length-1) {
          if (arrayInOrder[i] > arrayInOrder[i + 1]) {
              int C = arrayInOrder[i];
              arrayInOrder[i] = arrayInOrder[i + 1];
              arrayInOrder[i + 1] = C;
              i = -1;
          }
            i = i + 1;
        }

        i = 0;
        while (i < arrayInOrder.length) {
            System.out.print(arrayInOrder[i] + " ");
            i = i + 1;
        }
        // je n'arrive pas à afficher en 1er le tableau dans le désordre, puis le tableau dans l'ordre


    }
}






