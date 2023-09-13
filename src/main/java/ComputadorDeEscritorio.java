public class ComputadorDeEscritorio extends DispositivoTecnologico {
	private String tarjetaDeVideo;
	private String fuenteDePoder;
	private String chasis;
	public Pantalla unnamed_Pantalla_;

	public String getTarjetaDeVideo() {
		return this.tarjetaDeVideo;
	}

	public void setTarjetaDeVideo(String tarjetaDeVideo) {
		this.tarjetaDeVideo = tarjetaDeVideo;
	}

	public String getFuenteDePoder() {
		return this.fuenteDePoder;
	}

	public void setFuenteDePoder(String fuenteDePoder) {
		this.fuenteDePoder = fuenteDePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public ComputadorDeEscritorio(String tarjetaDeVideo, String fuenteDePoder, String chasis) {
		super(tarjetaDeVideo,fuenteDePoder,chasis);
	}

	public String getTipo() {
		return getTipo();
	}
}