/**
 * 
 */
package br.edu.ifpb.padroes.prototype.maze.floor;

import br.edu.ifpb.padroes.prototype.maze.Peca;

/**
 * @author diogomoreira
 *
 */
public abstract class PisoPrototype extends Peca {
	
	protected String tipo;
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
