SUMMARY = "Classes to manage report plugin executions with Maven 3"
DESCRIPTION = "Classes to manage and configure report plugin executions with Maven 3."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "maven-reporting-exec-2.0.1-1.2.noarch.rpm"
RPM_HASH = "6a1ad55d2a772e05aaabe6effe968e2968d2a8b46985f876926a6cbe359562fecb158e7340ccf1cbe188e7cbfd859f3621e17db875ba76aa12617f5a97ee1753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-exec \
mvn-org.apache.maven.reporting-maven-reporting-exec \
mvn-org.apache.maven.reporting-maven-reporting-exec-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.codehaus.plexus-plexus-classworlds \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-api"

inherit rpm
