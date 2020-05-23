package com.prova.model;

public enum Status {

    RUMOR("Rumor"),
    PLANEJADO("Planejado"),
    EM_PRODUCAO("Em produção"),
    POS_PRODUCAO("Pós-produção"),
    LANCADO("Lançado"),
    CANCELADO("Cancelado");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public static Status getStatus(String descricao){
        switch (descricao){
            case "Rumored":
                return RUMOR;
            case "Planned":
                return PLANEJADO;
            case "In Production":
                return EM_PRODUCAO;
            case "Post Production":
                return POS_PRODUCAO;
            case "Released":
                return LANCADO;
            case "Canceled":
                return CANCELADO;
            default:
                return null;
        }
    }
}