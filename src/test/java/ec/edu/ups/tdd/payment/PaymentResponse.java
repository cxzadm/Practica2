package ec.edu.ups.tdd.payment;

public class PaymentResponse {
    enum PaymentStatus{
        OK,ERROR;

    }
    private PaymentStatus status;

    PaymentResponse(PaymentStatus status){
        this.status=status;

    }
    public PaymentStatus getStatus(){
        return status;
    }
}