public class Resource {
    private String resourceId;
    private String resourceTitle;
    private ResourceType resourceType;

    public Resource(String resourceId, String resourceTitle, ResourceType resourceType) {
        this.resourceId = resourceId;
        this.resourceTitle = resourceTitle;
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceTitle() {
        return resourceTitle;
    }

    public void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceId='" + resourceId + '\'' +
                ", resourceTitle='" + resourceTitle + '\'' +
                ", resourceType=" + resourceType +
                '}';
    }
}
