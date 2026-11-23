package imovel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImovelBuilderTest {

    @Test
    void deveRetornarExcecaoParaImovelSemCodigo() {
        try {
            ImovelBuilder imovelBuilder = new ImovelBuilder();
            Imovel imovel = imovelBuilder
                    .setTitulo("Apartamento 2 quartos no Centro")
                    .setCorretor("Carla Mendes")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaImovelSemTitulo() {
        try {
            ImovelBuilder imovelBuilder = new ImovelBuilder();
            Imovel imovel = imovelBuilder
                    .setCodigo(1)
                    .setCorretor("Carla Mendes")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Título inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarImovelValido() {
        ImovelBuilder imovelBuilder = new ImovelBuilder();
        Imovel imovel = imovelBuilder
                .setCodigo(1)
                .setTitulo("Apartamento 2 quartos no Centro")
                .setCorretor("Carla Mendes")
                .build();

        assertNotNull(imovel);
    }

    @Test
    void deveRetornarExcecaoParaImovelComTituloVazio() {
        try {
            ImovelBuilder imovelBuilder = new ImovelBuilder();
            Imovel imovel = imovelBuilder
                    .setCodigo(1)
                    .setTitulo("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Título inválido", e.getMessage());
        }
    }

    @Test
    void deveManterValoresInformadosNoImovel() {
        Imovel imovel = new ImovelBuilder()
                .setCodigo(10)
                .setTitulo("Casa com quintal")
                .setTipo("Casa")
                .setFinalidade("Venda")
                .setEnderecoCidade("Juiz de Fora")
                .setEnderecoUF("MG")
                .setQuartos(3)
                .setArea(120.5f)
                .setValor(450000.0f)
                .build();

        assertEquals(10, imovel.getCodigo());
        assertEquals("Casa com quintal", imovel.getTitulo());
        assertEquals("Casa", imovel.getTipo());
        assertEquals("Venda", imovel.getFinalidade());
        assertEquals("Juiz de Fora", imovel.getEnderecoCidade());
        assertEquals("MG", imovel.getEnderecoUF());
        assertEquals(3, imovel.getQuartos());
        assertEquals(120.5f, imovel.getArea());
        assertEquals(450000.0f, imovel.getValor());
    }

    @Test
    void deveDeixarCamposNaoInformadosVazios() {
        Imovel imovel = new ImovelBuilder()
                .setCodigo(1)
                .setTitulo("Sala comercial")
                .build();

        assertNull(imovel.getCorretor());
        assertNull(imovel.getDataCadastro());
        assertEquals(0, imovel.getQuartos());
    }
}
