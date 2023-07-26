import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        for(int i = 1;i <= 10; i ++){
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i >= 1){
//            System.out.println(i);
//
//
//            i --;
//        }

//        int i = 11;
//        do {
//            System.out.println(i);
//
//            i ++;
//        } while (i <= 10);


//        int i = 10 ;
//        i = i + 1;
//        i ++;
//        System.out.println(i);
//        System.out.println(i ++);
//        System.out.println(i);
//
//        System.out.println(++i);
//        System.out.println(i);


//        int[] a = new int[3];
//        a[0] = 5;
//        a[1] = 6;
//        a[2] = 7;
//        a[3] = 9;
//
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }


//        int[] b = {1,2,3};
//
//        for (int i=0;i<b.length;i++){
//            System.out.println(b[i]);
//        }
//
//        List<Integer> c = new ArrayList<Integer>();
//        c.add(5);
//        System.out.println(c.get(0));

//        int i = 1;
//        do {
//            if (
//                    i % 2 != 0
//                            && i % 3 != 0
//                            && i % 5 != 0
//                            && i % 7 != 0
//                            && i != 1
//                            || i == 2
//                            || i == 3
//                            || i == 5
//                            || i == 7
//            ) {
//                System.out.println(i);
//            }
//
//            i++;
//        } while (i <= 100);

//
//
//        int i = 1;
//        do {
//            if (
//                    i != 1
//                    && i % 2 != 0
//                    && i % 3 != 0
//                    && i % 5 != 0
//                    && i % 7 != 0
//                    || i == 2
//                    || i == 3
//                    || i == 5
//                    || i == 7
//            ){
//                System.out.println(i);
//            }
//            i++;
//        }while (i <= 100);
//
//if (){
//
//}




//        int[] x = new int[5] ;
//        x[2] = 5;

//        int[] y = {12,25,30,5,1,1,2,4,5,23,4,6,45,7,8,6,5,4,5,7,6,4,3,6,7,8,5,3,3,34,5,6,} ;
//        for (int i = 0; i < y.length; i++){
//            System.out.println(
//                    y[i]
//            );
//        }
        Scanner read = new Scanner(System.in);
//        System.out.println("Please enter number of students");
//        int number = read.nextInt();
//
//        String[] names = new String[number];
//
//        for (int i = 0; i<number; i++){
//            System.out.println("please enter student number " + (i + 1));
//           names[i]= read.next();
//        }
//
//
//        for (int i = 0; i < names.length; i++){
//            System.out.println(
//                    names[i]
//            );
//        }


//        String[] questions = {
//                "1- ( 2*9 )",
//                "2- ( 5/2 )",
//                "3- ( 9-7 )",
//                "4- ( 5*7 )",
//                "5- ( 2*19 )"
//        };
//
//        String[] answers = {
//                "18",
//                "2.5",
//                "2",
//                "35",
//                "38"
//        };
//
//        int score = 0;
//
//        for (int i=0;i<questions.length;i++){
//            System.out.println(questions[i]);
//            String a = read.next();
//            if (a.equals(answers[i])){
//                System.out.println("Correct Answer");
//                score ++;
//            }else {
//                System.out.println("Wrong Answer");
//            }
//        }
//
//        System.out.println("Your score is " + score +" of 5");




        String[] words = {"Hello","in","our","new","world","Mother","Father"};
        String space = " ";
        String star = "*";
        String row = "";
        String firstRow = "";
        int maxLength = words[0].length();
        for (int i = 0;i<words.length;i++){
            if (words[i].length() > maxLength){
                maxLength = words[i].length();
            }
        }
        firstRow = star.repeat(maxLength + 2);
        System.out.println(firstRow);
        for (int i = 0;i<words.length;i++){
            row = "*" + words[i] ;
            row = row + space.repeat(maxLength - words[i].length());
            row = row + "*";
            System.out.println(row);
        }
        System.out.println(firstRow);












    }
}


//Todo
//      Create Quiz System
//      First Take Student Name
//      Second Take Number Of Questions From student
//      then show him questions and wait for answer
//      make score for every question and calc that score
//      show him at the end the total score he achieved
