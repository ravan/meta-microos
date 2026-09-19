SUMMARY = "Bouncy Castle OpenPGP API"
DESCRIPTION = "The Bouncy Castle Java API for handling the OpenPGP protocol.The APIs can be \
used in conjunction with a JCE/JCA provider such as the one provided with the \
Bouncy Castle Cryptography APIs."
LICENSE = "Apache-2.0 & MIT"

PV = "1.85"

RPM_NAME = "bouncycastle-pg-1.85-1.1.noarch.rpm"
RPM_HASH = "d9ec797ac903e15414ecb18c95c4549ac1194440df7fd89cfb9d800188acae9d529eaeec38509f81fc75381acb7ddd383e5c0c7fed3c4893746cd1bba5dda8d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-pg \
mvn-org.bouncycastle-bcpg-jdk15 \
mvn-org.bouncycastle-bcpg-jdk15-pom- \
mvn-org.bouncycastle-bcpg-jdk15on \
mvn-org.bouncycastle-bcpg-jdk15on-pom- \
mvn-org.bouncycastle-bcpg-jdk15to18 \
mvn-org.bouncycastle-bcpg-jdk15to18-pom- \
mvn-org.bouncycastle-bcpg-jdk16 \
mvn-org.bouncycastle-bcpg-jdk16-pom- \
mvn-org.bouncycastle-bcpg-jdk18 \
mvn-org.bouncycastle-bcpg-jdk18-pom- \
mvn-org.bouncycastle-bcpg-jdk18on \
mvn-org.bouncycastle-bcpg-jdk18on-pom- \
osgi-bcpg"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcprov-jdk18on \
mvn-org.bouncycastle-bcutil-jdk18on"

inherit rpm
