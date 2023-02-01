
public class IfElseIfSample {

    public static void main(String[] args) {
        int scoreKokugo = 70; //国語の成績
        int scoreSansu = 79; //算数の成績
        
        if (scoreKokugo >= 60 && scoreSansu >= 60 ) {
            System.out.println("よくできました！");
        } else if (scoreKokugo >= 60  ||  scoreSansu >= 60 ) {
            System.out.println("算数か国語どちらかが補講対象です");
        } else {
            System.out.println("赤点です...補講を行います");
        }
    }

}
