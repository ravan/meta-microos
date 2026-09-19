SUMMARY = "Java implementation of multi-cast DNS"
DESCRIPTION = "JmDNS is a Java implementation of multi-cast DNS \
and can be used for service registration and discovery \
in local area networks. JmDNS is fully compatible \
with Apple's Bonjour."
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "jmdns-3.5.7-5.3.noarch.rpm"
RPM_HASH = "7a6bf1e4b6ef998c684bd055fe83ab6df38fa480142746124589297dca0d9087378555ff651ece01f66051fedcf57e60c9508e52665b1947e41605a90286fa75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmdns \
mvn-javax.jmdns-jmdns \
mvn-javax.jmdns-jmdns-pom- \
mvn-org.jmdns-jmdns \
mvn-org.jmdns-jmdns-pom- \
osgi-javax.jmdns"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
