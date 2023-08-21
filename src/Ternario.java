// <expressão condicional> ? <Caso true> : <Caso false>

public class Ternario {
    public static void main(String[] args) {
        int a,b;
        a=5;
        b=5;
        String resultado = a == b ?"Verdadeiro":"falso";
        System.out.println(resultado);

        String resultados= a>b ? "maior": "menor";
        System.out.println(resultados);

        String result= a+b>10 ? "passou de ano" : "repetiu de ano";
        System.out.println(result);

        boolean res = a!=b ? true : false;
         System.out.println(res);
    }
}
