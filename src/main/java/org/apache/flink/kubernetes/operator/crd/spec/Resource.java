package org.apache.flink.kubernetes.operator.crd.spec;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize()
@ToString

public class Resource implements KubernetesResource {

	private Double cpu;
	private String mem;

	private Map<String, String> podLabels;

	public Double getCpu() {
		return cpu;
	}

	public void setCpu(Double cpu) {
		this.cpu = cpu;
	}

	public String getMem() {
		return mem;
	}

	public void setMem(String mem) {
		this.mem = mem;
	}

	public Map<String, String> getPodLabels() {
		return podLabels;
	}

	public void setPodLabels(Map<String, String> podLabels) {
		this.podLabels = podLabels;
	}
}
