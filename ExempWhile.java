
class ExempWhile //uso do "while"

{
 	public static void main(String[] args)

{
	//n uma numero qualquer, c é um contador é o resultado
	
	int n=8, c=1;
	int m=n;
	
	System.out.println("Os multiplos de " + n + " são");
	while (m<200){
	   System.out.println(m);

		c++;
		m=n*c;
}
}
}