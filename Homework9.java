import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // db.txt 파일에서 ID와 비밀번호 읽어오기 (상대경로 사용)
        try {
            Scanner fileSc = new Scanner(new File("db.txt"));
            while (fileSc.hasNext()) {
                String id = fileSc.next();
                String password = fileSc.next();
                map.put(id, password);
            }
            fileSc.close();
        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim(); // 앞뒤 공백 제거

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            System.out.print("password : ");
            String password = sc.nextLine().trim(); // 앞뒤 공백 제거

            if (!map.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.println();
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
        sc.close();
    }
}
