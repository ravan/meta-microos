SUMMARY = "Apache implementation of the SOAP"
DESCRIPTION = "Apache Axis is an implementation of the SOAP ('Simple Object Access \
Protocol') submission to W3C."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "axis-1.4-310.6.noarch.rpm"
RPM_HASH = "341ec5661f47a5bd11512d6220236bc8da1bb9a1e6424380f357d93e329b09a0e427b8678c89770ccc21fc20bc474903f56436e92522608f4a9b990111727841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "axis \
mvn-axis-axis \
mvn-axis-axis-ant \
mvn-axis-axis-ant-pom- \
mvn-axis-axis-jaxrpc \
mvn-axis-axis-jaxrpc-pom- \
mvn-axis-axis-pom- \
mvn-axis-axis-saaj \
mvn-axis-axis-saaj-pom- \
mvn-org.apache.axis-axis-ant \
mvn-org.apache.axis-axis-ant-pom- \
mvn-org.apache.axis-axis-jaxrpc \
mvn-org.apache.axis-axis-jaxrpc-pom- \
mvn-org.apache.axis-axis-saaj \
mvn-org.apache.axis-axis-saaj-pom- \
osgi-javax.xml.rpc \
osgi-javax.xml.soap \
osgi-org.apache.axis"

RDEPENDS:${PN} += "apache-commons-httpclient \
apache-commons-logging \
glassfish-activation-api \
jakarta-commons-discovery \
java \
java-headless \
javamail \
javapackages-filesystem \
mvn-axis-axis-wsdl4j \
mvn-commons-discovery-commons-discovery \
mvn-commons-logging-commons-logging \
osgi-javax.wsdl \
osgi-org.apache.commons.discovery \
reload4j \
wsdl4j \
xerces-j2"

inherit rpm
