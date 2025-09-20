package com.mongodb.crud.service;

import com.mongodb.crud.model.Autos;
import com.mongodb.crud.repository.PintorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class AutosServiceTest {

    @Mock
    private AutosRepository AutosRepository; // Mockito simula esta dependencia

    @InjectMocks
    private AutoaServiceImpl AutosService; // Clase donde se inyecta el mock

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Inicializa los mocks antes de cada test
    }

    @Test
    public void testFindById() {
        Autos  = new Autos();
        autos .setId("123");
        autos.setNombre("Mazda");

        when(autosRepository.findById("123")).thenReturn(Optional.of(autos));

        Optional<Autos> resultado = autoaService.findById("123");

        assertTrue(resultado.isPresent());
        assertEquals("Mazda", resultado.get().getNombre());

        verify(autoRepository, times(1)).findById("123");
    }
    @Test
public void testSavePintor(){
        Autos = new Autos();
        autos.setId("892");
        autos.setNombre("Ford");
        when(autoRepository.save(auto)).thenReturn(autos);
        Autos resultado = autosService.save(autos);
        assertNotNull(resultado);
        assertEquals("Ford", resultado.getNombre());
        verify(autosRepository, times(1)).save(autos);


    }


    @Test
    public void testFindAllAutos() {
        // 1️⃣ Preparar datos de prueba
        Autos p1 = new Autos();
        p1.setId("1");
        p1.setNombre("Mazda");

        Autos p2 = new Autos();
        p2.setId("2");
        p2.setNombre("Nissan");

        List<Autos> listaAutos = Arrays.asList(p1, p2);

        when(AutosRepository.findAll()).thenReturn(listaAutos);

        List<Autos> resultado = AutosService.findAll();

        assertEquals(2, resultado.size());
        assertEquals("Mazda", resultado.get(0).getNombre());
        assertEquals("Nissan", resultado.get(1).getNombre());

        verify(pintorRepository, times(1)).findAll();
    }
    @Test
    void testActualizarAutos() {
        Autos AutosOriginal = new Autos();
        AutosOriginalOriginal.setId("1");
        AutosOriginalOriginal.setNombre("Ford");

        Autos Actualizado = new Autos();
        AutosOriginalActualizado.setNombre("Ford");

        when(autosRepository.findById("1")).thenReturn(Optional.of(autosOriginal));

        when(autosRepository.save(any(Autos.class))).thenAnswer(i -> i.getArgument(0));

        Autos resultado = autosService.update("1", autosActualizado);

        assertEquals("Ford", resultado.getNombre());

        verify(autosRepository).findById("1");
        verify(autosRepository).save(autosOriginal);
    }
    @Test
    public void testDeleteById() {
        autosService.deleteById("123");

        verify(autosRepository, times(1)).deleteById("123");
    }
}


