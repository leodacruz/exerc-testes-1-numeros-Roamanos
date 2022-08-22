
public class App {

    public static void main(String[] arg) {
        // teste do numeros romanos
        int resp;
        RomanNumeral rn = new RomanNumeral();

        resp = rn.convert("C");
        if (resp == 100) {
            System.out.println("acertou mizeravi");
        } else {
            System.out.println("errou!!");
        }

        resp = rn.convert("CLV");
        if (resp == 155) {
            System.out.println("acertou mizeravi");
        } else {
            System.out.println("errou!!");
        }

        resp = rn.convert("CM");
        if (resp == 900) {
            System.out.println("acertou mizeravi");
        } else {
            System.out.println("errou!!");
        }


    }
}
