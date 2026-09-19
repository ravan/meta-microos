SUMMARY = "HTTP agent implementation based on httpcomponents HttpCore"
DESCRIPTION = "HttpClient is a HTTP/1.1 compliant HTTP agent implementation based on \
httpcomponents HttpCore. It also provides reusable components for \
client-side authentication, HTTP state management, and HTTP connection \
management. HttpComponents Client is a successor of and replacement \
for Commons HttpClient 3.x. Users of Commons HttpClient are strongly \
encouraged to upgrade."
LICENSE = "Apache-2.0"

PV = "4.5.14"

RPM_NAME = "httpcomponents-client-4.5.14-2.1.noarch.rpm"
RPM_HASH = "7f258647f2e14ebaa46db146601b7137953c826a3159be0f617facc4f4ab03929f9c040a4ebe8bab00fc988cabc56eedcc476ecdedc9c88f1100e43c9e305b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-client \
mvn-org.apache.httpcomponents-fluent-hc \
mvn-org.apache.httpcomponents-fluent-hc-pom- \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpclient-pom- \
mvn-org.apache.httpcomponents-httpmime \
mvn-org.apache.httpcomponents-httpmime-pom- \
osgi-org.apache.httpcomponents.fluent-hc \
osgi-org.apache.httpcomponents.httpclient \
osgi-org.apache.httpcomponents.httpmime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec \
mvn-commons-logging-commons-logging \
mvn-org.apache.httpcomponents-httpcore \
publicsuffix"

inherit rpm
