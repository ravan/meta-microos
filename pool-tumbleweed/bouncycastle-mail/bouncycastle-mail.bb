SUMMARY = "Bouncy Castle S/MIME API"
DESCRIPTION = "The Bouncy Castle Java S/MIME APIs for handling S/MIME protocols. The APIs can \
be used in conjunction with a JCE/JCA provider such as the one provided with \
the Bouncy Castle Cryptography APIs. The JavaMail API and the Java activation \
framework will also be needed."
LICENSE = "MIT"

PV = "1.85"

RPM_NAME = "bouncycastle-mail-1.85-1.1.noarch.rpm"
RPM_HASH = "8bb31a92c446130addb95002d1f4b806b59db64d4776aeb16e9c66205ccd976e35c73ae350ca96f32187fec55d5c4023a6e2648feb76d92ba79cb44a1704d1cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-mail \
mvn-org.bouncycastle-bcmail-jdk15 \
mvn-org.bouncycastle-bcmail-jdk15-pom- \
mvn-org.bouncycastle-bcmail-jdk15on \
mvn-org.bouncycastle-bcmail-jdk15on-pom- \
mvn-org.bouncycastle-bcmail-jdk15to18 \
mvn-org.bouncycastle-bcmail-jdk15to18-pom- \
mvn-org.bouncycastle-bcmail-jdk16 \
mvn-org.bouncycastle-bcmail-jdk16-pom- \
mvn-org.bouncycastle-bcmail-jdk18 \
mvn-org.bouncycastle-bcmail-jdk18-pom- \
mvn-org.bouncycastle-bcmail-jdk18on \
mvn-org.bouncycastle-bcmail-jdk18on-pom- \
osgi-bcmail"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcpkix-jdk18on"

inherit rpm
