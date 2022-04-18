import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("E:/testpicture/b045a5f4-3803-4745-b0e3-de3eec31e82f");
        File[] tempList = file.listFiles();
        for (File file1:tempList){
            System.out.println(file1.getName());
        }
    }
}
