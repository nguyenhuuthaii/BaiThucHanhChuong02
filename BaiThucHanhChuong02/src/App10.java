import java.util.Scanner;

public class App10 {

    public static void main(String[] args) {

        String chuoi;

        char kyTu;

        int count = 0;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Nhập vào 1 chuỗi bất kỳ: ");

            chuoi = sc.nextLine();

        } while (chuoi.length() > 80);



        System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện: ");

        kyTu = sc.next().charAt(0);

        for (int i = 0; i < chuoi.length(); i++) {

            if (kyTu == chuoi.charAt(i)) {

                count++;

            }

        } 

        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi " + chuoi + " = " + count);

        sc.close();

    }

}

 70  BaiThucHanhChuong2/src/App11.java 
@@ -0,0 +1,70 @@
import java.util.Scanner;

public class App11 {

    public static void main(String[] args) {

        int n, temp, max = 100;

        Scanner sc = new Scanner(System.in);

        int A[] = new int[max];

        do {

            System.out.println("Nhập số phần tử của mảng: ");

            n = sc.nextInt();

        } while (n <= 2 || n > max-1);

        System.out.println("Nhập giá trị cho các phần tử của mảng: ");

        for (int i = 0; i < n; i++) {

            System.out.print("A[" + i + "] = ");

            A[i] = sc.nextInt();

        }

        System.out.println("Mảng ban đầu: ");

        for (int i = 0; i < n; i++) {

            System.out.print(A[i] + "\t");

        }

        for (int i = 0; i < n - 1; i++) {

            for (int j = i+1; j <= n - 1; j++) {

                if (A[j] < A[i]) {

                    temp = A[i];

                    A[i] = A[j];

                    A[j] = temp;

                }

            }

        }

        System.out.println("\nMảng sau khi sắp xếp: ");

        for (int i = 0; i < n; i++) {

            System.out.print(A[i] + "\t");

        }

        sc.close();

    }

} 
