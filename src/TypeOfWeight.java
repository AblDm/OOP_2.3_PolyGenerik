public enum TypeOfWeight {
    N1 ("С полной массой до 3,5"),
    N2 ("С полной массой свыше 3,5 и до 12 тонн"),
    N3 ("С полной массой свыше 12 тонн");
    private final String description;
    TypeOfWeight (String description){
        if (description==null|| description.isEmpty ()){
            this.description = "Данные не указаны";
        } else {
            this.description = description;
        }
    }

    public String getDescription() {
        return description;
    }


}
