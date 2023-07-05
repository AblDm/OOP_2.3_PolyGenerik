public enum TypeOfCapacity {
    ESPECIALLY_SMALL("До 10 мест"),
    SMALL("До 25 мест"),
    MIDDLE ("40-50"),
    BIG ("60-80"),
    ESPECIALLY_BIG ("100-120");

    private final String description;

    TypeOfCapacity (String description){
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
