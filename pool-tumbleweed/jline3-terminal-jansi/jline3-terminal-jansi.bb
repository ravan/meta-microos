SUMMARY = "JLine JANSI Terminal"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x. \
 \
This package contains terminal implementations leveraging the Jansi library."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-terminal-jansi-3.30.16-1.2.noarch.rpm"
RPM_HASH = "9bc1081e7556121c6ed6943c3391bbcbbc0838c733a5aff9179dbd580b2e33990658f2a5fb76e1a335255604055b63dfc170ef1ed8b1375adbb95fbb10e6ad16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-terminal-jansi \
mvn-org.jline-jline-terminal-jansi \
mvn-org.jline-jline-terminal-jansi-pom- \
osgi-org.jline.terminal-jansi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.fusesource.jansi-jansi \
mvn-org.jline-jline-terminal"

inherit rpm
