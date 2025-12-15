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

/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

class LabTests {

    static Scanner sc = new Scanner(System.in);

    static final String RESET = "\033[0m";
    static final String RED = "\033[1;31m";
    static final String YELLOW = "\033[1;33m";

    static void generalPhysicianTests() {
        System.out.println("\n--- General Physician Lab Tests ---");
        System.out.println();
        System.out.println("1. Blood Test (CBC)          - Rs. 500");
        System.out.println(
                "Blood Test (CBC) - Measures red cells, white cells, and platelets to detect infection or anemia.");
        System.out.println();
        System.out.println("2. Blood Sugar Test          - Rs. 200");
        System.out.println("Blood Sugar Test - Checks glucose levels to diagnose diabetes or hypoglycemia.");
        System.out.println();
        System.out.println("3. Urine Test                - Rs. 150");
        System.out.println("Urine Test - Identifies infections, kidney problems, and metabolic disorders.");
        System.out.println();
        System.out.println("4. Dengue / Malaria Test     - Rs. 800");
        System.out.println("Dengue / Malaria Test - Detects mosquito-borne infections in patients with fever.");
        System.out.println();
        System.out.println("5. Thyroid Test              - Rs. 600");
        System.out.println("Thyroid Test - Evaluates thyroid hormone levels affecting metabolism and energy.");
        System.out.println();

        String testName = "None";
        double testPrice = 0.0;
        System.out.print(YELLOW + "Enter test: " + RESET);
        int t = sc.nextInt();
        sc.nextLine();

        if (t == 1) {
            testName = "Blood Test (CBC)";
            testPrice = 500;
            // System.out.println("Blood Test (CBC) - Measures red cells, white cells, and
            // platelets to detect infection or anemia.");
        } else if (t == 2) {
            testName = "Blood Sugar Test";
            testPrice = 200;
            // System.out.println("Blood Sugar Test - Checks glucose levels to diagnose
            // diabetes or hypoglycemia.");
        } else if (t == 3) {
            testName = "Urine Test";
            testPrice = 150;
            // System.out.println("Urine Test - Identifies infections, kidney problems, and
            // metabolic disorders.");
        } else if (t == 4) {
            testName = "Dengue / Malaria Test";
            testPrice = 800;
            // System.out.println("Dengue / Malaria Test - Detects mosquito-borne infections
            // in patients with fever.");
        } else if (t == 5) {
            testName = "Thyroid Test";
            testPrice = 600;
            // System.out.println("Thyroid Test - Evaluates thyroid hormone levels affecting
            // metabolism and energy.");
        } else
            System.out.println(RED + "Invalid test. No test added." + RESET);
    }

    static void dermatologyTests() {
        System.out.println("\n--- Dermatology Lab Tests ---");
        System.out.println();
        System.out.println("1. Skin Biopsy               - Rs. 1500");
        System.out.println("Skin Biopsy - Examines skin tissue to diagnose infections, tumors, or skin disorders.");
        System.out.println();
        System.out.println("2. Allergy Test              - Rs. 1200");
        System.out.println("Allergy Test - Identifies substances causing skin allergies or reactions.");
        System.out.println();
        System.out.println("3. Fungal Culture Test       - Rs. 700");
        System.out.println("Fungal Culture Test - Detects fungal infections of skin, hair, or nails.");
        System.out.println();
        System.out.println("4. Patch Test                - Rs. 900");
        System.out.println("Patch Test - Determines the cause of contact dermatitis or skin irritation.");
        System.out.println();
        System.out.println("5. Blood Test (Infection)    - Rs. 500");
        System.out.println("Blood Test (Infection) - Checks for infection or inflammation related to skin issues.");
        System.out.println();

        String testName = "None";
        double testPrice = 0.0;
        System.out.print(YELLOW + "Enter test: " + RESET);
        int t = sc.nextInt();
        sc.nextLine();

        if (t == 1) {
            testName = "Skin Biopsy";
            testPrice = 1500;
            // System.out.println("Skin Biopsy – Examines skin tissue to diagnose
            // infections, tumors, or skin disorders.");
        } else if (t == 2) {
            testName = "Allergy Test";
            testPrice = 1200;
            // System.out.println("Allergy Test – Identifies substances causing skin
            // allergies or reactions.");
        } else if (t == 3) {
            testName = "Fungal Culture Test";
            testPrice = 700;
            // System.out.println("Fungal Culture Test – Detects fungal infections of skin,
            // hair, or nails.");
        } else if (t == 4) {
            testName = "Patch Test";
            testPrice = 900;
            // System.out.println("Patch Test – Determines the cause of contact dermatitis
            // or skin irritation.");
        } else if (t == 5) {
            testName = "Blood Test (Infection)";
            testPrice = 500;
            // System.out.println("Blood Test (Infection) – Checks for infection or
            // inflammation related to skin issues.");
        } else
            System.out.println(RED + "Invalid test. No test added." + RESET);
    }

    static void dentistTests() {
        System.out.println("\n--- Dentist Lab Tests ---");
        System.out.println();
        System.out.println("1. Dental X-Ray              - Rs. 300");
        System.out.println("Dental X-Ray - Detects cavities, bone loss, and hidden dental problems.");
        System.out.println();
        System.out.println("2. OPG (Orthopantomogram)    - Rs. 1000");
        System.out.println("OPG (Orthopantomogram) - Provides a full panoramic view of teeth and jaw.");
        System.out.println();
        System.out.println("3. Pulp Vitality Test        - Rs. 400");
        System.out.println("Pulp Vitality Test - Checks whether a tooth nerve is alive or damaged.");
        System.out.println();
        System.out.println("4. Bite-wing X-Ray           - Rs. 350");
        System.out.println("Bite-wing X-Ray - Identifies tooth decay between teeth and gum issues.");
        System.out.println();
        System.out.println("5. Blood Test (Pre-surgery)  - Rs. 600");
        System.out.println("Blood Test (Pre-surgery) - Ensures patient safety before dental procedures.");
        System.out.println();

        String testName = "None";
        double testPrice = 0.0;
        System.out.print(YELLOW + "Enter test: " + RESET);
        int t = sc.nextInt();
        sc.nextLine();

        if (t == 1) {
            testName = "Dental X-Ray";
            testPrice = 300;
            // System.out.println("Dental X-Ray - Detects cavities, bone loss, and hidden
            // dental problems.");
        } else if (t == 2) {
            testName = "OPG (Orthopantomogram)";
            testPrice = 1000;
            // System.out.println("OPG (Orthopantomogram) - Provides a full panoramic view
            // of teeth and jaw.");
        } else if (t == 3) {
            testName = "Pulp Vitality Test";
            testPrice = 400;
            // System.out.println("Pulp Vitality Test - Checks whether a tooth nerve is
            // alive or damaged.");
        } else if (t == 4) {
            testName = "Bite-wing X-Ray";
            testPrice = 350;
            // System.out.println("Bite-wing X-Ray - Identifies tooth decay between teeth
            // and gum issues.");
        } else if (t == 5) {
            testName = "Blood Test (Pre-surgery)";
            testPrice = 600;
            // System.out.println("Blood Test (Pre-surgery) - Ensures patient safety before
            // dental procedures.");
        } else
            System.out.println(RED + "Invalid test. No test added." + RESET);
    }

    static void cardiologistTests() {
        System.out.println("\n--- Cardiologist Lab Tests ---");
        System.out.println();
        System.out.println("1. ECG                       - Rs. 500");
        System.out.println("ECG (Electrocardiogram) - Records heart’s electrical activity to detect abnormalities.");
        System.out.println();
        System.out.println("2. Echocardiogram (ECHO)     - Rs. 2000");
        System.out.println("Echocardiogram (ECHO) - Uses ultrasound to visualize heart structure and function.");
        System.out.println();
        System.out.println("3. Treadmill Test (TMT)      - Rs. 2500");
        System.out.println("Treadmill Test (TMT) - Assesses heart performance during physical stress.");
        System.out.println();
        System.out.println("4. Blood Pressure Test       - Rs. 150");
        System.out.println("Blood Pressure Test - Measures force of blood against artery walls.");
        System.out.println();
        System.out.println("5. Lipid Profile             - Rs. 800");
        System.out.println("Lipid Profile - Checks cholesterol levels linked to heart disease risk.");
        System.out.println();

        String testName = "None";
        double testPrice = 0.0;
        System.out.print(YELLOW + "Enter test: " + RESET);
        int t = sc.nextInt();
        sc.nextLine();

        if (t == 1) {
            testName = "ECG";
            testPrice = 500;
            // System.out.println("ECG (Electrocardiogram) - Records heart’s electrical
            // activity to detect abnormalities.");
        } else if (t == 2) {
            testName = "Echocardiogram (ECHO)";
            testPrice = 2000;
            // System.out.println("Echocardiogram (ECHO) - Uses ultrasound to visualize
            // heart structure and function.");
        } else if (t == 3) {
            testName = "Treadmill Test (TMT)";
            testPrice = 2500;
            // System.out.println("Treadmill Test (TMT) - Assesses heart performance during
            // physical stress.");
        } else if (t == 4) {
            testName = "Blood Pressure Test";
            testPrice = 150;
            // System.out.println("Blood Pressure Test - Measures force of blood against
            // artery walls.");
        } else if (t == 5) {
            testName = "Lipid Profile";
            testPrice = 800;
            // System.out.println("Lipid Profile - Checks cholesterol levels linked to heart
            // disease risk.");
        } else
            System.out.println(RED + "Invalid test. No test added." + RESET);
    }

    static void neurologistTests() {
        System.out.println("\n--- Neurologist Lab Tests ---");
        System.out.println();
        System.out.println("1. EEG                       - Rs. 1800");
        System.out.println("EEG (Electroencephalogram) - Records brain electrical activity to detect seizures.");
        System.out.println();
        System.out.println("2. MRI Brain                 - Rs. 5000");
        System.out.println("MRI Brain - Produces detailed images of the brain to detect disorders.");
        System.out.println();
        System.out.println("3. CT Scan                   - Rs. 3500");
        System.out.println("CT Scan - Uses X-rays to detect brain injury, bleeding, or tumors.");
        System.out.println();
        System.out.println("4. Nerve Conduction Test     - Rs. 2500");
        System.out.println("Nerve Conduction Test (NCV) - Measures nerve signal speed to diagnose nerve damage.");
        System.out.println();
        System.out.println("5. Lumbar Puncture           - Rs. 2000");
        System.out.println("Lumbar Puncture - Collects spinal fluid to detect infections or neurological diseases.");
        System.out.println();

        String testName = "None";
        double testPrice = 0.0;
        System.out.print(YELLOW + "Enter test: " + RESET);
        int t = sc.nextInt();
        sc.nextLine();

        if (t == 1) {
            testName = "EEG";
            testPrice = 1800;
            // System.out.println("EEG (Electroencephalogram) - Records brain electrical
            // activity to detect seizures.");
        } else if (t == 2) {
            testName = "MRI Brain";
            testPrice = 5000;
            // System.out.println("MRI Brain - Produces detailed images of the brain to
            // detect disorders.");
        } else if (t == 3) {
            testName = "CT Scan";
            testPrice = 3500;
            // System.out.println("CT Scan - Uses X-rays to detect brain injury, bleeding,
            // or tumors.");
        } else if (t == 4) {
            testName = "Nerve Conduction Test";
            testPrice = 2500;
            // System.out.println("Nerve Conduction Test (NCV) - Measures nerve signal speed
            // to diagnose nerve damage.");
        } else if (t == 5) {
            testName = "Lumbar Puncture";
            testPrice = 2000;
            // System.out.println("Lumbar Puncture - Collects spinal fluid to detect
            // infections or neurological diseases.");
        } else
            System.out.println(RED + "Invalid test. No test added." + RESET);
    }

    static void orthopedicTests() {
        System.out.println("\n--- Orthopedics Lab Tests ---");
        System.out.println();
        System.out.println("1. X-Ray                     - Rs. 400");
        System.out.println("X-Ray – Identifies fractures, dislocations, and bone abnormalities.");
        System.out.println();
        System.out.println("2. MRI (Joint / Spine)       - Rs. 4500");
        System.out.println("MRI (Joint / Spine) – Detects soft tissue injuries like ligament or disc damage.");
        System.out.println();
        System.out.println("3. CT Scan                   - Rs. 3500");
        System.out.println("CT Scan – Provides detailed bone images for complex fractures.");
        System.out.println();
        System.out.println("4. Bone Density Test (DEXA)  - Rs. 2000");
        System.out.println("Bone Density Test (DEXA) – Measures bone strength to diagnose osteoporosis.");
        System.out.println();
        System.out.println("5. Calcium / Vitamin D Test  - Rs. 700");
        System.out.println("Calcium / Vitamin D Test – Evaluates bone health and deficiency disorders.");
        System.out.println();

        String testName = "None";
        double testPrice = 0.0;
        System.out.print(YELLOW + "Enter test: " + RESET);
        int t = sc.nextInt();
        sc.nextLine();

        if (t == 1) {
            testName = "X-Ray";
            testPrice = 400;
            // System.out.println("X-Ray - Identifies fractures, dislocations, and bone
            // abnormalities.");
        } else if (t == 2) {
            testName = "MRI (Joint / Spine)";
            testPrice = 4500;
            // System.out.println("MRI (Joint / Spine) - Detects soft tissue injuries like
            // ligament or disc damage.");
        } else if (t == 3) {
            testName = "CT Scan";
            testPrice = 3500;
            // System.out.println("CT Scan - Provides detailed bone images for complex
            // fractures.");
        } else if (t == 4) {
            testName = "Bone Density Test (DEXA)";
            testPrice = 2000;
            // System.out.println("Bone Density Test (DEXA) - Measures bone strength to
            // diagnose osteoporosis.");
        } else if (t == 5) {
            testName = "Calcium / Vitamin D Test";
            testPrice = 700;
            // System.out.println("Calcium / Vitamin D Test - Evaluates bone health and
            // deficiency disorders.");
        } else
            System.out.println(RED + "Invalid test. No test added." + RESET);
    }

    static void gastroenterologyTests() {
        System.out.println("\n--- Gastroenterology Lab Tests ---");
        System.out.println();
        System.out.println("1. Endoscopy                 - Rs. 2500");
        System.out.println("Endoscopy – Examines the stomach and esophagus using a flexible camera.");
        System.out.println();
        System.out.println("2. Colonoscopy               - Rs. 3000");
        System.out.println("Colonoscopy – Inspects the colon to detect ulcers, polyps, or cancer.");
        System.out.println();
        System.out.println("3. Liver Function Test (LFT) - Rs. 900");
        System.out.println("Liver Function Test (LFT) – Assesses liver health and enzyme levels.");
        System.out.println();
        System.out.println("4. Ultrasound Abdomen        - Rs. 1200");
        System.out.println("Ultrasound Abdomen – Visualizes abdominal organs like liver and gallbladder.");
        System.out.println();
        System.out.println("5. Stool Test                - Rs. 300");
        System.out.println("Stool Test – Detects infections, parasites, or digestive disorders.");
        System.out.println();

        String testName = "None";
        double testPrice = 0.0;
        System.out.print(YELLOW + "Enter test: " + RESET);
        int t = sc.nextInt();
        sc.nextLine();

        if (t == 1) {
            testName = "Endoscopy";
            testPrice = 2500;
            // System.out.println("Endoscopy - Examines the stomach and esophagus using a
            // flexible camera.");
        } else if (t == 2) {
            testName = "Colonoscopy";
            testPrice = 3000;
            // System.out.println("Colonoscopy - Inspects the colon to detect ulcers,
            // polyps, or cancer.");
        } else if (t == 3) {
            testName = "Liver Function Test (LFT)";
            testPrice = 900;
            // System.out.println("Liver Function Test (LFT) - Assesses liver health and
            // enzyme levels.");
        } else if (t == 4) {
            testName = "Ultrasound Abdomen";
            testPrice = 1200;
            // System.out.println("Ultrasound Abdomen - Visualizes abdominal organs like
            // liver and gallbladder.");
        } else if (t == 5) {
            testName = "Stool Test";
            testPrice = 300;
            // System.out.println("Stool Test - Detects infections, parasites, or digestive
            // disorders.");
        } else
            System.out.println(RED + "Invalid test. No test added." + RESET);
    }
}

/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

class Patient {
    private long id;
    private String name;
    private int age;
    private String gender;

    Patient(long id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

class Hospital {
    static Scanner sc = new Scanner(System.in);

    static String historyPatientId = "";
    static String historyPatientName = "";
    static String historyRecord = "";

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    private static Disease displayDentistTreatments() {
        Disease disease = null;
        while (disease == null) {
            System.out.println(
                    CYAN + "\n1. Tooth Pain\n2. Bleeding Gums\n3. Cavities (Tooth Decay)\n4. Mouth Ulcers" + RESET);
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

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    private static Disease displayCardiologistTreatments() {
        Disease disease = null;
        while (disease == null) {
            System.out.println(
                    CYAN + "\n1. Chest Pain\n2. Shortness of Breath\n3. Fainting\n4. Sudden Breathlessness" + RESET);
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

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    private static Disease displayNeurologistTreatments() {
        Disease disease = null;
        while (disease == null) {
            System.out.println(
                    CYAN + "\n1. Severe Headache\n2. Migraine\n3. Loss of Consciousness\n4. Muscle Weakness" + RESET);
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

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    static String generateOTP() {
        Random r = new Random();
        return "" + (100000 + r.nextInt(900000));
    }

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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
                + RESET);

        /*
         * ______ _ ____ _____ _____ _________ _____ ________ ________ ______ ____ ____
         * ___ ______ _______ _____ _________ _ _____
         * .' ____ \ / \ |_ \|_ _|_ _| _ _ |_ _| __ _|_ __ |_ _ `. |_ || _|.' `..' ____
         * \ |_ __ \_ _| _ _ | / \ |_ _|
         * | (___ \_| / _ \ | \ | | | | |_/ | | \_| | | |_/ / / | |_ \_| | | `. \ | |__|
         * | / .-. \ (___ \_| | |__) || | |_/ | | \_| / _ \ | |
         * _.____`. / ___ \ | |\ \| | | | | | | | .'.' _ | _| _ | | | | | __ | | | |
         * |_.____`. | ___/ | | | | / ___ \ | | _
         * | \____) | _/ / \ \_ _| |_\ |_ _| |_ _| |_ _| |_ _/ /__/ |_| |__/ |_| |_.' /
         * _| | | |_\ `-' / \____) | _| |_ _| |_ _| |_ _/ / \ \_ _| |__/ |
         * \______.'|____| |____|_____|\____|_____| |_____|
         * |_____|________|________|______.' |____||____|`.___.' \______.'|_____|
         * |_____| |_____|____| |____|________|
         */

        System.out.println(GREEN + "-------- WELCOME TO SANITIZED SQUAD HOSPITAL ------------" + RESET);
        System.out.println(CYAN + "--------- ENTER PATIENT DETAILS -------" + RESET);

        System.out.print(YELLOW + "Enter Patient Name: " + RESET);
        String name = sc.next();

        System.out.print(YELLOW + "Enter Patient Age: " + RESET);
        int age = sc.nextInt();

        String gender = "";
        int retry = 0;

        while (gender.equals("") ||
                !(gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f"))) {
            if (retry > 0) {
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
            System.out.println(CYAN
                    + "1. General Physician \n2. Dermatology \n3. Dentist \n4. Cardiologist \n5. Neurologist \n6. Orthopedics \n7. Gastroenterology"
                    + RESET);
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

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

            switch (specialization) {
                case 1:
                    LabTests.generalPhysicianTests();
                    break;
                case 2:
                    LabTests.dermatologyTests();
                    break;
                case 3:
                    LabTests.dentistTests();
                    break;
                case 4:
                    LabTests.cardiologistTests();
                    break;
                case 5:
                    LabTests.neurologistTests();
                    break;
                case 6:
                    LabTests.orthopedicTests();
                    break;
                case 7:
                    LabTests.gastroenterologyTests();
                    break;
            }
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        // Appointment time
        System.out.println(MAGENTA + "\n------------------ APPOINTMENT TIME ------------------" + RESET);
        System.out.println(CYAN + "1. 10:00 AM");
        System.out.println("2. 12:00 PM");
        System.out.println("3. 03:00 PM");
        System.out.println("4. 06:00 PM" + RESET);
        System.out.print(YELLOW + "Enter choice: " + RESET);
        int slot = sc.nextInt();
        sc.nextLine();

        String apptTime = (slot == 1) ? "10:00 AM"
                : (slot == 2) ? "12:00 PM" : (slot == 3) ? "03:00 PM" : (slot == 4) ? "06:00 PM" : "Walk-in";

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        // Billing
        double doctorFee = 300.0;
        double subtotal = doctorFee + disease.getMedicinePrice() + testPrice;
        double taxAmount = Math.round(subtotal * 0.18 * 100.0) / 100.0;
        double totalAmount = subtotal + taxAmount;

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        // COST ESTIMATE
        System.out.println(CYAN + "\n================= ESTIMATED COST =================" + RESET);
        System.out.println(GREEN + "Doctor Fee        : Rs. " + doctorFee);
        System.out.println("Medicine (" + disease.getMedicine() + ") : Rs. " + disease.getMedicinePrice());
        System.out.println("Lab Test (" + testName + ") : Rs. " + testPrice);
        System.out.println("Subtotal          : Rs. " + subtotal);
        System.out.println("Tax (18%)         : Rs. " + taxAmount);
        System.out.println("TOTAL PAYABLE     : Rs. " + totalAmount + RESET);
        System.out.println(CYAN + "==================================================" + RESET);

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        // Proceed?
        System.out.print(YELLOW + "\nProceed to pay? (yes/no): " + RESET);
        String proceed = sc.nextLine();
        if (!proceed.equalsIgnoreCase("yes")) {
            System.out.println(RED + "Payment cancelled." + RESET);
            return;
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        // OTP
        String otp = generateOTP();
        System.out.println(GREEN + "OTP Sent: " + otp + RESET);
        System.out.print(YELLOW + "Enter OTP: " + RESET);
        String entered = sc.nextLine();

        if (!entered.equals(otp)) {
            System.out.println(RED + "Invalid OTP. Payment failed." + RESET);
            return;
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

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

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        // Ask history
        System.out.print(YELLOW + "\nView saved patient history? (yes/no): " + RESET);
        String view = sc.nextLine();
        if (view.equalsIgnoreCase("yes"))
            showHistory();

        System.out.println(CYAN + "\nThank you - Get Well Soon!" + RESET);
    }
}