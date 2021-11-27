package basicPessoas;

public class Pessoas {
	
	private String name;
	private Integer quantidade;
	
	public Pessoas() {
		
	}

	public Pessoas(String name, Integer quantidade) {
		this.name = name;
		this.quantidade = quantidade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Pessoas [name=" + name + ", quantidade=" + quantidade + "]";
	}
	
	
	
	
	
	

}
