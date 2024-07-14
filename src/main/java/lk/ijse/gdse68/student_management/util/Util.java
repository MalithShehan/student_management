package lk.ijse.gdse68.student_management.util;

import java.util.UUID;
public class Util {
    public static String idGenerate(){
        return UUID.randomUUID().toString();
    }
}
