SUMMARY = "Bouncy Castle JSSE provider and TLS/DTLS API"
DESCRIPTION = "The Bouncy Castle Java APIs for TLS and DTLS, including a provider for the \
JSSE."
LICENSE = "MIT"

PV = "1.85"

RPM_NAME = "bouncycastle-tls-1.85-1.1.noarch.rpm"
RPM_HASH = "4b74d573876c7b868ef37a263a0b5b2160e89cc0b3ebb774ef6db7128a5fff423897ff15b739d4772e1728ba9e7482bf3b6a000f1a85ec86450ad4d587f83c86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-tls \
mvn-org.bouncycastle-bctls-jdk15 \
mvn-org.bouncycastle-bctls-jdk15-pom- \
mvn-org.bouncycastle-bctls-jdk15on \
mvn-org.bouncycastle-bctls-jdk15on-pom- \
mvn-org.bouncycastle-bctls-jdk15to18 \
mvn-org.bouncycastle-bctls-jdk15to18-pom- \
mvn-org.bouncycastle-bctls-jdk16 \
mvn-org.bouncycastle-bctls-jdk16-pom- \
mvn-org.bouncycastle-bctls-jdk18 \
mvn-org.bouncycastle-bctls-jdk18-pom- \
mvn-org.bouncycastle-bctls-jdk18on \
mvn-org.bouncycastle-bctls-jdk18on-pom- \
osgi-bctls"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcutil-jdk18on"

inherit rpm
