public class Arraynew {
    public static void main(String [] args){
        Object [] obj = new Object[10];
        obj[0] = new Integer(100);
        obj[1] = new Double(12.12);
        obj[2] = new Long(5009);
        obj[3] = new Float(31.12f);
        obj[4] = 100;
        obj[5] = 12.12f;
        Integer int1 = 100;  //Integer int1 = new Integer(100);
        obj[6] = int1;
        obj[7] = "Suraj";  //String object
        


        System.out.println(obj[6]);

    }
}
