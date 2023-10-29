import java.util.Objects;

public class Operatorylogiczne {
    static void porownywanie (String a, String b){
        boolean x;
        if (Objects.equals(a, b)) x = true;
        else x = false;
        System.out.println(x);
    }
}
