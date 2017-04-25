/**
 * 
 */
package br.edu.ifpb.padroes.prototype.maze;

import java.util.Random;

import br.edu.ifpb.padroes.prototype.maze.floor.PisoPrototype;
import br.edu.ifpb.padroes.prototype.maze.wall.ParedePrototype;

/**
 * @author diogomoreira
 *
 */
public class MazeMaker {

	private static final int PAREDE = 1;
	private static final int PISO = 2;

	public static Peca[][] criarLabirinto(PisoPrototype pisoPrototype,
			ParedePrototype paredePrototype) {
		Peca[][] pecas = new Peca[25][25];
		Random rand = new Random();
		try {
			for (int i = 0; i < 25; i++) {
				for (int k = 0; k < 25; k++) {
					int randomNum = rand.nextInt((2 - 1) + 1) + 1;
					if (randomNum == PAREDE) {
						pecas[i][k] = paredePrototype.clone();
					} else {
						pecas[i][k] = pisoPrototype.clone();
					}
				}
			}
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return pecas;
	}

}
