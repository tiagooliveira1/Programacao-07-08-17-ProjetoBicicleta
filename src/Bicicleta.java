/**Bicicleta que irá representar uma bicicleta do mundo real na aula de JAVA e OO, e também
 * servirá o que é e como utilizar os comentários.
 * 
 * @author Tiago Oliveira
 * @since 7 de agosto de 2017
 * @version 1.0.0
 * 
 *
 */
public class Bicicleta {
	
	/**
	 * Atributo que irá representar a velocidade da bicicleta
	 */
	private float velocidade = 0;
	/**
	 * Atributo que irá armazenar a cadência  utilizada no momento. Valor padrão=0
	 */
	private int cadencia = 0;
	/**
	 * Atributo que irá armazenar a marcha utilizada no momento. Valor padrão=1
	 */
	private int marcha = 1;
	
	/**
	 * Método para retornar a velocidade 
	 * 
	 * @return tipo float - velocidade atual
	 */
	public float getVelocidade() {
		return velocidade;
	}
	
	/**
	 * Método para setar a velocidade atual 
	 * 
	 * @param tipo float - velocidade atual
	 */
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	/**
	 * Método para retornar a cadência 
	 * 
	 * @return tipo int - cadência atual
	 */
	public int getCadencia() {
		return cadencia;
	}
	/**
	 * Método para setar a cadência atual 
	 * 
	 * @param tipo int - cadência atual
	 */
	public void setCadencia(int cadencia) {
		this.cadencia = cadencia;
	}
	/**
	 * Método para retornar a marcha 
	 * 
	 * @return tipo int - marcha atual
	 */
	public int getMarcha() {
		return marcha;
	}
	
	/**
	 * Método para setar a marcha atual 
	 * 
	 * @param tipo int - marcha atual
	 */
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

}
