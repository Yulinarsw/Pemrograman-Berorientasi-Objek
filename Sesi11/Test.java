
package JavaSesi11;


public class Test {
    public void methodA(){
        System.out.println("Method A");
    }

    public void methodB(){
        System.out.println(20/0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args){
        Test o = new Test();
        o.methodA();
    
        try {
            o.methodB();

        } catch (Exception e) {
            System.out.println("Error di method B");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("selalu dicetak");
        }
    }
}
