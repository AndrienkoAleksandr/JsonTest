package enumtest;

public enum AttributeScope {
    TITLE("${title}"),
    DESCRIPTION("${description}");

    private String scope;

    AttributeScope(String scope) {
        this.scope = scope;
    }

    public String getScope() {
        return scope;
    }

    public static AttributeScope fromScope(String key) {

        for (AttributeScope scope: AttributeScope.values()) {
            if (scope.getScope().equals(key)) {
                return scope;
            }
        }
        return null;
    }
}
