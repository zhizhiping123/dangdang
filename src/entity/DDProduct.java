package entity;

import java.io.Serializable;

public class DDProduct implements Serializable {
    private Integer id;

    private Integer categoryId;

    private String productName;

    private String description;

    private Long addTime;

    private Double fixedPrice;

    private Double dangPrice;

    private String keywords;

    private Integer hasDeleted;

    private String productPic;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }

    public Double getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public Double getDangPrice() {
        return dangPrice;
    }

    public void setDangPrice(Double dangPrice) {
        this.dangPrice = dangPrice;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Integer getHasDeleted() {
        return hasDeleted;
    }

    public void setHasDeleted(Integer hasDeleted) {
        this.hasDeleted = hasDeleted;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", productName=").append(productName);
        sb.append(", description=").append(description);
        sb.append(", addTime=").append(addTime);
        sb.append(", fixedPrice=").append(fixedPrice);
        sb.append(", dangPrice=").append(dangPrice);
        sb.append(", keywords=").append(keywords);
        sb.append(", hasDeleted=").append(hasDeleted);
        sb.append(", productPic=").append(productPic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}