
public class Review01 {

    public static void main(String[] args) {
        int price = 1500; //変数に1500を代入
        int tax = 10; //変数に税率を代入
        int result = includingTax(price,tax); //消費税を返す
        System.out.println(price + "円の商品の税込価格" + (price+result) +"円（消費税は"+ result +"円）です。");
    }

    //taxメソッド記載
    public static int includingTax(int price, int tax) {
    int result = price / tax;
    return result;
    }
}

