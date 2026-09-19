SUMMARY = "JLine Style"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x. \
 \
This package contains the styling api."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-style-3.30.16-1.2.noarch.rpm"
RPM_HASH = "bc71309f5c16937ac20ff1c5cd69415fae22ec0ea7091e43f11b9b56ebe922ea0d1f27d8b6a59b8c6008e15ed0ff01c9a77289ffebeb0ba89822744765623382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-style \
mvn-org.jline-jline-style \
mvn-org.jline-jline-style-pom- \
osgi-org.jline.style"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-terminal"

inherit rpm
