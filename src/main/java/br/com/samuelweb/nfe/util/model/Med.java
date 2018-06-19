package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.inf.portalfiscal.nfe.schema_4.nfe.TNFe;

import java.math.BigDecimal;

public class Med {

    @NfeCampo(tipo = String.class
            , id = "K01a", tag = "cProdANVISA"
            , tamanhoMinimo = 13, tamanhoMaximo = 13, ocorrencias = 1
            , descricao = NfeConsts.DSC_CPRODANVISA)
    private String cProdANVISA;

    @NfeCampo(tipo = BigDecimal.class
            , id = "K06", tag = "vPMC", decimais = 2, precisao = 15
            , tamanhoMinimo = 0, tamanhoMaximo = 15, ocorrencias = 1
            , descricao = NfeConsts.DSC_VPMC)
    private BigDecimal vpmc;

    public TNFe.InfNFe.Det.Prod.Med build() {
        TNFe.InfNFe.Det.Prod.Med med = new TNFe.InfNFe.Det.Prod.Med();
        med.setCProdANVISA(this.cProdANVISA);
        if (this.vpmc != null) {
            med.setVPMC(this.vpmc.toString());
        }
        return med;
    }

    public String getcProdANVISA() {
        return cProdANVISA;
    }

    public void setcProdANVISA(String cProdANVISA) {
        this.cProdANVISA = cProdANVISA;
    }

    public BigDecimal getVpmc() {
        return vpmc;
    }

    public void setVpmc(BigDecimal vpmc) {
        this.vpmc = vpmc;
    }
}
