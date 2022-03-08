import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        // Testando todas as funções recursivas
        System.out.println("Fatorial de 5: " + app.fatorial(5));
        System.out.println("Somatorio de 5: " + app.somatorio(5, 0));
        System.out.println("Fibonacci de 5: " + app.fibonacci(5));
        System.out.println("Somatorio de 2 a 5: " + app.somatorio2(2, 5, 0));
        System.out.println("Palindrome de \"arara\": " + app.isPal("arara"));
        System.out.println("Conversão de 5 para binário: " + app.convBase2(5));
    }

   // implementar um método recursivo que calcula o fatorial de um número
   // ex: fatorial(5) = 5 * 4 * 3 * 2 * 1 = 120
   public static int fatorial(int n)
   {
       if (n == 0) return 1;
       if (n == 1)
           return 1;
       else
           return n * fatorial(n-1);
   }

   // modele e implemente um método recursivo que calcule o somatorio de um numero  n
   // ex: somatorio(5) = 1 + 2 + 3 + 4 + 5 = 15
   public static int somatorio(int n, int j)
   {
       if (n == 0) return 0;
       if (n == 1)
           return 1;
       else
           return n + somatorio(n-1, j);
   }

   // modele e implemente um método recursivo que calcule o n-esimo numero da sequencia de fibonacci
   // ex: fibonacci(5) = 1 + 1 + 2 + 3 + 5 = 8
   public static int fibonacci(int n)
   {
       if (n == 0) return 0;
       if (n == 1)
           return 1;
       else
           return fibonacci(n-1) + fibonacci(n-2);
   }

   // modele e implemente um método recursivo que calcule o somatorio dos numeros inteiros entre os numeros k e j
   // ex: somatorio2(2, 5, 0) =   3 + 4 = 7
    public static int somatorio2(int k, int j, int count)
   {
       if (k == j) {
           return 0;
       }
       else {
           if (count == 0) {
               k++;
           }
           return  k + somatorio2(k + 1, j, count + 1);
       }
   }

   // Modele e implemente um método recursivo que recebeum String em retorna true se este String for umpalíndrome, false caso contrário.
   // Ex: palindrome("arara") = true
   // Ex: palindrome("casa") = false
   public static boolean isPal(String s)
   {
       if (s.length() == 1) {
           return true;
       }
       else {
           if (s.charAt(0) == s.charAt(s.length() - 1)) {
               return isPal(s.substring(1, s.length() - 1));
           }
           else {
               return false;
           }
       }
   }

   //Modele e implemente um método recursivo que recebeum inteiro zero ou positivo e retorna um String com onúmero em binário. String convBase2(int n)
   // Ex: convBase2(5) = "101"
   public static String convBase2(int n)
   {
       if (n == 0) {
           return "0";
       }
       else {
           if (n % 2 == 0) {
               return "0" + convBase2(n / 2);
           }
           else {
               return "1" + convBase2(n / 2);
           }
       }
   }

   // Modele e implemente um método recursivo que calcule osomatório dos números contidos em um ArrayList deinteiros, passado como parâmetro.
   // Ex: somatorioArray(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))) = 15
   public static int somatorioArray(ArrayList<Integer> list)
   {
       if (list.size() == 0) {
           return 0;
       }
       else {
           return list.get(0) + somatorioArray((ArrayList<Integer>) list.subList(1, list.size()));
       }
   }

   // Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.  int findBiggest(ArrayList<Integer> ar)
   // Ex: findBiggest(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))) = 5
   public static int findBiggest(ArrayList<Integer> ar)
   {
       if (ar.size() == 1) {
           return ar.get(0);
       }
       else {
           if (ar.get(0) > ar.get(1)) {
               return findBiggest((ArrayList<Integer>) ar.subList(1, ar.size()));
           }
           else {
               return findBiggest((ArrayList<Integer>) ar.subList(1, ar.size()));
           }
       }
   }
}
