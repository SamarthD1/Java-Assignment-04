class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    String getId() {
        return id;
    }

    String getDesc() {
        return desc;
    }

    int getQty() {
        return qty;
    }

    void setQty(int qty) {
        this.qty = qty;
    }

    double getUnitPrice() {
        return unitPrice;
    }

    void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    double getTotal() {
        return qty * unitPrice;
    }

    public String toString() {
        return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
    }

    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem("101", "Laptop", 2, 500.0);
        System.out.println(item);
        System.out.println("Total Price: " + item.getTotal());
    }
}
