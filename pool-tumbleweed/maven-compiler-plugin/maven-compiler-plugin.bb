SUMMARY = "Maven Compiler Plugin"
DESCRIPTION = "The Compiler Plugin is used to compile the sources of your project."
LICENSE = "Apache-2.0"

PV = "3.16.0"

RPM_NAME = "maven-compiler-plugin-3.16.0-1.1.noarch.rpm"
RPM_HASH = "370053bb22dbb1d054fc23d523668cf0194e306f50e7e6719ce15a2071564b6257d3b73afd5861160cdce6370b3d2587bfd0ba7d87af3e929f65f630fc8dfcc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.maven.shared-maven-shared-incremental \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.codehaus.plexus-plexus-compiler-javac \
mvn-org.codehaus.plexus-plexus-compiler-manager \
mvn-org.codehaus.plexus-plexus-java \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.ow2.asm-asm"

inherit rpm
