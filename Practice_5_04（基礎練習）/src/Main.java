import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.*;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //twoInput
        //factorial();
        //simpleInterest();
        //fibonacci();
        //pyramidStarPattern();
        //pyramidNumPattern();
        //sumOfArray();
        //reverseStr();
        //removingDuplicate();
        removeLeadingZeros();

    }

    //1.  Adding 2 numbers　（プラス）
/*    public static void twoInput(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter first no");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);
    }*/

    //2. Factorial（階乗を求める）
/*    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check");
        int number = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact= fact*i;
        }
        System.out.println(fact);
    }
    */

    //3. Finding simple interest（単利を計算する）
    // Simple interest = (P x T x R)/100
/*    public static void simpleInterest(){
        Scanner scanner = new Scanner (System.in);
        int p,r,t,simpleInterest;
        System.out.println("Enter P");
        p = scanner.nextInt();
        System.out.println("Enter T");
        t = scanner.nextInt();
        System.out.println("Enter R");
        r = scanner.nextInt();

        simpleInterest= p*r*t / 100;
        System.out.println(simpleInterest);

    }*/

    // 4. Fibonacci Series（フィボナッチ数列を表示する）
/*    public static void fibonacci(){
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        System.out.println("Enter the max number to check for fibonacci");
        int maxNo= scanner.nextInt();
        int sum=1;
        List<Integer> fiboNum= new ArrayList<>();
        fiboNum.add(n1);
        fiboNum.add(n2);

        for (int i = 2 ; i<maxNo;i++){
            int val = fiboNum.get(i-2)+ fiboNum.get(i-1);
            fiboNum.add(val);

        }
        System.out.println(fiboNum);

    }*/

    //5. Print a Pryamid Star Pattern（ピラミッド型の星を表示する）
/*    public static void pyramidStarPattern(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int numOfLines= scanner.nextInt();

        for (int a = 0 ; a<numOfLines ; a++){
            for (int i =0 ; i<(a*2-1) ; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
}*/

    //6. A pyramidNumPattern（ピラミッド型の数字を表示する）

/*
    public static void pyramidNumPattern(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList= new ArrayList<>();
        List<Integer> reverseNumList=new ArrayList<>();
        System.out.println("Enter the number of lines");
        int numOfLine= scanner.nextInt();

        for (int i = 1 ; i <= numOfLine ; i++){
            numList.add(i);
            reverseNumList.add(i);
            Collections.sort(reverseNumList, Collections.reverseOrder());

            for (int a = 0; a<i ; a++){
                System.out.print(reverseNumList.get(a));
            }
            for (int b = 0; b<i ; b++){
                if (b==0){
                    continue;
                }
                else {
                    System.out.print(numList.get(b));
                }
            }
            System.out.println("");
        }

    }
*/

    // 7. Compute sum of Array Elements（配列の要素の合計を計算する）
/*
    public static void sumOfArray(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> elementArray = new ArrayList<>();
        System.out.println("Enter the number of elements present");
        int numOfElements= scanner.nextInt();
        int elementsInArray;
        int sum=0;

        for (int i =0 ; i<numOfElements;i++ ){
            System.out.println("Enter number to add");
            elementsInArray = scanner.nextInt();
            elementArray.add(elementsInArray);
        }

        for (int a : elementArray){
            sum= a+sum;
        }

        System.out.print(sum);

    }
*/

    //8. Program to Reverse a String（文字列を逆順にする）
/*
    public static void reverseStr(){
        String test= "Reverse Me";
        String reversed = "";

        for (int i = test.length()-1 ; i>=0 ; i--){
            reversed+=test.charAt(i);
        }
        System.out.println(reversed);
    }
}*/

    //9. Removing duplicate elements from an Array（配列から重複を取り除く）
/*    public static void removingDuplicate(){
        List<Integer> duplicateArray = new ArrayList<>(Arrays.asList(1,2,3,1,3,1,4));
        List<Integer> noDuplicate = new ArrayList<>();

        for(int i =0; i<duplicateArray.size();i++){
            boolean found=false;
            for (int a =0; a<noDuplicate.size();a++){
                if (duplicateArray.get(i).equals(noDuplicate.get(a))){
                    found= true;
                    break;
                }

            }

            if (!found){
                noDuplicate.add(duplicateArray.get(i));
            }

        }
        System.out.println(noDuplicate);
    }*/

    //10. Remove Leading Zeros（先頭のゼロを削除する）
    public static void removeLeadingZeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        String text = scanner.nextLine();
        List<Character> textChar= new ArrayList<>();

        for (int i = 0 ; i < text.length(); i++){
            if (text.charAt(i)== '0'){
                continue;
            }
            else{
                textChar.add(text.charAt(i));
            }
        }
        for (Character a : textChar){
            System.out.print(a);
        }

    }
}
