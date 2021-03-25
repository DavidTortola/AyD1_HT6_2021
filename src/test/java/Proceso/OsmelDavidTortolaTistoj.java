package Proceso;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 *
 * @author dtortola
 */
public class OsmelDavidTortolaTistoj {

    @InjectMocks
    private AsignarHorario ah;

    @Mock
    private RegistroAcademico ra;

    @Mock
    private Carrera c;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void codigoHorarioTest() {
        try {
            when(ra.cheequearCarnet()).thenReturn(true);
            when(c.procesarCarrera()).thenReturn(2);
            when(ra.getAnio()).thenReturn(2014);
            Horario h = ah.generarHorario(c, ra);
            assertEquals(985, h.getCodigoHorario());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @Test
    public void codigoHorarioTest() {
        try {
            when(ra.cheequearCarnet()).thenReturn(true);
            when(c.procesarCarrera()).thenReturn(4);
            when(ra.getAnio()).thenReturn(2014);
            Horario h = ah.generarHorario(c, ra);
            assertEquals(165, h.getCodigoHorario());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
