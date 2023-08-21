// operador de atribuição , aplica uma atribuição a uma variavel =
// operadores aritmeticos, adição(+), subtração (-), multiplicação(*), divisão (/),resto ou também conhecido como modulo (%).
// operador + se usado em stryng ele será usado como concatenação
// a partir do momento que o depurador identifica a concatenação, o restante ele concatena idependente de ser valor numerico. Com excessão se tiver em parenteses.
// ++ incremento
// -- decremento.
// negação !




public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto= "Jurineide " + "Souza";

        System.out.println(nomeCompleto);

        String valor= "1"+1+1+1;

        System.out.println(valor);

        // transformar um numero em negativo
        int numero=5;
        numero= - numero;
        System.out.println(numero);


    }
}
