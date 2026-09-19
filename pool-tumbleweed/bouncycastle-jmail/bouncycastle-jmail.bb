SUMMARY = "Bouncy Castle Jakarta S/MIME API"
DESCRIPTION = "The Bouncy Castle Java S/MIME APIs for handling S/MIME protocols. This jar \
contains S/MIME APIs for JDK 1.8 and up. The APIs can be used in conjunction \
with a JCE/JCA provider such as the one provided with the Bouncy Castle \
Cryptography APIs. The Jakarta Mail API and the Jakarta activation framework \
will also be needed."
LICENSE = "MIT"

PV = "1.85"

RPM_NAME = "bouncycastle-jmail-1.85-1.1.noarch.rpm"
RPM_HASH = "d875a6313f2c1d7a7726ac1d623af3f1bd485ab1bc875b83e9cbe575eaba7ac90efde7eff9de6854b470aeb8d32d1ea0d8b99e932b3bd2af176766ce89385abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-jmail \
mvn-org.bouncycastle-bcjmail-jdk15 \
mvn-org.bouncycastle-bcjmail-jdk15-pom- \
mvn-org.bouncycastle-bcjmail-jdk15on \
mvn-org.bouncycastle-bcjmail-jdk15on-pom- \
mvn-org.bouncycastle-bcjmail-jdk15to18 \
mvn-org.bouncycastle-bcjmail-jdk15to18-pom- \
mvn-org.bouncycastle-bcjmail-jdk16 \
mvn-org.bouncycastle-bcjmail-jdk16-pom- \
mvn-org.bouncycastle-bcjmail-jdk18 \
mvn-org.bouncycastle-bcjmail-jdk18-pom- \
mvn-org.bouncycastle-bcjmail-jdk18on \
mvn-org.bouncycastle-bcjmail-jdk18on-pom-"

RDEPENDS:${PN} += "bouncycastle \
java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcpkix-jdk18on"

inherit rpm
