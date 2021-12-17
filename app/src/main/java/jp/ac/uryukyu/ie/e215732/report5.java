package jp.ac.uryukyu.ie.e215732;



public class report5 {
    public static void main(String[] args) {

        try {
            //処理したいコード
            String str = null;
            System.out.println(str.length()); 

        } catch (NullPointerException e) {
            //NullPointerExceptionが起きたときの処理
            System.out.println("発動しました");
             System.out.println(e.getMessage());
        }
    
    }
}
