package br.com.samuelweb.nfe.util.validators.impl;

import br.com.samuelweb.nfe.util.validators.RetornoValidar;
import br.com.samuelweb.nfe.util.validators.ValidadorCampo;

public class ValidarDIRE implements ValidadorCampo<String> {
    @Override
    public RetornoValidar validar(String valor) {
        //todo implementar
        return new RetornoValidarImpl(true);
    }
}
