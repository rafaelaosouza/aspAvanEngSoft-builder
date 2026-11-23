package imovel;

import java.util.Date;

public class ImovelBuilder {

    private Imovel imovel;

    public ImovelBuilder() {
        imovel = new Imovel();
    }

    public Imovel build() {
        if (imovel.getCodigo() == 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (imovel.getTitulo().equals("")) {
            throw new IllegalArgumentException("Título inválido");
        }
        return imovel;
    }

    public ImovelBuilder setCodigo(int codigo) {
        imovel.setCodigo(codigo);
        return this;
    }

    public ImovelBuilder setTitulo(String titulo) {
        imovel.setTitulo(titulo);
        return this;
    }

    public ImovelBuilder setDataCadastro(Date dataCadastro) {
        imovel.setDataCadastro(dataCadastro);
        return this;
    }

    public ImovelBuilder setTipo(String tipo) {
        imovel.setTipo(tipo);
        return this;
    }

    public ImovelBuilder setFinalidade(String finalidade) {
        imovel.setFinalidade(finalidade);
        return this;
    }

    public ImovelBuilder setProprietario(String proprietario) {
        imovel.setProprietario(proprietario);
        return this;
    }

    public ImovelBuilder setCorretor(String corretor) {
        imovel.setCorretor(corretor);
        return this;
    }

    public ImovelBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        imovel.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public ImovelBuilder setEnderecoNumero(int enderecoNumero) {
        imovel.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public ImovelBuilder setEnderecoComplemento(String enderecoComplemento) {
        imovel.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public ImovelBuilder setEnderecoBairro(String enderecoBairro) {
        imovel.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public ImovelBuilder setEnderecoCidade(String enderecoCidade) {
        imovel.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public ImovelBuilder setEnderecoUF(String enderecoUF) {
        imovel.setEnderecoUF(enderecoUF);
        return this;
    }

    public ImovelBuilder setCep(String cep) {
        imovel.setCep(cep);
        return this;
    }

    public ImovelBuilder setQuartos(int quartos) {
        imovel.setQuartos(quartos);
        return this;
    }

    public ImovelBuilder setArea(float area) {
        imovel.setArea(area);
        return this;
    }

    public ImovelBuilder setValor(float valor) {
        imovel.setValor(valor);
        return this;
    }

}
