


    class ExempDo //uso do "do while"
    {
       public static void main(String[] args)
       {
          //n um numero qualquer, c � um contador � o resultado
          int n=8, c=1;
          int m=n;
          System.out.println("Os m�ltiplos de " + n + " s�o:");
          do {
             System.out.println(m);
             c++;
             m=n*c;
          } while (m<100);
       }
    }


