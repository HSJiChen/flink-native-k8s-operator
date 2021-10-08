package org.apache.flink.kubernetes.operator.crd.spec;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import lombok.ToString;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize()
@ToString
public class FlinkApplicationSpec implements KubernetesResource {

	private String jarURI;
	private String[] mainArgs = new String[0];
	private String entryClass;

	private int parallelism;
	private String serviceAccountName;

    private String imageName;
    private String imagePullPolicy;

    private Resource jobManager;
    private Resource taskManager;

    private String fromSavepoint;
    private boolean allowNonRestoredState = false;
    private String savepointsDir;
    private int savepointGeneration;

    private Map<String, String> flinkConfig;

    private Map<String, String> logConfig;

	public String getServiceAccountName() {
		return serviceAccountName;
	}

	public Map<String, String> getLogConfig() {
		return logConfig;
	}

	public void setServiceAccountName(String serviceAccountName) {
		this.serviceAccountName = serviceAccountName;
	}

	public void setLogConfig(Map<String, String> logConfig) {
		this.logConfig = logConfig;
	}

	public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public String getJarURI() {
        return jarURI;
    }

    public void setJarURI(String jarURI) {
        this.jarURI = jarURI;
    }

    public String[] getMainArgs() {
        return mainArgs;
    }

    public void setMainArgs(String[] mainArgs) {
        this.mainArgs = mainArgs;
    }

    public String getEntryClass() {
        return entryClass;
    }

    public void setEntryClass(String entryClass) {
        this.entryClass = entryClass;
    }

    public int getParallelism() {
        return parallelism;
    }

    public void setParallelism(int parallelism) {
        this.parallelism = parallelism;
    }

    public Resource getJobManager() {
        return jobManager;
    }

    public void setJobManager(Resource jobManager) {
        this.jobManager = jobManager;
    }

    public Resource getTaskManager() {
        return taskManager;
    }

    public void setTaskManager(Resource taskManager) {
        this.taskManager = taskManager;
    }

    public Map<String, String> getFlinkConfig() {
        return flinkConfig;
    }

    public void setFlinkConfig(Map<String, String> flinkConfig) {
        this.flinkConfig = flinkConfig;
    }

    public String getFromSavepoint() {
        return fromSavepoint;
    }

    public void setFromSavepoint(String fromSavepoint) {
        this.fromSavepoint = fromSavepoint;
    }

    public boolean isAllowNonRestoredState() {
        return allowNonRestoredState;
    }

    public void setAllowNonRestoredState(boolean allowNonRestoredState) {
        this.allowNonRestoredState = allowNonRestoredState;
    }

    public String getSavepointsDir() {
        return savepointsDir;
    }

    public void setSavepointsDir(String savepointsDir) {
        this.savepointsDir = savepointsDir;
    }

    public int getSavepointGeneration() {
        return savepointGeneration;
    }

    public void setSavepointGeneration(int savepointGeneration) {
        this.savepointGeneration = savepointGeneration;
    }
}
