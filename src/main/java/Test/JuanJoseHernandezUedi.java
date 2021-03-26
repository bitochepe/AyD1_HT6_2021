
package Test;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class JuanJoseHernandezUedi {
    @InjectMocks
    private AsignarHorario pasignacion;
    @Mock
    private Carrera pcarrera;

    @Mock
    private RegistroAcademico pcarnet;
    
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void getCodigoHorario() throws Exception
    {
        when(pcarnet.getAnio()).thenReturn(2016);
        when(pcarrera.procesarCarrera()).thenReturn(1);      
        when(pcarnet.cheequearCarnet()).thenReturn(true);
        
        pasignacion = new AsignarHorario();
        Horario phorario;
        phorario = pasignacion.generarHorario(pcarrera, pcarnet);
        if (phorario != null) {
            assertEquals("Mixto", horario.getDescripcion());
        }
    }
    
    @Test
    public void getDescripcion(){
        when(pasignacion.VerDescripcion()).thenReturn("");
        assertEquals("", pasignacion.VerDescripcion());
    }
}
