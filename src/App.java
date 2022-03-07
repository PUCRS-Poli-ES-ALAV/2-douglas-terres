public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        System.out.println(app.somatorio2(2, 5, 0));
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
}
