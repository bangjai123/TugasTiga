package aisco.donation.pgateway.credit;

import aisco.donation.pgateway.DonationComponent;
import java.util.ArrayList;
import java.util.List;

public class DonationImpl extends DonationComponent {
    private String accountNumber;
    private String cvv;
    private String expiryDate;
    private static List<DonationImpl> donationList = new ArrayList<>();
    
    public DonationImpl() {
        System.out.println("Donation via AISCO using credit card");
        donationList = new ArrayList<>();
    }
    
    public DonationImpl(String name, String email, String phone, int amount, String accountNumber, String cvv, String expiryDate) {
        super(name, email, phone, amount, "Credit Card");
        this.accountNumber = accountNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }
    
    public void getDonation() {
        for (DonationImpl donation : donationList) {
            System.out.println(donation);
        }
    }
    
    public void addDonation() {
        donationList.add(new DonationImpl("Budi", "budi@jmail.com", "+62878 1122 3344", 1000000, "1234567890", "123", "12/27"));
        donationList.add(new DonationImpl("Citra", "citra@jmail.com", "+62821 5566 7788", 750000, "0987654321", "456", "08/26"));
        donationList.add(new DonationImpl("Jajang", "jajang@jmail.com", "+62812 4477 9900", 800000, "0987456123", "789", "09/15"));
    }
    
    @Override
    public String toString() {
        return "Donasi oleh " + name + ", melalui kartu kredit dengan nomor " + accountNumber +
                " sebesar Rp " + amount;
    }
}
