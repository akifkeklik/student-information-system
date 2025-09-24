import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagamentSystem obs = new StudentManagamentSystem();
        Scanner scanner = new Scanner(System.in);

        int choice;
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1.Öğrenci Ekle");
            System.out.println("2.Öğrenci Listele");
            System.out.println("3.Öğrenci Güncelle");
            System.out.println("4.Öğrenci Sil");
            System.out.println("5.Çıkış Yap");
            System.out.println("Seçiminiz :");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Öğrenci Adı: ");
                    String name = scanner.nextLine();
                    System.out.println("Öğrenci E-Maili: ");
                    String email = scanner.nextLine();
                    obs.addStudent(name, email);
                    break;

                case 2:
                    obs.listStudents();
                    break;

                case 3:
                    System.out.println("Güncellenecek Öğrenci ID : ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Yeni Ad: ");
                    String newName = scanner.nextLine();
                    System.out.println("Yeni E-Mail: ");
                    String newEmail = scanner.nextLine();
                    obs.updateStudent(updateId, newName, newEmail);
                    break;

                case 4:
                    System.out.println("Silinecek Öğrenci ID: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    obs.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    isExit = true;
                    break;

                default:
                    System.out.println("Geçersiz seçim, Lütfen tekrar deneyiniz !");

                    if (isExit) {
                        break;
                    }
            }
        }

    }
}
