package br.edu.ifba.inf011.model.controladores;

import br.edu.ifba.inf011.model.Ambiente;
import br.edu.ifba.inf011.model.Termometro;
import br.edu.ifba.inf011.model.TipoControlador;

public class ControladorBasicoMaxima extends ControladorBasico{

	public ControladorBasicoMaxima(TipoControlador tipo, Ambiente ambiente, Integer qtdeTermometros, Double tempMaxima) {
		super(tipo, ambiente, qtdeTermometros, tempMaxima);
	}
	
	public  double getTemperatura() {
		double temperatura = 0;
		double tempMaxima = 0;
		for(Termometro termometro : this.termometros) {
			temperatura = termometro.lerTemperatura();
			if(tempMaxima < temperatura)
				tempMaxima = temperatura;
		}	
		return tempMaxima;
	}	

}