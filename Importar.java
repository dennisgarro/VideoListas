import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class Importar {
    public LinkedList<ObjEmpleado> ImportarArchivo() {
        String rutaArchivo = "Empleados.txt";
        LinkedList<ObjEmpleado> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            ObjEmpleado obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Cedula:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new ObjEmpleado();
                    obj.setCedula(Integer.parseInt(linea.substring(8)));
                } else if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        obj.setNombre(linea.substring(8));
                    }
                } else if (linea.startsWith("Apellido:")) {
                    if (obj != null) {
                        obj.setApellido(linea.substring(10));
                    }
                } else if (linea.startsWith("Direccion:")) {
                    if (obj != null) {
                        obj.setDireccion(linea.substring(11));
                    }
                } else if (linea.startsWith("edad:")) {
                    if (obj != null) {
                        obj.setEdad(Integer.parseInt(linea.substring(6)));
                    }
                } else if (linea.startsWith("Sexo:")) {
                    if (obj != null) {
                        obj.setSexo(linea.substring(6));
                    }
                } else if (linea.startsWith("Correo:")) {
                    if (obj != null) {
                        obj.setCorreo(linea.substring(8));
                        lista.add(obj);
                        obj = null;
                    }
                }
            }
            System.out.println("Archivo importado correcrtamente ");

        } catch (Exception e) {
            // TODO: handle exception
        }
        return lista;
    }

}
