package top.ray.orderservice.status;

/**
 * @author RAY
 */
public enum OrderStatus {
    /**
     * 待支付
     */
    PENDING,
    /**
     * 处理中
     */
    PROCESSING,
    /**
     * 已完成
     */
    COMPLETED,
    /**
     * 已取消
     */
    CANCELLED
}