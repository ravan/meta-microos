SUMMARY = "Apache components to build asynchronous client side HTTP services"
DESCRIPTION = "Asynch HttpClient is a HTTP/1.1 compliant HTTP agent implementation based on \
HttpCore NIO and HttpClient components. It is a complementary module to \
Apache HttpClient intended for special cases where ability to handle \
a great number of concurrent connections is more important than performance \
in terms of a raw data throughput."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-4.1.4-5.4.noarch.rpm"
RPM_HASH = "4067411c6ed50b0ac921e92b955516d375545211338c5136faf40ac22b0ad199723aedfeac6dc829c1a6525f7c910dc2fb89b873f32a72b484d5b195ebf4ac06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient \
mvn-org.apache.httpcomponents-httpasyncclient \
mvn-org.apache.httpcomponents-httpasyncclient-pom- \
osgi-org.apache.httpcomponents.httpasyncclient"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.httpcomponents-httpcore-nio"

inherit rpm
