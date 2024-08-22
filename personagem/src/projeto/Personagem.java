package projeto;

public class Personagem {
	private byte vida;
	private byte força;
	private byte destreza;
	private byte velocidade;
	
	public Personagem(byte vida,byte força, byte destreza, byte velocidade) {
		this.vida = vida;
		this.força = força;
		this.destreza = destreza;
		this.velocidade = velocidade;
	}
	
	
	public byte getVida() {
		return vida;
	}


	public void setVida(byte vida) {
		this.vida = vida;
	}


	public byte getForça() {
		return força;
	}

	public void setForça(byte força) {
		this.força = força;
	}

	public byte getDestreza() {
		return destreza;
	}

	public void setDestreza(byte destreza) {
		this.destreza = destreza;
	}

	public byte getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(byte velocidade) {
		this.velocidade = velocidade;
	}
	  public void luta(Personagem oponente) {
	        if (this.vida +this.força +this.destreza + this.velocidade>oponente.getVida() +oponente.getForça()+ oponente.getDestreza() + oponente.getVelocidade()) {
	            System.out.println("\nHerói venceu a luta!");
	        } else {
	            System.out.println("\nVilão venceu. Treine mais!");
	        }
	    }
	  public void batalha(Personagem oponente) {
		    int dano = this.força; // Calculando o dano usando a força do personagem
		    byte novaVida = (byte)(oponente.getVida() - dano); // Subtraindo o dano da vida do oponente
		    oponente.setVida(novaVida);
		    System.out.println("\nVida do oponente após o ataque: " + oponente.getVida());
		}
		      
	    		

	
	public String toString() {
		return "\nPersonagem"+ "\nvida=" + vida + "\nforça=" + força + "\ndestreza=" + destreza + "\nvelocidade=" + velocidade ;
	}
	
}
