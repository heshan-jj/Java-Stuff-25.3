public class SecurityAlert {
    protected String threatId;
    protected String source;
    protected String severity;

    public void logAlert() {
        System.out.println("[ALERT] ID: " + threatId + " | Source: " + source + " | Severity: " + severity);
    }

    public void logAlert(String extraInfo) {
        System.out.println("[ALERT] ID: " + threatId + " | Source: " + source + " | Severity: " + severity + " | Info: " + extraInfo);
    }

    public void logAlert(String extraInfo, boolean sendEmail) {
        logAlert(extraInfo);
        if (sendEmail) {
            System.out.println("Email notification sent for " + threatId);
        }
    }

    public void raiseAlert() {
        System.out.println("!! SECURITY ALERT !! " + threatId + " from " + source);
    }
}