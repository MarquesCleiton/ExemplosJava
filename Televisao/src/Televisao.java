
public class Televisao {
	
	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;
	
	public Televisao(String marca, int volttagem, int tamanho) {
		System.out.println("Esse método é criado no momento que é dado NEW na classe");
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = false;
		this.voltagem = 1;
		this.canal = 5;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public void switchPower() {
		ligada = !ligada;
		System.out.println("A tv " + marca + " está " + ((ligada) ? "ligada!" : "desligada!"));

		// operador ternario de atribuiçao condicional
		/*
		 * ((testeLogico)? <valor caso verdadeiro> : <valor caso for falso>)
		 */
	}

	public void aumentarVolume() {
		if (ligada) {
			
			if(volume!=100) {
				volume++;
				System.out.println("A tv " + marca + " está no volume " + volume);
			}else {
				System.out.println("MAX");
			}
			
		} else {
			System.out.println("A TV está desligada");
		}

	}

	public void diminuirVolume() {
		if (ligada) {
			if(volume!=0){
			volume--;
			System.out.println("A tv " + marca + " está no volume " + volume);
			}else {
				System.out.println("MUTE");
			}
			
		} else {
			System.out.println("A TV está desligada");
		}

	}

	public void avancarCanal() {
		if (ligada) {
			canal++;
			if(canal > 10) {
				canal = 1;
			}
			System.out.println("A tv " + marca + " está no canal " + canal);
		} else {
			System.out.println("A TV está desligada");
		}

	}

	public void voltarCanal() {
		if (ligada) {
			canal--;
			if(canal == 0) {
				canal = 10;
			}
			System.out.println("A tv " + marca + " está no canal " + canal);
		} else {
			System.out.println("A TV está desligada");
		}

	}

	public void MayWhy() {
		System.out.println("Quem?");
	}
}
