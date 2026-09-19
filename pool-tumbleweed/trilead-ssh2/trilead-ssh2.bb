SUMMARY = "SSH-2 protocol implementation in pure Java"
DESCRIPTION = "Trilead SSH-2 for Java is a library which implements the SSH-2 protocol in pure \
Java (tested on J2SE 1.4.2 and 5.0). It allows one to connect to SSH servers \
from within Java programs. It supports SSH sessions (remote command execution \
and shell access), local and remote port forwarding, local stream forwarding, \
X11 forwarding and SCP. There are no dependencies on any JCE provider, as all \
crypto functionality is included."
LICENSE = "BSD-3-Clause & MIT"

PV = "217.293.v56de4d4d3515"

RPM_NAME = "trilead-ssh2-217.293.v56de4d4d3515-1.9.noarch.rpm"
RPM_HASH = "3b34ef5daf8592841d1bebf9176de4f6b9031b6800c044f4de118d54be605de4fd4bebe199fd056f7d621830fcedd403265c0ecb56b5ced001cc48f7531c6b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.trilead-trilead-ssh2 \
mvn-com.trilead-trilead-ssh2-pom- \
mvn-org.jenkins-ci-trilead-ssh2 \
mvn-org.jenkins-ci-trilead-ssh2-pom- \
mvn-org.tmatesoft.svnkit-trilead-ssh2 \
mvn-org.tmatesoft.svnkit-trilead-ssh2-pom- \
trilead-ssh2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.i2p.crypto-eddsa \
mvn-org.connectbot-jbcrypt"

inherit rpm
