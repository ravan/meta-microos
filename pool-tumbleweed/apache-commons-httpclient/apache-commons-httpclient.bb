SUMMARY = "Feature rich package for accessing resources via HTTP"
DESCRIPTION = "Although the java.net  package provides basic functionality for \
accessing resources via HTTP, it doesn't provide the full flexibility \
or functionality needed by many applications. The Apache Commons \
HttpClient component provides a package implementing the client side \
of the most recent HTTP standards and recommendations. \
 \
The HttpClient component may be of interest to anyone building \
HTTP-aware client applications such as web browsers, web service \
clients, or systems that leverage or extend the HTTP protocol for \
distributed communication."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-3.1-15.9.noarch.rpm"
RPM_HASH = "9b5d8a7d2ff495bc352dadf8e564c4bedc12605669783a7f680fc5686d4ae10759efc85cf571efd33e45a6c408d28ad22b56eea9e22477607307ecd0cb62d777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient \
commons-httpclient \
jakarta-commons-httpclient \
jakarta-commons-httpclient3 \
mvn-apache-commons-httpclient \
mvn-apache-commons-httpclient-pom- \
mvn-commons-httpclient-commons-httpclient \
mvn-commons-httpclient-commons-httpclient-pom- \
osgi-org.apache.commons.httpclient"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec \
mvn-commons-logging-commons-logging"

inherit rpm
