package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private String id;
    private String type;
    private String name;
    private BigDecimal price;
    private Date snapshotDate;

    public Product(String id, String type, String name, BigDecimal price, Date snapshotDate) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
        this.snapshotDate = snapshotDate;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setSnapshotDate(Date snapshotDate) {
        this.snapshotDate = snapshotDate;
    }
}
