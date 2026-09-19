SUMMARY = "Bouncy Castle Cryptography APIs for Java"
DESCRIPTION = "The Bouncy Castle Crypto package is a Java implementation of cryptographic \
algorithms. This jar contains JCE provider and lightweight API for the \
Bouncy Castle Cryptography APIs for JDK 1.5 to JDK 1.8."
LICENSE = "Apache-2.0 & MIT"

PV = "1.85"

RPM_NAME = "bouncycastle-1.85-1.1.noarch.rpm"
RPM_HASH = "4fbd5bd9099fc25882270ec56e3887b9b05aed200dbb3c848a5b59a9257a498836e574455fa3635cfa951193bec84509c6fca8edd5b5b7c939224dbc815e2f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcprov \
bouncycastle \
config-bouncycastle \
mvn-org.bouncycastle-bcprov-jdk15 \
mvn-org.bouncycastle-bcprov-jdk15-pom- \
mvn-org.bouncycastle-bcprov-jdk15on \
mvn-org.bouncycastle-bcprov-jdk15on-pom- \
mvn-org.bouncycastle-bcprov-jdk15to18 \
mvn-org.bouncycastle-bcprov-jdk15to18-pom- \
mvn-org.bouncycastle-bcprov-jdk16 \
mvn-org.bouncycastle-bcprov-jdk16-pom- \
mvn-org.bouncycastle-bcprov-jdk18 \
mvn-org.bouncycastle-bcprov-jdk18-pom- \
mvn-org.bouncycastle-bcprov-jdk18on \
mvn-org.bouncycastle-bcprov-jdk18on-pom- \
osgi-bcprov"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
