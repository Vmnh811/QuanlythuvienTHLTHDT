package btt2;

import java.util.Scanner; // Thêm chính xác dòng này vào dòng số 2 nhé

public class hoten {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập họ và tên của bạn: ");
        String hoTen = scanner.nextLine();
        
        // In ra họ tên theo dữ liệu nhập vào
        System.out.println("Họ tên vừa nhập: " + hoTen);
        
        scanner.close();
    }
}
