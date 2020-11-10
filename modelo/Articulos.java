package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Articulos {

	//variables
	private int id,disco_duro;
	
	private String nombre,placa,ram,info="";
	
	//importamos clase conexion
	Conexion c = new Conexion();
	
	//constructor por defecto
	public Articulos() {
		
	}
	
	public Articulos(int id,int disco_duro,String nombre,String placa,String ram,String info) {
		this.id = id;
		this.disco_duro = disco_duro;
		this.nombre = nombre;
		this.placa = placa;
		this.ram = ram;
		this.info = info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDisco_duro() {
		return disco_duro;
	}
	

	public void setDisco_duro(int disco_duro) {
		this.disco_duro = disco_duro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	//mÃ©todos
	public void insertar() {
		//inicio de conexion
		c.realizaConexion();
		boolean correcto = false;
		String consulta = "insert into articulos(id,nombre,ram,placa,disco_duro)"
						+"values(?,?,?,?,?)";
		try {
			PreparedStatement st = c.getConn().prepareStatement(consulta);
			
			st.setInt(1,this.getId());
			st.setString(2,this.getNombre());
			st.setString(3,this.getRam());
			st.setString(4,this.getPlaca());
			st.setInt(5,this.getDisco_duro());
			
			
			if(st.execute() == correcto) {
				JOptionPane.showMessageDialog(null, "Los datos fueron insertados correctamente");
			}else {
				JOptionPane.showMessageDialog(null, "Los datos no fueron insertados correctamente");
			}
			
			
			c.getConn().close();
			st.close();
			
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		
	}
	//mÃ©todo para mostrar los articulos de la tabla
	public void mostrar() {
		//inicio de la conexion
		c.realizaConexion();
		
		//Preparamos la consulta
		try {
			String consulta ="select * from articulos";
			Statement st = c.getConn().createStatement();
			ResultSet rs = st.executeQuery(consulta);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String nombre = rs.getString(2);
				String ram = rs.getString(3);
				String placa = rs.getString(4);
				double disco_duro = rs.getInt(5);
				
				
			
				 info =info +"\nDatos de los articulos";
				 info +="\n------------------------";
				 info +="\n id: "+ id;
				 info +="\n nombre:"+ nombre;
				 info +="\n ram:"+ ram;
				 info +="\n placa:" + placa;
				 info+="\n disco_duro:"+ disco_duro;
				 
				
			}
			//cerramos consulta,conexion y result
			c.getConn().close();
			st.close();
			rs.close();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	//eliminar articulo
	public void eliminarArticulo() {
	
		//iniciar la conexion
		c.realizaConexion();
		try {
			Statement st = c.getConn().createStatement();
			//preparar la consulta
			String consulta="DELETE from articulos where id =" + this.getId();
			
			
			  int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este articulo?", "Pulsaste el boton eliminar", 1);
	            if (resp == JOptionPane.YES_OPTION) {
	                st.executeUpdate(consulta);
	            } else {
	            	JOptionPane.showMessageDialog(null, "El articulo fue eliminado correctamente");
	            }
	            JOptionPane.showMessageDialog(null, "Exito al eliminar el articulo");
			
			
			//cerramos consulta y conexion
			st.close();
			c.getConn().close();
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		
	}

	
	//modificar articulo
	
	
	public void modificarArticulo() {
		//variables
		String nombre = this.getNombre();
		String ram = this.getRam();
		String placa = this.getPlaca();
		int disco_duro = this.getDisco_duro();
		int id = this.getId();
		String sql ="";
		c.realizaConexion();
		try {
			Statement st = c.getConn().createStatement();
			  sql = "UPDATE articulos set nombre ='"+nombre+"',"+"ram ="+"'"+ram +"',"+"placa ="+"'"+placa+"',"+"disco_duro ="+"'"+disco_duro+"'"+"where id =" + id;
			
			if(st.executeUpdate(sql)>=1) {
				JOptionPane.showMessageDialog(null, "Las modificaciones fueron realizadas con exito");
			}else {
				JOptionPane.showMessageDialog(null, "No se pudo reaalizar ninguna modificación ");
			}
			

		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	//mostrar un articulo
    public void mostrar_uno() {
        int id = this.getId();
        String sql = "";
        c.realizaConexion();;
       // int resp;
        ResultSet rs;
        try {
            sql = "select * from articulos where id =" + id;
            PreparedStatement st = c.getConn().prepareStatement(sql);

            rs = st.executeQuery();

            if (rs.next()) {
                nombre = rs.getString("nombre");
                ram = rs.getString("ram");
                placa = rs.getString("placa");
                disco_duro = rs.getInt("disco_duro");
              
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningun titulo con ese id actualmente");

            }
           c.getConn().close();
           st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
	
}
