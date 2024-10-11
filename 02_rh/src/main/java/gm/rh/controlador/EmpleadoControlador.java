package gm.rh.controlador;

import gm.rh.modelo.Empleado;
import gm.rh.servicio.EmpleadoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
@CrossOrigin
public class EmpleadoControlador {
    private static final Logger logger = LoggerFactory.getLogger(EmpleadoControlador.class);
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<Empleado> empleados(){
        return empleadoService.listar();
    }

    @PostMapping("/empleados")
    public Empleado guardar(@RequestBody Empleado empleado){
        return empleadoService.guardar(empleado);
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<Empleado> buscarPorId(@PathVariable Integer id){
        Empleado empleado = empleadoService.buscarPorId(id);
        if(empleado == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(empleado);
    }
    @DeleteMapping("/empleado/{id}")
    public ResponseEntity<Map<String, Boolean>>
        eliminar(@PathVariable Integer id){
            Empleado empleado = empleadoService.buscarPorId(id);
            if(empleado == null){
                return ResponseEntity.notFound().build();
            }
            empleadoService.eliminar(empleado);
            return ResponseEntity.ok().build();
            
    }
}
