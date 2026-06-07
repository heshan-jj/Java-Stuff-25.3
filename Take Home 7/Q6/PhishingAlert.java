public class PhishingAlert extends SecurityAlert {
    private String targetEmail;

    public PhishingAlert(String threatId, String source, String severity, String targetEmail) {
        this.threatId = threatId;
        this.source = source;
        this.severity = severity;
        this.targetEmail = targetEmail;
    }

    @Override
    public void raiseAlert() {
        System.out.println("[PHISHING] Attack targeting " + targetEmail + " from " + source + "!");
    }

    public void blockEmail() {
        System.out.println("Blocking phishing email targeting: " + targetEmail);
    }
}