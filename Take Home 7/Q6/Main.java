public class Main {
    public static void main(String[] args) {
        MalwareAlert malware = new MalwareAlert("ALT-001", "192.168.1.5", "Critical", "Ransomware");
        malware.logAlert();
        malware.logAlert("Encrypted 3 files");
        malware.logAlert("Encrypted 3 files", true);
        malware.raiseAlert();
        malware.quarantine();

        System.out.println();

        SecurityAlert[] alerts = new SecurityAlert[3];
        alerts[0] = new MalwareAlert("ALT-001", "192.168.1.5", "Critical", "Ransomware");
        alerts[1] = new PhishingAlert("ALT-002", "evil.com", "High", "admin@nsbm.ac.lk");
        alerts[2] = new DDoSAlert("ALT-003", "10.0.0.99", "Critical", 50000);

        for (SecurityAlert alert : alerts) {
            alert.logAlert();
            alert.raiseAlert();
        }
    }
}