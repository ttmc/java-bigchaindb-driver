/*
 * Copyright BigchainDB GmbH and BigchainDB contributors
 * SPDX-License-Identifier: (Apache-2.0 AND CC-BY-4.0)
 * Code is Apache-2.0 and docs are CC-BY-4.0
 */
package com.bigchaindb.model;

import okhttp3.OkHttpClient;

import java.util.Map;



/**
 * The Class Globals.
 */
public class BigChainDBGlobals {
	
	/** The api endpoints. */
	private static ApiEndpoints apiEndpoints;

	/**
	 * Gets the api endpoints.
	 *
	 * @return the api endpoints
	 */
	public static ApiEndpoints getApiEndpoints() {
		return apiEndpoints;
	}

	/**
	 * Sets the api endpoints.
	 *
	 * @param apiEndpoints the new api endpoints
	 */
	public static void setApiEndpoints(ApiEndpoints apiEndpoints) {
		BigChainDBGlobals.apiEndpoints = apiEndpoints;
	}

	/** The authorization tokens. */
	private static Map<String, String> authorizationTokens;
	
	/** The base url. */
	private static String baseUrl;
	
	/** The http client. */
	private static OkHttpClient httpClient;
	
	/** The ws socket url. */
	private static String wsSocketUrl;

	/**
	 * Gets the ws socket url.
	 *
	 * @return the ws socket url
	 */
	public static String getWsSocketUrl() {
		return wsSocketUrl;
	}

	/**
	 * Sets the ws socket url.
	 *
	 * @param wsSocketUrl the new ws socket url
	 */
	public static void setWsSocketUrl(String wsSocketUrl) {
		BigChainDBGlobals.wsSocketUrl = wsSocketUrl;
	}

	/**
	 * Gets the authorization tokens.
	 *
	 * @return the authorization tokens
	 */
	public static Map<String, String> getAuthorizationTokens() {
		return authorizationTokens;
	}

	/**
	 * Sets the authorization tokens.
	 *
	 * @param authorizationTokens the authorization tokens
	 */
	public static void setAuthorizationTokens(Map<String, String> authorizationTokens) {
		BigChainDBGlobals.authorizationTokens = authorizationTokens;
	}

	/**
	 * Gets the base url.
	 *
	 * @return the base url
	 */
	public static String getBaseUrl() {
		return baseUrl;
	}

	/**
	 * Sets the base url.
	 *
	 * @param baseUrl the new base url
	 */
	public static void setBaseUrl(String baseUrl) {
		BigChainDBGlobals.baseUrl = baseUrl;
	}

	/**
	 * Gets the http client.
	 *
	 * @return the http client
	 */
	public static OkHttpClient getHttpClient() {
		return httpClient;
	}

	/**
	 * Sets the http client.
	 *
	 * @param httpClient the new http client
	 */
	public static void setHttpClient(OkHttpClient httpClient) {
		BigChainDBGlobals.httpClient = httpClient;
	}

}
