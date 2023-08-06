package hello.itemservice.domain.item;

import lombok.Data;

//@Getter @Setter
@Data // 사용에 주의 필요, 권장하진 않음! 그러나, 실습이니까..
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
