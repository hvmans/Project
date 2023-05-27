package pt.ipp.isep.dei.esoft.project.domain;

public class Request {

    private final String REQUEST_TYPE_SALE = "Sale";
    private final String REQUEST_TYPE_LEASE = "Lease";
    private static int requestIdCounter = 0;
    private int requestId;
    Property requestedProperty;
    Agent agent;
    String requestType;

}
