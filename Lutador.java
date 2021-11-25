package aulasete;

public class Lutador implements Inter{

	//Atributos
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vit�rias;
	private int derrotas;
	private int empates;
	
	
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vit�rias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vit�rias = vit�rias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	
	
	//m�todos abstratos implementados da interface
	@Override
	public void apresentar() {
		// TODO Auto-generated method stub
		
		System.out.println("IIIIIITS tiiiiiiiiiiime!!!!!!, Apresentando o ");
		System.out.println("Lutador : "+ this.getNome() );
		System.out.println(" Origem : "+ this.getNacionalidade());
		System.out.println(this.getIdade()+"  Anos");
		System.out.println(this.getAltura() + " m de Altura");
		System.out.println("Pesando :" +this.getPeso()+ "Kg");
		System.out.println("Tenco como seu cartel de lutas: ");
		System.out.println("Ganhou:" + this.getVit�rias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " +this.getEmpates());
		
	}
	@Override
	public void status() {
		// TODO Auto-generated method stub
		
		System.out.println(this.getNome());
		System.out.println("� da Categoria Peso  "+ this.getCategoria());
		System.out.println(this.getVit�rias()+" Vit�rias");
		System.out.println(this.getDerrotas() + " Dererrotas");
		System.out.println(this.getEmpates() + " Empates");
		
	}
	@Override
	public void ganharLuta() {
		// TODO Auto-generated method stub
		this.setVit�rias(this.getVit�rias() + 1) ;
	}
	@Override
	public void perderLuta() {
		// TODO Auto-generated method stub
		this.setDerrotas(this.getDerrotas() + 1);
	}
	@Override
	public void empatarLuta() {
		// TODO Auto-generated method stub
		this.setEmpates(this.getEmpates() + 1);
	}


    //getters e setters
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNacionalidade() {
		return nacionalidade;
	}



	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inv�lido";
		}else if (this.peso <= 70.3) {
			this.categoria = "Pena";
		}else if (this.peso <= 89.9 ) {
			this.categoria = "M�dio";
		}else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else 
			this.categoria = "inv�lido";
		this.categoria = categoria;
	}



	public int getVit�rias() {
		return vit�rias;
	}



	public void setVit�rias(int vit�rias) {
		this.vit�rias = vit�rias;
	}



	public int getDerrotas() {
		return derrotas;
	}



	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}



	public int getEmpates() {
		return empates;
	}



	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}
