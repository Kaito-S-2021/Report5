package jp.ac.uryukyu.ie.e215727;

public class Report5 {
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionというエラーが発生しました。");
            System.out.println(e.getMessage());
        }
    }
}
