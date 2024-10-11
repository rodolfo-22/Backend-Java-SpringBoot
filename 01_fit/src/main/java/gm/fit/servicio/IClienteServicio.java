package gm.fit.servicio;

import gm.fit.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
    public List<Cliente> listar();
    public Cliente buscarPorId(int id);
    public void guardar(Cliente cliente);
    public void eliminar(int id);

}
