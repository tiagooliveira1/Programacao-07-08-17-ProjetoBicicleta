
public class MainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("início");
		
		
		Bicicleta bike = new Bicicleta();
		System.out.println( "Cadência: "+bike.getCadencia() );
		System.out.println( "Velocidade: "+bike.getVelocidade() );
		System.out.println( "Marcha: "+bike.getMarcha() );
		
		System.out.println("fim");
	}

}
