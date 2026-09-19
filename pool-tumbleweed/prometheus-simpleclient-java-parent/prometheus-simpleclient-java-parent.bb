SUMMARY = "Prometheus Java Suite parent pom"
DESCRIPTION = "The Prometheus Java Suite: Client Metrics, Exposition, and Examples."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-parent-0.16.0-2.2.noarch.rpm"
RPM_HASH = "9bb78ac05a5d732edbf5e980503bdce98976518f0df3139baae4ece43254e902a4e4895bec68f31fafb1a4436321e5f3ed333abf51fba707e1de93978bc176d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-parent-pom- \
prometheus-simpleclient-java-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin"

inherit rpm
