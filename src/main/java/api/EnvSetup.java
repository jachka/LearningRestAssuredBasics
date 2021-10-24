package api;

import java.net.URL;

public class EnvSetup {
    public static final String theURL = "http://127.0.0.1";
    public static final String adminUserName="admin";
    public static final String adminUserPassword="admin";
    public static final String proxyUrl="localhost";
    public static final int proxyPort=8000;

    public static URL getURL() {
        return Url.getURL(theURL);
    }

    public static String getAdminUserName() {
        return adminUserName;
    }

    public static String getAdminUserPassword() {
        return adminUserPassword;
    }

    public static String getProxyUrl() {
        return proxyUrl;
    }

    public static int getProxyPort() {
        return proxyPort;
    }

    public static Env getTestEnv(){
        Env env = new Env(theURL, adminUserName, adminUserPassword);
        env.configureProxy(proxyUrl, proxyPort);
        env.setUseProxy(false);
        return env;
    }
}