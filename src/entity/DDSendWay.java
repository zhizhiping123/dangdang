package entity;

import java.io.Serializable;

public class DDSendWay implements Serializable {
    private Integer id;

    private Boolean isClose;

    private String sendWay;

    private String sendDesc;

    private Double sendFee;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsClose() {
        return isClose;
    }

    public void setIsClose(Boolean isClose) {
        this.isClose = isClose;
    }

    public String getSendWay() {
        return sendWay;
    }

    public void setSendWay(String sendWay) {
        this.sendWay = sendWay == null ? null : sendWay.trim();
    }

    public String getSendDesc() {
        return sendDesc;
    }

    public void setSendDesc(String sendDesc) {
        this.sendDesc = sendDesc == null ? null : sendDesc.trim();
    }

    public Double getSendFee() {
        return sendFee;
    }

    public void setSendFee(Double sendFee) {
        this.sendFee = sendFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", isClose=").append(isClose);
        sb.append(", sendWay=").append(sendWay);
        sb.append(", sendDesc=").append(sendDesc);
        sb.append(", sendFee=").append(sendFee);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}