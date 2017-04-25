/**
 * 
 */
package br.edu.ifpb.padroes.prototype.maze;

/**
 * @author diogomoreira
 *
 */
public class Labirinto {
	
	private Peca[][] pecas;
	
	public Labirinto(Peca[][] pecas) {
		this.pecas = pecas;
	}
	
	public void showMaze() {
		for (Peca[] linhas : pecas) {
			for (Peca colunas : linhas) {
				System.out.print(colunas.getRepresentacao());
			}
			System.out.println();
		}
	}

}
