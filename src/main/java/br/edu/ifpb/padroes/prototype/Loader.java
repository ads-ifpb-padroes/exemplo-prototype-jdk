/**
 * 
 */
package br.edu.ifpb.padroes.prototype;

import java.math.BigDecimal;
import java.util.Set;

import br.edu.ifpb.padroes.prototype.maze.Labirinto;
import br.edu.ifpb.padroes.prototype.maze.MazeMaker;
import br.edu.ifpb.padroes.prototype.maze.floor.PisoPedraPrototype;
import br.edu.ifpb.padroes.prototype.maze.floor.PisoPrototype;
import br.edu.ifpb.padroes.prototype.maze.wall.ParedeArbustoPrototype;
import br.edu.ifpb.padroes.prototype.maze.wall.ParedePrototype;
import org.reflections.Reflections;

/**
 * @author diogomoreira
 *
 */
public class Loader {

	public static void main(String[] args) throws CloneNotSupportedException {
		PisoPrototype piso = new PisoPedraPrototype();
		piso.setTipo("QUALQUER");
		piso.setRepresentacao("[D]");

		ParedePrototype parede = new ParedeArbustoPrototype();
		parede.setDimensao(new BigDecimal("12.01"));
		parede.setRepresentacao("[*]");

		Labirinto l = new Labirinto(MazeMaker.criarLabirinto(piso, parede));
		l.showMaze();

	}

}
