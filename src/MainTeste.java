
public class MainTeste {

	public static void main(String[] args) {
		// TODO: Falta fazer alguma coisa. Exemplo de TODO
		
		System.out.println("início");
		
		// definindo atributo bicicleta para exemplificar comentários  
		Bicicleta bike = new Bicicleta(56.3f, 1, 70);
		
		/* 
		 * Exemplo de Comentários em bloco
		 * 
		 */
		
		System.out.println( "Cadência: "+bike.getCadencia() );
		System.out.println( "Velocidade: "+bike.getVelocidade() );
		System.out.println( "Marcha: "+bike.getMarcha() );
		
		System.out.println("fim");
	}

}
