SUMMARY = "Bouncy Castle ASN.1 Extension and Utility APIs"
DESCRIPTION = "The Bouncy Castle Java APIs for ASN.1 extension and utility APIs used to \
support bcpkix and bctls."
LICENSE = "MIT"

PV = "1.85"

RPM_NAME = "bouncycastle-util-1.85-1.1.noarch.rpm"
RPM_HASH = "eb240190b845b20e3d37b133d5df3549590566817c8cab34897f487a9c3cc769fc96c0da4e94089d48337f58b091b96f8dbde2a21f8e31014adafe31ad81e4a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-util \
mvn-org.bouncycastle-bcutil-jdk15 \
mvn-org.bouncycastle-bcutil-jdk15-pom- \
mvn-org.bouncycastle-bcutil-jdk15on \
mvn-org.bouncycastle-bcutil-jdk15on-pom- \
mvn-org.bouncycastle-bcutil-jdk15to18 \
mvn-org.bouncycastle-bcutil-jdk15to18-pom- \
mvn-org.bouncycastle-bcutil-jdk16 \
mvn-org.bouncycastle-bcutil-jdk16-pom- \
mvn-org.bouncycastle-bcutil-jdk18 \
mvn-org.bouncycastle-bcutil-jdk18-pom- \
mvn-org.bouncycastle-bcutil-jdk18on \
mvn-org.bouncycastle-bcutil-jdk18on-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcprov-jdk18on"

inherit rpm
