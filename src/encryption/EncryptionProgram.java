package encryption;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EncryptionProgram {
    Scanner scanner;
    ArrayList <Character> list;
    ArrayList <Character> shouffledList;
    char [] myArrayForSentence;
    char characters;


    EncryptionProgram(){
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        shouffledList = new ArrayList<>();
        newKey();
        askQuestion();

    }
    void askQuestion(){
        while (true){
            System.out.println("What do you want to do?");
            System.out.println("(E)ncrypt,(D)ecrypt,(Q)uit");
            char keyFromUser = Character.toUpperCase(scanner.nextLine().charAt(0));
            switch (keyFromUser){
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("invalid input, try again");
            }
        }
    }

    //Creating the list and shuffledList of ASCII characters to the arraylist
    void newKey(){
        list.clear();
        shouffledList.clear();

        characters = ' ';

        for (int i=32; i<127;i++){
            list.add(Character.valueOf(characters)); //Converts characters
            characters++;
        }
        shouffledList = new ArrayList<>(list);



//        Collections.shuffle(shouffledList);
//        for (Character x: list){
//            System.out.print(x);
//        }
//        System.out.println();
//        for (Character i: shouffledList){
//            System.out.print(i);
//        }
//        System.out.println();

    }

    //Matching sentence with shuffled ASCII characters
    void encrypt(){
        System.out.println("Write your sentences: ");
        String sentenceFromUser = scanner.nextLine();
        myArrayForSentence = sentenceFromUser.toCharArray();

        for (int i=0;i<myArrayForSentence.length; i++){
            for (int j=0;j<list.size(); j++){
                if(myArrayForSentence[i]==list.get(j)){
                    myArrayForSentence[i] = shouffledList.get(j);
                    break;
                }
            }
        }
        System.out.println("Your encrypted sentence"+myArrayForSentence);

    }


    void decrypt(){
        for (int i=0;i<myArrayForSentence.length; i++){
            for (int j=0;j<shouffledList.size(); j++){
                if(myArrayForSentence[i]==shouffledList.get(j)){
                    myArrayForSentence[i] = list.get(j);
                    break;
                }
            }
        }
        System.out.println(myArrayForSentence);
    }
    void quit(){
        System.exit(0);
    }

}
