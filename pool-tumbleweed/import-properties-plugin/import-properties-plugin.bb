SUMMARY = "Istack-commons import properties plugin"
DESCRIPTION = "This package contains the istack-commons import properties Maven Mojo."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "import-properties-plugin-3.0.7-8.10.noarch.rpm"
RPM_HASH = "2bcd7bf97d68d2396b8847391f1f9ebe4d18d128bd3482d3b7aa2ade098db202592d5fcb1973897cd5bb1f7fc6581aa80d9bffcc4fa792c6df0b738cf85ac13d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "import-properties-plugin \
mvn-com.sun.istack-import-properties-plugin \
mvn-com.sun.istack-import-properties-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-connector-basic \
mvn-org.apache.maven.resolver-maven-resolver-impl \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-transport-file \
mvn-org.apache.maven.resolver-maven-resolver-transport-wagon \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.wagon-wagon-http-lightweight \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.jsoup-jsoup"

inherit rpm
