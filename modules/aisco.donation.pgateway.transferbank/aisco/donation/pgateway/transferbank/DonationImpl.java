package aisco.donation.pgateway.transferbank;

import aisco.donation.pgateway.DonationComponent;
import java.util.ArrayList;
import java.util.List;

public class DonationImpl extends DonationComponent {
    private String sourceBank;
    private String destinationBank;
    private String accountNumberSource;
    private String accountNumberDestination;
    private static List<DonationImpl> donationList = new ArrayList<>();

    public DonationImpl() {
        System.out.println("Donation via AISCO using bank transfer");
        donationList = new ArrayList<>();
    }

    public DonationImpl(String name, String email, String phone, int amount, 
                        String sourceBank, String destinationBank, 
                        String accountNumberSource, String accountNumberDestination) {
        super(name, email, phone, amount, "Bank Transfer");
        this.sourceBank = sourceBank;
        this.destinationBank = destinationBank;
        this.accountNumberSource = accountNumberSource;
        this.accountNumberDestination = accountNumberDestination;
    }

    public void getDonation() {
        for (DonationImpl donation : donationList) {
            System.out.println(donation);
        }
    }

    public void addDonation() {
        donationList.add(new DonationImpl("Faris", "faris@jmail.com", "+62888 9988 7766", 
                                          2000000, "Bank A", "Bank B", "11223344", "55667788"));
        donationList.add(new DonationImpl("Gita", "gita@jmail.com", "+62855 1122 3344", 
                                          1500000, "Bank C", "Bank D", "22334455", "66778899"));
        donationList.add(new DonationImpl("Bambang", "bambang@jmail.com", "+62876 9988 0099", 
                1500000, "Bank D", "Bank F", "22338877", "88997766"));
    }

    @Override
    public String toString() {
        return "Donasi oleh " + name + ", melalui transfer bank dari " + sourceBank +
                " ke " + destinationBank + " dengan nomor rekening " + accountNumberSource +
                " ke " + accountNumberDestination + " sebesar Rp " + amount;
    }
}
