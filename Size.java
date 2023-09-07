public enum Size {
    SMALL("mały"),MEDIUM("średni"),LARGE("duży"),XLARGE("bardzo duży");

    private final String description;
    private Size(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
}
