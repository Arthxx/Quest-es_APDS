package dominio;

public class sala {
	private PortSala PortaEntrada;
	private float MetragemQuadra; 
	private port PortAuxiliar;
	
	
	public port getPortAuxiliar() {
		return PortAuxiliar;
	}

	public void setPortAuxiliar(port portAuxiliar) {
		PortAuxiliar = portAuxiliar;
	}

	public void setPortaEntrada(PortSala portaEntrada) {
		PortaEntrada = portaEntrada;
	}

	public PortSala getPortaEntrada () {
	    return PortaEntrada;

	}
	public float getMetragemQuadra () { 
		return MetragemQuadra;

	}
	public void setMetragemQuadra (float metragemQuadra) { 
		MetragemQuadra = metragemQuadra;

	}
}
