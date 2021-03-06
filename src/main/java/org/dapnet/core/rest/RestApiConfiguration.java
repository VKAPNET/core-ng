package org.dapnet.core.rest;

import org.dapnet.core.config.Configuration;
import org.dapnet.core.config.PropertyReader;

/**
 * This class contains the configuration related to the REST service.
 * 
 * @author Philipp Thiel
 */
public final class RestApiConfiguration extends Configuration {

	private boolean enabled;
	private int port;
	private String path;
	private String hostname;

	/**
	 * Whether the REST service is enabled or not.
	 * 
	 * @return {@code true} if the REST service is enabled.
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Gets the port to listen on.
	 * 
	 * @return REST server port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * Gets the REST service base path.
	 * 
	 * @return REST base path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Gets the hostname to listen for.
	 * 
	 * @return Hostname
	 */
	public String getHostname() {
		return hostname;
	}

	@Override
	public void loadConfiguration(PropertyReader reader) {
		enabled = reader.getBoolean("rest.enabled", true);
		port = reader.getInteger("rest.port", 8080);
		path = reader.getString("rest.path", "/");
		hostname = reader.getString("rest.hostname", "localhost");
	}

}
