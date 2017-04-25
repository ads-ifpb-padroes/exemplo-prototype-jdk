/**
 * 
 */
package br.edu.ifpb.padroes.prototype.maze.wall;

import java.math.BigDecimal;

import br.edu.ifpb.padroes.prototype.maze.Peca;

/**
 * @author diogomoreira
 *
 */
public abstract class ParedePrototype extends Peca {
	
	protected BigDecimal dimensao;
	
	public BigDecimal getDimensao() {
		return dimensao;
	}

	public void setDimensao(BigDecimal dimensao) {
		this.dimensao = dimensao;
	}
	
}
