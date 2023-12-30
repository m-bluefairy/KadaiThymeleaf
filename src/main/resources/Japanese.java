import java.util.ResourceBundle;

public class Japanese {

    public static void main(String[] args) {
     // プロパティファイルの値を表示する
        ResourceBundle resources = ResourceBundle.getBundle("japanese");
        System.out.println(resources.getString("content.message"));

    }

}
