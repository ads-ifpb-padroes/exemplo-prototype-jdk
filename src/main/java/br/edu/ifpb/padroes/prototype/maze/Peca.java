/**
 * 
 */
package br.edu.ifpb.padroes.prototype.maze;

/**
 * @author diogomoreira
 *
 */
public abstract class Peca implements Cloneable {
	
	protected String representacao;
	
	public String getRepresentacao() {
		return representacao;
	}
	
	public void setRepresentacao(String representacao) {
		this.representacao = representacao;
	}
	
	protected Peca clone() throws CloneNotSupportedException {
		return (Peca) super.clone();
	}

}
