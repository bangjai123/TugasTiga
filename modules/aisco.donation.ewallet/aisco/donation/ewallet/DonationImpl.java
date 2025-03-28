package aisco.donation.ewallet;

import aisco.donation.core.DonationComponent;

public class DonationImpl extends DonationComponent {
    private String vendorName;
    private static List<DonationImpl> donationList = new ArrayList<>();
    
    public DonationImpl()
    {
        System.out.println("Donation via AISCO using e-wallet");
        donationList = new ArrayList<>();
    }

    public DonationImpl(String name, String email, String phone, int amount, String vendorName) {
        super(name, email, phone, amount, "E-Wallet");
        this.vendorName = vendorName;
    }

    public void getDonation() {
        for (DonationImpl donation : donationList) {
            System.out.println(donation);
        }
    }

    public void addDonation() {
        donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "Payku"));
        donationList.add(new DonationImpl("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "Dana"));
        donationList.add(new DonationImpl("Keren", "keren@jmail.com", "+62939 1234 0987", 670000, "jopay"));

    }

    @Override
    public String toString() {
        return "Donasi oleh " + name + ", melalui " + vendorName +
                " dengan nomor " + phone + " sebesar Rp " + amount;
    }
}
