package com.mendoza.delipizza.utils;

import lombok.Data;


public enum PaymentMethodEnum {
    CREDITO , DEBITO , MERCADO_PAGO;

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
