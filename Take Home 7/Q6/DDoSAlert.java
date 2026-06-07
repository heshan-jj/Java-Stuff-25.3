public class DDoSAlert extends SecurityAlert {
    private int packetCount;

    public DDoSAlert(String threatId, String source, String severity, int packetCount) {
        this.threatId = threatId;
        this.source = source;
        this.severity = severity;
        this.packetCount = packetCount;
    }

    @Override
    public void raiseAlert() {
        System.out.println("[DDoS] " + source + " - " + packetCount + " packets!");
    }

    public void mitigate() {
        System.out.println("Mitigating DDoS from " + source + " -" + packetCount + " packets dropped");
    }
}