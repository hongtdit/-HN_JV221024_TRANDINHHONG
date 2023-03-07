package hn_jv221024_trandinhhong;
import java.util.Scanner;
public class Code {
        public static void main(String[] args) {
            int size =20;
            int arr[];
            int choice, temp;
            int sum1 = 0, sumPrime = 0;
            int count=0;
            int count1 = 0;
            int count2 = 0;
            int max = 0, min = 0;
            boolean checkPrime;
            Scanner sc = new Scanner(System.in);
            boolean display = true;
            arr = new int[100];

            do {
                System.out.println("MENU:");
                System.out.println("1.Nhap số phần tử và giá trị cho các phần tử");
                System.out.println("2.In ra các giá trị");
                System.out.println("3.Tính tổng và in ra các phần tử có giá trị lẻ");
                System.out.println("4.In ra giá trị lớn nhất và nhỏ nhất");
                System.out.println("5.Thống kê số phần tử chia hết cho 2 và 3");
                System.out.println("6.in ra mảng đảo ngược");
                System.out.println("7.In ra các phần tử và tổng số các phần tử ;là số nguyên tố");
                System.out.println("8.Sắp xếp mảng tăng dần");
                System.out.println("9.Thoát");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        do {
                            System.out.println("Enter a size:");
                            size = sc.nextInt();
                            if (size > 100)
                                System.out.println("Size dose not exeed 100!");
                        } while (size > 100);
                        int i = 0;
                        while (i < size) {
                            System.out.println("Enter element " + (i + 1) + ":");
                            arr[i] = sc.nextInt();
                            i++;
                        }
                        break;
                    case 2:
                        System.out.printf( "Element in array:", "");
                        for (int j = 0; j < size; j++) {
                            System.out.print(arr[j] + "\t");
                        }
                        System.out.println();
                        break;

                    case 3:
                        System.out.printf( "Các phần tử trong mảng:", "");
                        for (int j = 0; j < size; j++) {
                            System.out.print(arr[j] + "\t");
                        }
                        System.out.println();
                        System.out.println("Số lẻ là: " );

                        for (int j = 0; j < size; j++) {
                            if (arr[j] % 2 != 0) {
                                System.out.print(arr[j] + " ");
                                sum1 += arr[j];
                            }
                        }
                        System.out.println();
                        System.out.println("ổng các số lẻ: " + sum1);
                        System.out.println();
                        break;

                    case 4:
                        min = arr[0];

                        for (int j = 0; j < size; j++) {
                            if (arr[j] < min) {
                                min = arr[j];
                            }
                            if (arr[j] > max) {
                                max = arr[j];
                            }
                        }

                        System.out.printf( "Các phần tử trong mảng:", "");
                        for (int j = 0; j < size; j++) {
                            System.out.print(arr[j] + "\t");
                        }
                        System.out.println();
                        System.out.println("Gia tri lon nhat la: " + max);
                        System.out.println("Gia tri nho nhat la: " + min);
                        System.out.println();

                        break;

                    case 5:
                        for (int j=0;j<size;j++) {
                            if (arr[j]%6==0){
                                count++;
                            }
                        }
                        System.out.println("Số lượng phần tử chia hết cho cả 2 và 3 là: " + count);

                        break;

                    case 6:
                        System.out.printf( "Các phần tử trong mảng trước khi đảo:", "");
                        for (int j = 0; j < size; j++) {
                            System.out.print(arr[j] + "\t");
                        }
                        System.out.println();
                        for (int j = 0; j < size / 2; j++) {
                            temp = arr[j];
                            arr[j] = arr[size - 1 - j];
                            arr[size - 1 - j] = temp;
                        }
                        System.out.printf( "Phần tử đảo lần lượt là:", "");
                        for (int j = 0; j < size; j++) {
                            System.out.print(arr[j] + "\t");
                        }
                        System.out.println();

                        break;

                    case 7:
                        System.out.printf("%-20s%s", "Các phần tử trong mảng :", "");
                        for (int j = 0; j < size; j++) {
                            System.out.print(arr[j] + "\t");
                        }
                        System.out.println();
                        System.out.println("Các số nguyên tố trong mảng là: ");
                        for (int j = 0; j < size; j++) {
                            checkPrime = true;
                            if (arr[j] == 2) {
                                checkPrime = true;
                            } else if (arr[j] > 1) {
                                for (int k = 2; k < arr[j]; k++) {
                                    if (arr[j] % k == 0) {
                                        checkPrime = false;
                                    }
                                }
                            } else {
                                checkPrime = false;
                            }
                            if (checkPrime) {
                                sumPrime += arr[j];
                                System.out.print(arr[j] + " ");
                            }
                        }
                        System.out.println();
                        System.out.println("Tổng các phần tử là số nguyên tố trong mảng là là: " + sumPrime);
                        System.out.println();

                        break;

                    case 8:
                        System.out.printf("Các phần tử trong mảng :", "");
                        for (int j = 0; j < size; j++) {
                            System.out.print(arr[j] + "\t");
                        }
                        System.out.println();
                        for (int k = 0; k < size - 1; k++) {

                            for (int j = k + 1; j < size; j++) {
                                if (arr[j] < arr[k]) {
                                    temp = arr[k];
                                    arr[k] = arr[j];
                                    arr[j] = temp;
                                }
                            }

                        }
                        System.out.printf( "Các phần tử trong mảng theo thứ tự tăng dần:", "");
                        for (int j = 0; j < size; j++) {
                            System.out.print(arr[j] + "\t");
                        }
                        System.out.println();

                        break;
                    case 9:

                    default:
                        System.out.println("Exit");
                    System.exit(0);
                }
            } while (display);


        }
    }

