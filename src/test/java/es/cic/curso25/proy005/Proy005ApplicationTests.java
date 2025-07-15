package es.cic.curso25.proy005;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class Proy005ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testTelefonoDelete() throws Exception {

		mockMvc.perform(delete("/telefono/4"))
		.andExpect(status().isOk()).andReturn();

	}

	@Test
	void testLista(){
		ArrayList miLista= new ArrayList();
		miLista.add("Hola");

		String contenido = (String) miLista.get(0);

		ArrayList<String> miSegundaLista = new ArrayList<>();
		miSegundaLista.add("mi Mensaje");
		
		String mensajeOriginal= miSegundaLista.get(0);
	}

}
