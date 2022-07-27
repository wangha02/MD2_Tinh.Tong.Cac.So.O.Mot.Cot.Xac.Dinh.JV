import java.util.Scanner;

public class Main {
    public class main {
        public static void main(String[] args) {
            int m,n;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập dòng");
            m = scanner.nextInt();
            System.out.println("Nhập cột");
            n = scanner.nextInt();
            int arr[][] = new  int[m][n];
            System.out.println("Nhập giá trị cho các phần tử của mảng");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("arr["+ i +","+ j + "]");
                    arr[i][j] = scanner.nextInt();



                }

            }
            System.out.println("Nhập cột muốn tính tổng: ");
            int n1 = scanner.nextInt();
            if (n1 <n){
                int sum = 0;
                for (int i = 0; i < m ; i++){
                    sum += arr[i][n1];
                }
                System.out.println("sum: "+sum);
            }else {
                System.out.println("Không tìm thấy cột");
            }
        }
    }
}