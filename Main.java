import src.model.*;


import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Product> products;

    public static void main(String[] args) {
        products=new ArrayList<>();

        Category category =new Category(1,"Áo sơ mi");

        Property color=new Property(1,"COLOR");
        Property size=new Property(2,"SIZE");
        Value red=new Value(1,"RED");
        Value black=new Value(2,"BLACK");
        Value xl=new Value(3,"XL");
        Value s=new Value(4,"S");
        Value m=new Value(5,"M");
        color.addValue(red);
        color.addValue(black);
        size.addValue(xl);
        size.addValue(m);
        size.addValue(s);


        Product product=new Product();
        product.setCategory(category);
        product.setName("Áo sơ mi nam");
        product.setId(1);
        product.setPrice(100);
        product.addProperty(size);
        product.addProperty(color);

        Product product2=new Product();
        product2.setCategory(category);
        product2.setName("Áo sơ mi nữ");
        product2.setId(2);
        product2.setPrice(200);
        product2.addProperty(size);
        product2.addProperty(color);
        products.add(product);
        products.add(product2);
        //Xem danh sách sản phẩm
        getAllProduct();
        //Tạo hóa đơn
        //Giả sử khách hàng mua 1 áo sơ mi nam và 2 áo sơ mi nữ
        Order order=new Order();
        order.setId(1);
        order.setCreateAt(Date.from(Instant.now()));

        OrderItem orderItem=new OrderItem(1);
        orderItem.setProduct(product);
        orderItem.setQuantity(1);
        orderItem.calcTotal();
        order.addOrderItem(orderItem);

        OrderItem orderItem1=new OrderItem(2);
        orderItem1.setProduct(product2);
        orderItem1.setQuantity(2);
        orderItem1.calcTotal();
        order.addOrderItem(orderItem1);

        order.calcTotal();

        System.out.println("----------Order------------");
        System.out.println(order);








    }

    public static void getAllProduct(){
        products.forEach(System.out::println);
    }


}
