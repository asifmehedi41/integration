public class Constant {
    String cst;
    Constant(String cst){
        this.cst = cst;
        int con = 0;
        for(int i=0; i< cst.length(); i++){
            char c = cst.charAt(i);
            int a =(c-'0');
            //System.out.println("c "+ c +"a "+ a + " this c" + con);
            con = con* 10 + a;
        }
        System.out.println(con);
    }
}
