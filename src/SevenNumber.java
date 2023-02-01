
public class SevenNumber {

    public static void main(String[] args) {
        
        //iの値が１から１００までの処理を繰り返す
        for (int i = 0; i <= 100; i++) {
            
            //7の倍数との時
           if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
            //iの値を表示する
               System.out.println("clap");
           }else {
               System.out.println(i);
           }
        }
        
        
        
        
        
    }

}
