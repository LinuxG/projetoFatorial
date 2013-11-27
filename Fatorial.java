public class Fatorial{
	//versao interativa do calculo do fatorial
	public int calcularFatorial(int n){
		if(n < 0)
			throw new IllegalArgumentException("nao exeite fatorial de numero negativo");
		int resultado = 1;

		for(int i = 2; i <= n;i++)
			resultado *= i;
		return resultado;
	}
}