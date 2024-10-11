package gm.fit.servicio;

import gm.fit.modelo.Cliente;
import gm.fit.repositorio.ClienteReposoitorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio implements IClienteServicio{
    @Autowired
    private ClienteReposoitorio clienteReposoitorio;

    @Override
    public List<Cliente> listar() {
        List<Cliente> clientes = clienteReposoitorio.findAll();
        return clientes;
    }

    @Override
    public Cliente buscarPorId(int id) {
        Cliente cliente = clienteReposoitorio.findById(id).orElse(null);
        return cliente;
    }

    @Override
    public void guardar(Cliente cliente) {
        clienteReposoitorio.save(cliente);

    }

    @Override
    public void eliminar(int id) {
        clienteReposoitorio.deleteById(id);
    }
}
