import java.util.Scanner;

class LeapYear{
    void leapYear(short year){
        if( (year%100==0 || year%4==0) && year%100!=0){
            System.out.print(year + " is a Leap Year");
        }
        else {
            System.out.print(year + " is not a Leap Year");
        }
    }
}

class FindDaysInMonth{
    byte value=0;

    void leapYear(short year){
        if( (year%100==0 || year%4==0) && year%100!=0){
            System.out.print(year + " is a Leap Year. \n");
            value=1;
        }
        else {
            System.out.print(year + " is not a Leap Year. \n");
        }
    }

    void month(byte month){
        if(month==2){
            if(value==1){
                System.out.print("It has 29 Days\n");
            }
            else{
                System.out.print("It has 28 Days\n");
            }
        }
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.print("It has 31 Days\n");
        }
        if(month==4 || month==6 || month==9 || month==11){
            System.out.print("It has 30 Days\n");
        }
    }
}

class Number{
    byte i,k=0,l=0;
    Scanner input = new Scanner(System.in);
    void number(byte number) {
        byte array[] = new byte[number];
        byte array1[] = new byte[number];
        byte array2[] = new byte[number];

        System.out.print("Enter Array elements : ");
        for (i = 0; i < number; i++) {
            array[i] = input.nextByte();
            if (array[i] % 2 == 0) {
                array1[k] = array[i];
                k++;
            } else {
                array2[l] = array[i];
                l++;
            }
        }
        System.out.print("Even Array elements : ");
        for (i = 0; i < k; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.print("\nOdd Array elements : ");
        for (i = 0; i < l; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
class PrimeNumber{
    short i,j,k=0,l=0;

    void number(short number){
        for(i=2;i<number;i++){
            if(number%i==0){
                System.out.print(number +" is not a prime number.\n");
                break;
            }
        }
        if(i==number){
            System.out.print(number + " is a Prime number.\n");
        }
    }
    void range(short start, short end){
        short number = (short) (end-start);
        short array1[] = new short[number];
        short array2[] = new short[number];
        for(i=start;i<end;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    array1[k]=i;
                    k++;
                    break;
                }
            }
            if(i==j){
                array2[l]=i;
                l++;
            }
        }
        System.out.println("All non-prime numbers are: ");
        for(i=0;i<k;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println("\nAll prime numbers are: ");
        for(i=0;i<l;i++){
            System.out.print(array2[i]+" ");
        }
    }

}

class SingleArray{
    byte i,j;
    short box;
    Scanner input = new Scanner(System.in);

    void MaxMin(byte number){
        short array[] = new short[number];
        char answer='y';
        System.out.print("Enter array elements: ");
        for(i=0;i<number;i++){
            array[i]= input.nextByte();
        }
        for(i=0;i<number;i++){
            for(j= (byte) (1+i); j<number; j++){
                if(array[i]>array[j]){
                    box=array[j];
                    array[j]=array[i];
                    array[i]=box;
                }
            }
        }
        System.out.print("Array in ascending order: ");
        for(i=0;i<number;i++){
            System.out.print(array[i] + " ");
        }

        while(answer=='y'){
            System.out.print("\nProblems: \n (1)Find Maximum number\n (2)Find Minimum number\n (3)Find nth maximum number\n (4)Find nth minimum number\nEnter Problem number: ");
            short problem = input.nextShort();

            if(problem==1){
                System.out.print(array[number-1] + " is the maximum number.\n");
            }

            if(problem==2){
                System.out.print(array[0] + " is the minimum number.\n");
            }

            if(problem==3){
                System.out.print("Which maximum number do you want? (value shouldn't be more than "+number+")");
                byte value = input.nextByte();
                System.out.print(array[number-value] + " is the " + value + "th maximum number.\n");
            }

            if(problem==4){
                System.out.print("Which minimum number do you want? (value shouldn't be more than "+number+")");
                byte value = input.nextByte();
                System.out.print(array[value-1] + " is the " + value + "th minimum number.\n");
            }

            System.out.print("\nCONTINUE PROBLEM 6(y/n): ");
            answer= input.next().charAt(0);
        }

    }

    void AscDesc(byte number){
        char answer='y';
        short array[] = new short[number];

        while(answer=='y'){
            System.out.print("Enter array elements: ");
            for(i=0;i<number;i++){
                array[i]= input.nextByte();
            }

            System.out.print("Problems: \n (1)Array in Ascending order\n (2)Array in Descending order\nEnter Problem number: ");
            short problem = input.nextShort();

            if(problem==1){
                for(i=0;i<number;i++){
                    for(j= (byte) (1+i); j<number; j++){
                        if(array[i]>array[j]){
                            box=array[j];
                            array[j]=array[i];
                            array[i]=box;
                        }
                    }
                }
                System.out.print("Array elements in Ascending order: ");
                for(i=0;i<number;i++){
                    System.out.print(array[i] + " ");
                }
            }

            if(problem==2){
                for(i=0;i<number;i++){
                    for(j= (byte) (1+i); j<number; j++){
                        if(array[i]<array[j]){
                            box=array[j];
                            array[j]=array[i];
                            array[i]=box;
                        }
                    }
                }
                System.out.print("Array elements in Descending order: ");
                for(i=0;i<number;i++){
                    System.out.print(array[i] + " ");
                }
            }

            System.out.print("\nCONTINUE PROBLEM 7(y/n): ");
            answer= input.next().charAt(0);

        }

    }

    void swap(byte number){
        short box;
        short array1[] = new short[number];
        short array2[] = new short[number];

        System.out.print("Enter array1 elements: ");
        for(i=0;i<number;i++){
            array1[i]= input.nextByte();
        }
        System.out.print("Enter array2 elements: ");
        for(i=0;i<number;i++){
            array2[i]= input.nextByte();
        }
        for(i=0;i<number;i++){
            box = array1[i];
            array1[i]=array2[i];
            array2[i]=box;
        }
        System.out.print("Array1 elements after swapping: ");
        for(i=0;i<number;i++){
            System.out.print(array1[i] + " ");
        }
        System.out.print("\nArray2 elements after swapping: ");
        for(i=0;i<number;i++){
            System.out.print(array2[i] + " ");
        }


    }

    void reverseSwap(byte number){
        short box;
        short array1[] = new short[number];
        short array2[] = new short[number];

        System.out.print("Enter array1 elements: ");
        for(i=0;i<number;i++){
            array1[i]= input.nextByte();
        }
        System.out.print("Enter array2 elements: ");
        for(i=0;i<number;i++){
            array2[i]= input.nextByte();
        }

        for(i= (byte)(number-1);i>=0;i--){
            box = array1[i];
            array1[i] = array2[number-i-1];
            array2[number-i-1]=box;
        }

        System.out.print("Array1 elements after reverse swapping: ");
        for(i=0;i<number;i++){
            System.out.print(array1[i] + " ");
        }
        System.out.print("\nArray2 elements after reverse swapping: ");
        for(i=0;i<number;i++){
            System.out.print(array2[i] + " ");
        }
    }

    void addElement(byte number){
        short array[] = new short[number];
        System.out.print("Enter array elements: ");
        for(i=0;i<number;i++){
            array[i]= input.nextByte();
        }
        System.out.print("Enter how many elements to be added: ");
        box = input.nextByte();
        for(i=0;i<box;i++){
            System.out.print("Enter element position: ");
            byte p= input.nextByte();
            System.out.print("Enter element value: ");
            byte q = input.nextByte();
            // problem
            for(j= (byte) (number+i); j>=p; j--){
                array[j]=array[j-1];
            }
            array[p-1]=q;
        }
        System.out.print("Array elements: ");
        for(i=0;i<number+box;i++){
            System.out.print(array[i] + " ");
        }
    }

}

class MultiDimensionalArray{

}



public class MainClass {
    public static void main(String args[]){
        byte i,k=0,l=0;
        Scanner input= new Scanner(System.in);
        char answer='y';

        while(answer=='y') {
            System.out.print("\n\nProblems: \n (1)Find Leap year\n (2)Find the number of days in a month in a particular year\n (3)Create odd and even Array\n (4)Check if prime number " +
                    "\n (5)Find Prime numbers in a range \n (6)Find max number, Second max number and Smallest number in an array\n (7)Sort an array ascending and descending order\n (8)Two array element swap" +
                    "\n (9)Inverse array swap of two array\n (10)Add any number of elements to Array\n (11)Delete elements from Array\n (12)Print all elements of a row in a row or a column in a column" +
                    "\nEnter Problem number: ");
            short problem = input.nextShort();


            LeapYear LeapYear = new LeapYear();
            FindDaysInMonth FindDaysInMonth = new FindDaysInMonth();
            PrimeNumber PrimeNumber =new PrimeNumber();
            SingleArray SingleArray = new SingleArray();
            Number Number = new Number();


            if (problem == 1) {
                System.out.print("Enter year: ");
                short year = input.nextShort();
                LeapYear.leapYear(year);
            }

            if (problem == 2) {
                System.out.print("Enter year: ");
                short year = input.nextShort();
                FindDaysInMonth.leapYear(year);

                System.out.print("Enter month: ");
                byte month = input.nextByte();
                FindDaysInMonth.month(month);
            }

            if (problem == 3) {
                System.out.print("Enter Array element number( Max 100): ");
                byte number = input.nextByte();
                Number.number(number);
            }

            if(problem == 4){
                short prime;
                System.out.print("Enter any number: ");
                prime = input.nextShort();
                PrimeNumber.number(prime);
            }

            if(problem == 5){
                short start,end;
                System.out.print("Enter range to find prime numbers :\n");
                System.out.print("Enter starting point: ");
                start = input.nextShort();
                System.out.print("Enter ending point: ");
                end = input.nextShort();
                PrimeNumber.range(start, end);
            }

            if(problem == 6){
                System.out.print("Enter Array element number : ");
                byte number = input.nextByte();
                SingleArray.MaxMin(number);
            }

            if(problem == 7){
                System.out.print("Enter Array element number : ");
                byte number = input.nextByte();
                SingleArray.AscDesc(number);
            }

            if(problem == 8){
                System.out.print("Enter Array element number : ");
                byte number = input.nextByte();
                SingleArray.swap(number);
            }

            if(problem == 9){
                System.out.print("Enter Array element number : ");
                byte number = input.nextByte();
                SingleArray.reverseSwap(number);
            }

            if(problem == 10){
                System.out.print("Enter Array element number : ");
                byte number = input.nextByte();
                SingleArray.addElement(number);
            }

            if(problem == 11){}

            if(problem == 12){}


            System.out.print("\nCONTINUE(y/n): ");
            answer= input.next().charAt(0);
        }
    }
}
