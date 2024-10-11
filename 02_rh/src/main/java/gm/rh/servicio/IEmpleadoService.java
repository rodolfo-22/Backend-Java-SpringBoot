package gm.rh.servicio;

import gm.rh.modelo.Empleado;

import java.util.List;

public interface IEmpleadoService {
    public List<Empleado> listar();
    public Empleado buscarPorId(Integer id);
    public Empleado guardar(Empleado empleado);
    public void eliminar(Empleado empleado);
}
