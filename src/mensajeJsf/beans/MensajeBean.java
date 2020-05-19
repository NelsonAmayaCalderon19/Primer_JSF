package mensajeJsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MensajeBean {
	private Usuario usuario;

	public MensajeBean(){
		this.usuario = new Usuario();
		this.usuario.setNombre("Nelson");
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String guardar(){
		System.out.println(usuario.getEmail()+ " - " +usuario.getNombre());
		if(usuario.getEmail().contentEquals("nelson@gmail.com")){
			return "home";
		}else{
			return "error";
		}
		
	}

	
	
}
