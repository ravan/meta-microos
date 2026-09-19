SUMMARY = "JLine Console UI"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x. \
 \
This package contains the command registry, object printer and widget \
implementations."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-console-ui-3.30.16-1.2.noarch.rpm"
RPM_HASH = "73771deb60c77edc3543d30e669d4a1826e90aba4b797f5dc51c1c8f8651d4c44975f72099e6902f83264be44fea954a82c843ae8652321b46f2b43ee79f6680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-console-ui \
mvn-org.jline-jline-console-ui \
mvn-org.jline-jline-console-ui-pom- \
osgi-org.jline.console-ui"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-builtins"

inherit rpm
