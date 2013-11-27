public class Fatorial{
	//versao interativa do calculo do fatorial, incluindo o teste para n iguall a zero
	public int calcularFatorial(int n){
		if(n < 0)
			throw new IllegalArgumentException("nao exeite fatorial de numero negativo");
		int resultado = 1;
		if(n != 0){

		for(int i = 2; i <= n;i++)
			resultado *= i;
		}
		return resultado;
	}
}