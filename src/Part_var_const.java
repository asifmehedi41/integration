public class Part_var_const {
    String s;
    Part_var_const(String s){
        this.s = s;
        String wc ="";
        String cn ="";
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isDigit(c)){
                wc = s.substring(i);
                cn = s.substring(0,i);
                break;
            }
        }
        //System.out.println(con+" "+wc);
        varPart  v = new varPart(wc);
        Constant c =  new Constant(cn);
    }
}
