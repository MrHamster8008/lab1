import java.util.Random;
import java.util.Scanner;

public class Exersizes {

    public int sumLastNums (int x){
        int summ = 0;
        summ += x%10;
        x/=10;
        summ+=x/10;
        return summ;
    }

    public boolean isPositive (int x){
        return x >= 0;
    }

    public boolean isUpperCase (char x){
        return x >= 'A' && x <= 'Z';
    }

    public boolean isDivisor (int a, int b){
        return a%b==0 || b%a==0;
    }

    public int lastNumSum(int a, int b){
        return a%10 + b%10;
    }

    public double safeDiv (int x, int y){
        if (y == 0){
            return 0;
        }
        else{
            return (double) x /y;
        }
    }

    public String makeDecision (int x, int y){
        if (x > y){
            return x + ">" + y;
        }
        else if(x < y){
            return x + "<" + y;
        }
        else{
            return x + "=" + y;
        }
    }

    public boolean sum3 (int x, int y, int z){
        return (x+y==z||x+z==y||y+z==x);
    }

    public String age (int x){
        if (x%10 == 1 && x != 1){
            return " год";
        }
        else if ((x%10 == 2 || x%10 == 3 || x%10 == 4) && (x!= 12 && x!= 13 && x!= 14)){
            return " года";
        }
        else{
            return " лет";
        }
    }

    public void printDays (String x){
        switch (x){
            case "Понедельник":
                System.out.println("Понедельник\n");
            case "Вторник":
                System.out.println("Вторник\n");
            case "Среда":
                System.out.println("Среда\n");
            case "Четверг":
                System.out.println("Четверг\n");
            case "Пятница":
                System.out.println("Пятница\n");
            case "Суббота":
                System.out.println("Суббота\n");
            case "Воскресенье":
                System.out.println("Воскресенье"); break;
            default:
                System.out.println("Это не день недели");
        }
    }

    public String reverseListNums (int x){
        String listnum = "";
        while (x >= 0){
            listnum += Integer.toString(x) + " ";
        }
        return listnum;
    }

    public int pow (int x, int y){
        int result = 1;
        for (int i = 0;i<y;i++){
            result*=x;
        }
        return result;
    }

    public boolean equalNum (int x){
        int intfirst = x%10;
        while (x >= 10){
            if (x%10 != intfirst){
                return false;
            }
        }
        return true;
    }

    public void leftTriangle (int x){
        for (int i = 1;i<=x;i++){
            for (int j = 1; j <= i;j++){
                System.out.println("*");
            }
            System.out.println("\n");
        }

    }

    public void guessGame(){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int answer, numbertoguess = rand.nextInt(9);
        System.out.println("Отгадайте цифру от 0 до 9");
        answer = in.nextInt();
        while (answer != numbertoguess){
            System.out.println("Не верно. Отгадайте цифру от 0 до 9");
            answer = in.nextInt();
        }
        System.out.println("Вы отгадали цифру");
    }

    public int findLast (int[] arr, int x){
        int lastid = -1;
        for (int i = 0;i< arr.length;i++){
            if (arr[i] == x){
                lastid = i;
            }
        }
        return lastid;
    }

    public int[]add (int[] arr, int x, int pos){
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    public void reverse (int[] arr){
        int temp;
        for (int i = 0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i];
            arr[arr.length-i] = temp;
        }
    }

    public int[] concat (int[] arr1,int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0;i< arr1.length;i++){
            result[i] = arr1[i];
        }
        for (int i = 0;i< arr2.length;i++){
            result[arr1.length+i] = arr2[i];
        }
        return result;
    }
    
    public int[] deleteNegative (int[] arr){
        int newarrlength = 0,temp = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] >= 0){
                newarrlength++;
            }
        }
        int[] result = new int[newarrlength];
        for (int i = 0;i<arr.length;i++){
            if (arr[i] >= 0){
                result[temp] = arr[i];
                temp++;
            }
        }
        return result;
    }
}
