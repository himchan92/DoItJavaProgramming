package part2.encapsulation;

public class PhoneStore {
    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;
    }

    public Phone sellPhone(String model, double budget) {
        String phoneModel = phone.getModel();

        if(model.equals(phoneModel) && budget >= phone.getPrice()) {
            registerPayment();
            discountPromotion();
            saveData();
            return phone;
        }
        else {
            return null;
        }
    }

    private void saveData() {
        System.out.println("대리점 데이터 저장 후 새폰으로 이동");
    }

    private void discountPromotion() {
        System.out.println("대리점 프로모션 할인");
    }

    private void registerPayment() {
        System.out.println("대리점 등록");
    }
}
