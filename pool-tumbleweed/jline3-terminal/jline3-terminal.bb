SUMMARY = "JLine Terminal"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x. \
 \
This package contains the Terminal api and implementations."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-terminal-3.30.16-1.2.noarch.rpm"
RPM_HASH = "45c3784433b698972640a1fc04408f74321d98315a8fd9af30b777ece1a5ad37d87bffa27219b9ecbcd437826be84bf9a8bcd185d630bec2cd3ad43c0c88f81a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-terminal \
mvn-org.jline-jline-terminal \
mvn-org.jline-jline-terminal-pom- \
osgi-org.jline.terminal"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-native"

inherit rpm
