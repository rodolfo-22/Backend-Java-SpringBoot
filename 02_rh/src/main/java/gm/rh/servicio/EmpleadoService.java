package gm.rh.servicio;

import gm.rh.modelo.Empleado;
import gm.rh.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    private EmpleadoRepositorio repositorio;

    @Override
    public List<Empleado> listar() {
        return repositorio.findAll();
    }

    @Override
    public Empleado buscarPorId(Integer id) {
        Empleado empleado = repositorio.findById(id).orElse(null);
        return empleado;
    }

    @Override
    public Empleado guardar(Empleado empleado) {
        return repositorio.save(empleado);
    }


    @Override
    public void eliminar(Empleado empleado) {
        repositorio.delete(empleado);

    }
}
