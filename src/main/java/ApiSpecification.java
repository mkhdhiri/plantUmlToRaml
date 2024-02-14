import java.util.HashMap;
import java.util.Map;

public class ApiSpecification {

    private String title;
    private String description;
    private String version;
    private String baseUrl;
    private Map<String, PathSpecification> paths;

    public ApiSpecification() {
        this.paths = new HashMap<>();
    }

    // Méthode pour ajouter une spécification de chemin
    public void addPath(String path, PathSpecification pathSpec) {
        this.paths.put(path, pathSpec);
    }

    // Méthode pour récupérer une spécification de chemin
    public PathSpecification getPath(String path) {
        return this.paths.get(path);
    }
    // Constructeur, getters et setters

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public Map<String, PathSpecification> getPaths() {
        return paths;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setPaths(Map<String, PathSpecification> paths) {
        this.paths = paths;
    }

    // Ajoutez d'autres propriétés si nécessaire
}

class PathSpecification {
    private String summary;
    private Map<String, OperationSpecification> operations;

    // Constructeur, getters et setters

    public PathSpecification() {
        this.operations = new HashMap<>();
    }

    public void addOperation(String method, OperationSpecification operationSpec) {
        this.operations.put(method, operationSpec);
    }



    // Ajoutez d'autres méthodes si nécessaire

    public String getSummary() {
        return summary;
    }

    public Map<String, OperationSpecification> getOperations() {
        return operations;
    }



    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setOperations(Map<String, OperationSpecification> operations) {
        this.operations = operations;
    }




}



class OperationSpecification {
    private String summary;
    private Map<String, Object> parameters;
    private RequestBodySpecification requestBody;
    private Map<String, ResponseSpecification> responses;

    // Constructeur, getters et setters

    public String getSummary() {
        return summary;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public RequestBodySpecification getRequestBody() {
        return requestBody;
    }

    public Map<String, ResponseSpecification> getResponses() {
        return responses;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public void setRequestBody(RequestBodySpecification requestBody) {
        this.requestBody = requestBody;
    }

    public void setResponses(Map<String, ResponseSpecification> responses) {
        this.responses = responses;
    }

    // Ajoutez d'autres propriétés si nécessaire
}

class RequestBodySpecification {
    private String description;
    private boolean required;
    private Map<String, Object> content;

    public String getDescription() {
        return description;
    }

    public boolean isRequired() {
        return required;
    }

    public Map<String, Object> getContent() {
        return content;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public void setContent(Map<String, Object> content) {
        this.content = content;
    }

    // Constructeur, getters et setters
}



class ResponseSpecification {
    private String description;
    private Map<String, Object> content;

    public String getDescription() {
        return description;
    }

    public Map<String, Object> getContent() {
        return content;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(Map<String, Object> content) {
        this.content = content;
    }

    // Constructeur, getters et setters
}
