SUMMARY = "Apache Maven Mapping"
DESCRIPTION = "Maven shared component that implements file name mapping."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-mapping-3.0.0-3.21.noarch.rpm"
RPM_HASH = "687a23b959ff1d3a4e8612404a312fcd05146dfb1bdecf4fc9ea1eff69829e8ad1a7691dc0135eba0bbd8c4c3f3f9d20049ff287434e7c051cf414933d26d41c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-mapping \
mvn-org.apache.maven.shared-maven-mapping \
mvn-org.apache.maven.shared-maven-mapping-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.codehaus.plexus-plexus-interpolation"

inherit rpm
