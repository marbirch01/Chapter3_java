import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

class Tank{
    float level;
}

public class Main {
    public static void main(String[] args){
        System.out.println("Witaj dzisiaj jest");
        System.out.println(new Date());
        System.out.println("////////////////////////////////////////////");
        ////////////////////////////////
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level=21;
        t2.level=37;
        System.out.println("1: t1.level:" + t1.level + ". t2.level:" + t2.level);
        t1=t2;
        System.out.println("2: t1.level:" + t1.level + ". t2.level:" + t2.level);
        t1.level = 2115;
        System.out.println("3: t1.level:" + t1.level + ". t2.level:" + t2.level);
        System.out.println("////////////////////////////////////////////");
        ////////////////////////////////
        Tank x = new Tank();
        x.level = 2.1F;
        System.out.println("1: x.level:" + x.level );
        PassObject.f(x);
        System.out.println("2: x.level:" + x.level );
        System.out.println("////////////////////////////////////////////");
        ////////////////////////////////
        double s, t, v;
        s=1000;
        t=60;
        v=s/t;
        System.out.println("V:" + v);
        System.out.println("////////////////////////////////////////////");
        ////////////////////////////////
        Dog spot = new Dog();
        spot.name = "Puszek";
        spot.says = "Hau";
        Dog scruffy = new Dog();
        scruffy.name = "Sara";
        scruffy.says = "Wrrr";
        System.out.println(spot.name + ": " + spot.says);
        System.out.println(scruffy.name + ": " + scruffy.says);
        Dog sc = new Dog();
        sc=spot;
        System.out.println(sc==spot);
        System.out.println(sc.equals(spot));
        System.out.println("////////////////////////////////////////////");
        ////////////////////////////////
        moneta.losowanie();
        System.out.println("////////////////////////////////////////////");
        ////////////////////////////////
        Operatorylogiczne.porownywanie("Pies", "pies");
        Operatorylogiczne.porownywanie("Pies", "Pies");
        Operatorylogiczne.porownywanie("Pies", "kot");
    }
}

