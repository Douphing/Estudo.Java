
class ExempWhile //uso do "while"

{
 	public static void main(String[] args)

{
	//n uma numero qualquer, c � um contador � o resultado
	
	int n=8, c=1;
	int m=n;
	
	System.out.println("Os multiplos de " + n + " s�o");
	while (m<200){
	   System.out.println(m);

		c++;
		m=n*c;
}
}
}