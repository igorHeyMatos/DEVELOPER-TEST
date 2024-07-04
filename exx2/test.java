package exx2;

public class test {
    public static void main(String[] args) {
        String texto = "Ola , mundo , java !";

        StringBuilder novoTexto = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                novoTexto.append(c);
            }
        }
        System.out.println(novoTexto);
    }

}
