SUMMARY = "Bouncy Castle PKIX, CMS, EAC, TSP, PKCS, OCSP, CMP, and CRMF APIs"
DESCRIPTION = "The Bouncy Castle Java APIs for CMS, PKCS, EAC, TSP, CMP, CRMF, OCSP, and \
certificate generation. This jar contains APIs for JDK 1.5 to JDK 1.8. The \
APIs can be used in conjunction with a JCE/JCA provider such as the one \
provided with the Bouncy Castle Cryptography APIs."
LICENSE = "MIT"

PV = "1.85"

RPM_NAME = "bouncycastle-pkix-1.85-1.1.noarch.rpm"
RPM_HASH = "fe72e83526bd89afd6aad8bdcdb6b183b4fa6961dec17820d3bfd5915b7d5d9889ffd3606576bf53d7078e33021d161b212b4c33c0a87968f722ce29c8c64406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-pkix \
mvn-org.bouncycastle-bcpkix-jdk15 \
mvn-org.bouncycastle-bcpkix-jdk15-pom- \
mvn-org.bouncycastle-bcpkix-jdk15on \
mvn-org.bouncycastle-bcpkix-jdk15on-pom- \
mvn-org.bouncycastle-bcpkix-jdk15to18 \
mvn-org.bouncycastle-bcpkix-jdk15to18-pom- \
mvn-org.bouncycastle-bcpkix-jdk16 \
mvn-org.bouncycastle-bcpkix-jdk16-pom- \
mvn-org.bouncycastle-bcpkix-jdk18 \
mvn-org.bouncycastle-bcpkix-jdk18-pom- \
mvn-org.bouncycastle-bcpkix-jdk18on \
mvn-org.bouncycastle-bcpkix-jdk18on-pom- \
osgi-bcpkix"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcutil-jdk18on"

inherit rpm
