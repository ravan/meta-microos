SUMMARY = "Enforcer Rules"
DESCRIPTION = "This component contains the standard Enforcer Rules."
LICENSE = "Apache-2.0"

PV = "3.6.3"

RPM_NAME = "maven-enforcer-rules-3.6.3-1.2.noarch.rpm"
RPM_HASH = "31bc53e92e1eb3652173d65e830e20d8c480a10e72cc7ceb36b278eb03ecfff9bfa1bb08d9269a065365acd7bd616dc5519132a0037f92781c64aab838b2b961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-rules \
mvn-org.apache.maven.enforcer-enforcer-rules \
mvn-org.apache.maven.enforcer-enforcer-rules-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec \
mvn-commons-io-commons-io \
mvn-org.apache-extras.beanshell-bsh \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.enforcer-enforcer-api \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
