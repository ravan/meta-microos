SUMMARY = "The ssh module for maven-wagon"
DESCRIPTION = "The ssh module for maven-wagon"
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ssh-3.5.3-2.9.noarch.rpm"
RPM_HASH = "f829b679e9f3b9c25c867a2112fbba9a5b4b0e71cd80dedf46cb082e6211120d66abb7e4ea014e629a31f6b3558c8ed9c569674efb962c057d912ec27f9b52df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ssh \
mvn-org.apache.maven.wagon-wagon-ssh \
mvn-org.apache.maven.wagon-wagon-ssh-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch \
mvn-com.jcraft-jsch.agentproxy.connector-factory \
mvn-com.jcraft-jsch.agentproxy.jsch \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.apache.maven.wagon-wagon-ssh-common \
mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
