SUMMARY = "JLine Builtins"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x. \
 \
This package contains several high level tools: less pager, nano editor, screen \
multiplexer, etc…"
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-builtins-3.30.16-1.2.noarch.rpm"
RPM_HASH = "5b95e629ffba5d3a1a0f85fd0f83e32e8f0b556274beaf69fbe645d35ccb73075eabefeabdb14677b2324ca046e2d51b37362ccbdb4c0db1293d74b1a41f0fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-builtins \
mvn-org.jline-jline-builtins \
mvn-org.jline-jline-builtins-pom- \
osgi-org.jline.builtins"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-reader \
mvn-org.jline-jline-style"

inherit rpm
