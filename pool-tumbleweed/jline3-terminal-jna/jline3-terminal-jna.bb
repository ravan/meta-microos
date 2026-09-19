SUMMARY = "JLine JNA Terminal"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x. \
 \
This package contains terminal implementations leveraging the JNA library."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-terminal-jna-3.30.16-1.2.noarch.rpm"
RPM_HASH = "1786367bdec3123d14cce05ab5fcff3857ca30811984d98f94deaa4a115481e1fc22893db768410b2decb23fe5e88de98c493355ba6c6a6a457386f5bad8f8ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-terminal-jna \
mvn-org.jline-jline-terminal-jna \
mvn-org.jline-jline-terminal-jna-pom- \
osgi-org.jline.terminal-jna"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.java.dev.jna-jna \
mvn-org.jline-jline-terminal"

inherit rpm
