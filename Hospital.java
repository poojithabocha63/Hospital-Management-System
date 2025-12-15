import java.util.Random;
import java.util.Scanner;

class Doctor {
    private String name;
    private String specialization;
    private double fee;

    Doctor(String name, String specialization, double fee) {
        this.name = name;
        this.specialization = specialization;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                ", Specialization: " + specialization +
                ", Fee: " + fee;
    }

}

class Disease {
    private String name;
    private String medicine;
    private double medicinePrice;

    Disease(String name, String medicine, double medicinePrice) {
        this.name = name;
        this.medicine = medicine;
        this.medicinePrice = medicinePrice;
    }

    public String getName() {
        return name;
    }

    public String getMedicine() {
        return medicine;
    }

    public double getMedicinePrice() {
        return medicinePrice;
    }
}

class Patient
{
    private long id;
    private String name;
    private int age;
    private String gender;

    Patient(long id, String name, int age, String gender)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }
}


class Hospital {
    static Scanner sc = new Scanner(System.in);

    static String historyPatientId = "";
    static String historyPatientName = "";
    static String historyRecord = "";

    // ========== COLORS ==========
    static final String RESET = "\033[0m";
    static final String RED = "\033[1;31m";
    static final String GREEN = "\033[1;32m";
    static final String YELLOW = "\033[1;33m";
    static final String BLUE = "\033[1;34m";
    static final String MAGENTA = "\033[1;35m";
    static final String CYAN = "\033[1;36m";
    static final String WHITE = "\033[1;37m";
    static final String PURPLE = "\u001B[35m";

    private static Disease displayGeneralPhysicianTreatments() {
        Disease disease = null;
        while (disease == null) {
            System.out.println(CYAN + "\n1. Fever\n2. Cold / Cough\n3. Headache\n4. Body Pain" + RESET);
            System.out.print(YELLOW + "Select a symptom: " + RESET);
            switch (sc.nextInt()) {
                case 1:
                    disease = new Disease("Fever", "Paracetamol / Fluids", 30);
                    break;
                case 2:
                    disease = new Disease("Cold / Cough", "Cough syrup / Decongestants", 25);
                    break;
                case 3:
                    disease = new Disease("Headache", "Paracetamol / Ibuprofen", 20);
                    break;
                case 4:
                    disease = new Disease("Body Pain", "Painkillers / Rest", 40);
                    break;
                default:
                    System.out.println(RED + "Invalid selection. Please select a valid symptom." + RESET);
            }
        }
        return disease;
    }

    private static Disease displayDermatologyTreatments() {
        Disease disease = null;
        while (disease == null) {
            System.out.println(CYAN + "\n1. Acne\n2. Eczema\n3. Psoriasis\n4. Fungal Infection" + RESET);
            System.out.print(YELLOW + "Select a symptom: " + RESET);
            switch (sc.nextInt()) {
                case 1:
                    disease = new Disease("Acne", "Topical creams / Antibiotics", 50);
                    break;
                case 2:
                    disease = new Disease("Eczema", "Moisturizers / Steroid creams", 60);
                    break;
                case 3:
                    disease = new Disease("Psoriasis", "Topical steroid / Vitamin D ointments", 80);
                    break;
                case 4:
                    disease = new Disease("Fungal Infection", "Antifungal creams / Oral antifungals", 40);
                    break;
                default:
                    System.out.println(RED + "Invalid selection. Please select a valid symptom." + RESET);
            }
        }
        return disease;
    }

    private static Disease displayDentistTreatments() {
        Disease disease = null;
        while (disease == null) {
            System.out.println(CYAN + "\n1. Tooth Pain\n2. Bleeding Gums\n3. Cavities (Tooth Decay)\n4. Mouth Ulcers" + RESET);
            System.out.print(YELLOW + "Select a symptom: " + RESET);
            switch (sc.nextInt()) {
                case 1:
                    disease = new Disease("Tooth Pain", "Paracetamol", 50);
                    break;
                case 2:
                    disease = new Disease("Bleeding Gums", "Mouthwashes", 100);
                    break;
                case 3:
                    disease = new Disease("Cavities", "Painkillers", 30);
                    break;
                case 4:
                    disease = new Disease("Mouth Ulcers", "Oral pain-relief gel", 50);
                    break;
                default:
                    System.out.println(RED + "Invalid selection. Please select a valid symptom." + RESET);
            }
        }
        return disease;
    }

    private static Disease displayCardiologistTreatments() {
        Disease disease = null;
        while (disease == null) {
            System.out.println(CYAN + "\n1. Chest Pain\n2. Shortness of Breath\n3. Fainting\n4. Sudden Breathlessness" + RESET);
            System.out.print(YELLOW + "Select a symptom: " + RESET);
            switch (sc.nextInt()) {
                case 1:
                    disease = new Disease("Chest Pain", "Nitroglycerin", 50);
                    break;
                case 2:
                    disease = new Disease("Shortness of Breath", "Salbutamol Inhaler", 100);
                    break;
                case 3:
                    disease = new Disease("Fainting", "Glucose", 30);
                    break;
                case 4:
                    disease = new Disease("Sudden Breathlessness", "Oxygen", 50);
                    break;
                default:
                    System.out.println(RED + "Invalid selection. Please select a valid symptom." + RESET);
            }
        }
        return disease;
    }

    private static Disease displayNeurologistTreatments() {
        Disease disease = null;
        while (disease == null) {
            System.out.println(CYAN + "\n1. Severe Headache\n2. Migraine\n3. Loss of Consciousness\n4. Muscle Weakness" + RESET);
            System.out.print(YELLOW + "Select a symptom: " + RESET);
            switch (sc.nextInt()) {
                case 1:
                    disease = new Disease("Severe Headache", "Painkillers", 50);
                    break;
                case 2:
                    disease = new Disease("Migraine", "Anti-nausea Drugs", 100);
                    break;
                case 3:
                    disease = new Disease("Loss of Consciousness", "Glucose", 30);
                    break;
                case 4:
                    disease = new Disease("Muscle Weakness", "Vitamins", 50);
                    break;
                default:
                    System.out.println(RED + "Invalid selection. Please select a valid symptom." + RESET);
            }
        }
        return disease;
    }

    private static Disease displayOrthopedicTreatments() {
        Disease disease = null;
        while (disease == null) {
            System.out.println(CYAN + "\n1. Bone Fracture\n2. Joint Pain\n3. Muscle Strain\n4. Back Pain" + RESET);
            System.out.print(YELLOW + "Select a symptom: " + RESET);
            switch (sc.nextInt()) {
                case 1:
                    disease = new Disease("Bone Fracture", "Immobilization / Painkillers", 200);
                    break;
                case 2:
                    disease = new Disease("Joint Pain", "NSAIDs / Physiotherapy", 100);
                    break;
                case 3:
                    disease = new Disease("Muscle Strain", "Painkillers / Rest", 80);
                    break;
                case 4:
                    disease = new Disease("Back Pain", "Painkillers / Physiotherapy", 120);
                    break;
                default:
                    System.out.println(RED + "Invalid selection. Please select a valid symptom." + RESET);
            }
        }
        return disease;
    }


    private static Disease displayGastroenterologyTreatments() {
        Disease disease = null;
        while (disease == null) {
            System.out.println(CYAN + "\n1. Acid Reflux\n2. Gastritis\n3. Constipation\n4. Diarrhea" + RESET);
            System.out.print(YELLOW + "Select a symptom: " + RESET);
            switch (sc.nextInt()) {
                case 1:
                    disease = new Disease("Acid Reflux", "Antacids / Proton Pump Inhibitors", 50);
                    break;
                case 2:
                    disease = new Disease("Gastritis", "Antacids / H2 Blockers", 70);
                    break;
                case 3:
                    disease = new Disease("Constipation", "Laxatives / Fiber Supplements", 30);
                    break;
                case 4:
                    disease = new Disease("Diarrhea", "Oral Rehydration Salts / Antibiotics if Infection", 40);
                    break;
                default:
                    System.out.println(RED + "Invalid selection. Please select a valid symptom." + RESET);
            }
        }
        return disease;
    }


    static String generateOTP() {
        Random r = new Random();
        return "" + (100000 + r.nextInt(900000));
    }

    static void showHistory() {
        if (historyPatientId.isEmpty()) {
            System.out.println(RED + "No history saved." + RESET);
            return;
        }

        System.out.println(CYAN + "\n============== PATIENT HISTORY ==============" + RESET);
        System.out.println(GREEN + "Patient ID  : " + historyPatientId);
        System.out.println("Name        : " + historyPatientName);
        System.out.println("Record      : " + historyRecord + RESET);
        System.out.println(CYAN + "==============================================" + RESET);
    }

    public static void main(String[] args) {

        System.out.println(GREEN +
                "  ______        _      ____  _____ _____ _________ _____ ________ ________ ______     ____  ____   ___    ______   _______ _____ _________    _      _____ \n"
                + CYAN +
                ".' ____ \\      / \\    |_   \\|_   _|_   _|  _   _  |_   _|  __   _|_   __  |_   _ `.  |_   ||   _|.'   `..' ____ \\ |_   __ \\_   _|  _   _  |  / \\    |_   _| \n"
                + MAGENTA +
                "| (___ \\_|    / _ \\     |   \\ | |   | | |_/ | | \\_| | | |_/  / /   | |_ \\_| | | `. \\   | |__| | /  .-.  \\ (___ \\_|  | |__) || | |_/ | | \\_| / _ \\     | | \n"
                + YELLOW +
                " _.____`.    / ___ \\    | |\\ \\| |   | |     | |     | |    .'.' _  |  _| _  | |  | |   |  __  | | |   | |_.____`.   |  ___/ | |     | |    / ___ \\    | |   _ \n"
                + CYAN +
                "| \\____) | _/ /   \\ \\_ _| |_\\   |_ _| |_   _| |_   _| |_ _/ /__/ |_| |__/ |_| |_.' /  _| |  | |_\\  `-'  / \\____) | _| |_   _| |_   _| |_ _/ /   \\ \\_ _| |__/ | \n"
                + WHITE +
                " \\______.'|____| |____|_____|\\____|_____| |_____| |_____|________|________|______.'  |____||____|`.___.' \\______.'|_____| |_____| |_____|____| |____|________| \n"
                + RESET
        );

        /*
              ______        _      ____  _____ _____ _________ _____ ________ ________ ______     ____  ____   ___    ______   _______ _____ _________    _      _____
            .' ____ \      / \    |_   \|_   _|_   _|  _   _  |_   _|  __   _|_   __  |_   _ `.  |_   ||   _|.'   `..' ____ \ |_   __ \_   _|  _   _  |  / \    |_   _|
            | (___ \_|    / _ \     |   \ | |   | | |_/ | | \_| | | |_/  / /   | |_ \_| | | `. \   | |__| | /  .-.  \ (___ \_|  | |__) || | |_/ | | \_| / _ \     | |
             _.____`.    / ___ \    | |\ \| |   | |     | |     | |    .'.' _  |  _| _  | |  | |   |  __  | | |   | |_.____`.   |  ___/ | |     | |    / ___ \    | |   _
            | \____) | _/ /   \ \_ _| |_\   |_ _| |_   _| |_   _| |_ _/ /__/ |_| |__/ |_| |_.' /  _| |  | |_\  `-'  / \____) | _| |_   _| |_   _| |_ _/ /   \ \_ _| |__/ |
             \______.'|____| |____|_____|\____|_____| |_____| |_____|________|________|______.'  |____||____|`.___.' \______.'|_____| |_____| |_____|____| |____|________|
         */



        System.out.println(GREEN + "-------- WELCOME TO SANITIZED SQUAD HOSPITAL ------------" + RESET);
        System.out.println(CYAN + "--------- ENTER PATIENT DETAILS -------" + RESET);

        System.out.print(YELLOW + "Enter Patient Name: " + RESET);
        String name = sc.next();

        System.out.print(YELLOW + "Enter Patient Age: " + RESET);
        int age = sc.nextInt();

        String gender = "";
        int retry = 0;

        while(gender.equals("") || 
        !(gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f"))) {
            if(retry > 0) {
                System.out.println("Enter a valid gender");
            }
            System.out.print(YELLOW + "Gender (M/F): " + RESET);
            gender = sc.next();
            retry++;
        }

        Patient patientobj = new Patient(System.currentTimeMillis(), name, age, gender);

        System.out.println(MAGENTA + "\n------- Select Specialization --------" + RESET);
        int specialization = 10;
        Doctor doctor = null;
        while (specialization > 7 || specialization < 1) {
            System.out.println(CYAN + "1. General Physician \n2. Dermatology \n3. Dentist \n4. Cardiologist \n5. Neurologist \n6. Orthopedics \n7. Gastroenterology" + RESET);
            System.out.print(YELLOW + "Enter choice: " + RESET);
            specialization = sc.nextInt();

            switch (specialization) {
                case 1:
                    doctor = new Doctor("Dr.Suresh", "General Physician", 200);
                    break;
                case 2:
                    doctor = new Doctor("Dr.Anita", "Dermatology", 300);
                    break;
                case 3:
                    doctor = new Doctor("Dr.Priya", "Dentist", 200);
                    break;
                case 4:
                    doctor = new Doctor("Dr.Arun", "Cardiologist", 300);
                    break;
                case 5:
                    doctor = new Doctor("Dr.Jack", "Neurologist", 400);
                    break;
                case 6:
                    doctor = new Doctor("Dr.Dhanush", "Orthopedics", 400);
                    break;
                case 7:
                    doctor = new Doctor("Dr.Pranitha", "Gastroenterology", 300);
                    break;
                default:
                    System.out.println(RED + "Invalid Selection. Please Select valid Option" + RESET);
            }
        }

        System.out.println(GREEN + "------ AVAILABLE DOCTORS ------" + RESET);
        System.out.println(CYAN + doctor + RESET);

        System.out.println(MAGENTA + "\n------- Select Symptoms --------" + RESET);
        Disease disease = null;
        switch (specialization) {
            case 1:
                disease = displayGeneralPhysicianTreatments();
                break;
            case 2:
                disease = displayDermatologyTreatments();
                break;
            case 3:
                disease = displayDentistTreatments();
                break;
            case 4:
                disease = displayCardiologistTreatments();
                break;
            case 5:
                disease = displayNeurologistTreatments();
                break;
            case 6:
                disease = displayOrthopedicTreatments();
                break;
            case 7:
                disease = displayGastroenterologyTreatments();
                break;
        }

        System.out.println(CYAN + "\n----- Medication Details -----" + RESET);
        System.out.println(GREEN + "Symptom Name      : " + YELLOW + disease.getName() + RESET);
        System.out.println(GREEN + "Recommended Medicine: " + YELLOW + disease.getMedicine() + RESET);
        System.out.println(GREEN + "Medicine Fee      : " + YELLOW + disease.getMedicinePrice() + " Rupees" + RESET);

        // Lab tests
        System.out.println(MAGENTA + "\n------------------ LAB TESTS ------------------" + RESET);
        System.out.println(CYAN + "1. Yes");
        System.out.println("2. No" + RESET);
        System.out.print(YELLOW + "Add a lab test? : " + RESET);
        int wantTest = sc.nextInt();
        sc.nextLine();

        String testName = "None";
        double testPrice = 0.0;

        if (wantTest == 1) {
            System.out.println(CYAN + "\n1. Blood Test - Rs. 500");
            System.out.println("2. ECG - Rs. 800");
            System.out.println("3. X-Ray - Rs. 400" + RESET);
            System.out.print(YELLOW + "Enter test: " + RESET);
            int t = sc.nextInt();
            sc.nextLine();

            if (t == 1) {
                testName = "Blood Test";
                testPrice = 500;
            } else if (t == 2) {
                testName = "ECG";
                testPrice = 800;
            } else if (t == 3) {
                testName = "X-Ray";
                testPrice = 400;
            } else System.out.println(RED + "Invalid test. No test added." + RESET);
        }

        // Appointment time
        System.out.println(MAGENTA + "\n------------------ APPOINTMENT TIME ------------------" + RESET);
        System.out.println(CYAN + "1. 10:00 AM");
        System.out.println("2. 12:00 PM");
        System.out.println("3. 03:00 PM");
        System.out.println("4. 06:00 PM" + RESET);
        System.out.print(YELLOW + "Enter choice: " + RESET);
        int slot = sc.nextInt();
        sc.nextLine();

        String apptTime = (slot == 1) ? "10:00 AM" :
                (slot == 2) ? "12:00 PM" :
                        (slot == 3) ? "03:00 PM" :
                                (slot == 4) ? "06:00 PM" : "Walk-in";

        // Billing
        double doctorFee = 300.0;
        double subtotal = doctorFee + disease.getMedicinePrice() + testPrice;
        double taxAmount = Math.round(subtotal * 0.18 * 100.0) / 100.0;
        double totalAmount = subtotal + taxAmount;

        // COST ESTIMATE
        System.out.println(CYAN + "\n================= ESTIMATED COST =================" + RESET);
        System.out.println(GREEN + "Doctor Fee        : Rs. " + doctorFee);
        System.out.println("Medicine (" + disease.getMedicine() + ") : Rs. " + disease.getMedicinePrice());
        System.out.println("Lab Test (" + testName + ") : Rs. " + testPrice);
        System.out.println("Subtotal          : Rs. " + subtotal);
        System.out.println("Tax (18%)         : Rs. " + taxAmount);
        System.out.println("TOTAL PAYABLE     : Rs. " + totalAmount + RESET);
        System.out.println(CYAN + "==================================================" + RESET);

        // Proceed?
        System.out.print(YELLOW + "\nProceed to pay? (yes/no): " + RESET);
        String proceed = sc.nextLine();
        if (!proceed.equalsIgnoreCase("yes")) {
            System.out.println(RED + "Payment cancelled." + RESET);
            return;
        }

        // OTP
        String otp = generateOTP();
        System.out.println(GREEN + "OTP Sent: " + otp + RESET);
        System.out.print(YELLOW + "Enter OTP: " + RESET);
        String entered = sc.nextLine();

        if (!entered.equals(otp)) {
            System.out.println(RED + "Invalid OTP. Payment failed." + RESET);
            return;
        }

        // Store history
        String billId = "BILL" + System.currentTimeMillis();
        String patientId = "P" + patientobj.getId();
        historyPatientId = patientId;
        historyPatientName = name;

        historyRecord = "BillID: " + billId +
                " | Doctor: " + doctor.getName() +
                " | Disease: " + disease +
                " | Test: " + testName +
                " | TotalPaid: Rs." + totalAmount;

        // Final bill
        System.out.println(GREEN + "\n=============== PAYMENT SUCCESSFUL ===============" + RESET);
        System.out.println(YELLOW + "Bill ID          : " + billId);
        System.out.println("Patient ID       : " + patientId);
        System.out.println("Patient Name     : " + name);
        System.out.println("Doctor           : " + doctor.getName());
        System.out.println("Appointment Time : " + apptTime);
        System.out.println("Disease          : " + disease);
        System.out.println("Medicine         : " + disease.getMedicine() + " (Rs." + disease.getMedicinePrice() + ")");
        System.out.println("Lab Test         : " + testName + " (Rs." + testPrice + ")");
        System.out.println("Total Paid       : Rs. " + totalAmount + RESET);
        System.out.println(GREEN + "==================================================" + RESET);

        // Ask history
        System.out.print(YELLOW + "\nView saved patient history? (yes/no): " + RESET);
        String view = sc.nextLine();
        if (view.equalsIgnoreCase("yes")) showHistory();

        System.out.println(CYAN + "\nThank you — Get Well Soon!" + RESET);
    }
}