package hello.itemservice.domain.item;

public enum ItemType {

    BOOk("도서"), FOOD("음식"), ETC("기타");

    private final String description;
    //위 품목에 대한 설명

    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
