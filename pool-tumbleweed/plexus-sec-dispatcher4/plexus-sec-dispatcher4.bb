SUMMARY = "Plexus Security Dispatcher Component"
DESCRIPTION = "Plexus Security Dispatcher Component"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "plexus-sec-dispatcher4-4.1.0-2.1.noarch.rpm"
RPM_HASH = "75c7196feb8bdc03cd4158859e5e4a0e8734eb6c437ab15e48f682492b28018bb031df22292f8d203417ed92b37856403c49aa7563a0258295fd7f2f890fd1b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-sec-dispatcher-4 \
mvn-org.codehaus.plexus-plexus-sec-dispatcher-4.1.0 \
mvn-org.codehaus.plexus-plexus-sec-dispatcher-pom-4 \
mvn-org.codehaus.plexus-plexus-sec-dispatcher-pom-4.1.0 \
plexus-sec-dispatcher4"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
