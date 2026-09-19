SUMMARY = "Jansi Bundle"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-jansi-3.30.16-1.2.aarch64.rpm"
RPM_HASH = "b91ca963368f0c2ae9b018146b14e51f2aaccd5c67bb2bb9f16e37a58928f685f3babb2fdf3664020ead6fb5dff4c2bac6250debc0341382c4636c3cadca3b52"

RPROVIDES:${PN} += "jline3-jansi \
mvn-org.jline-jansi \
mvn-org.jline-jansi-pom- \
osgi-org.jline.jansi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
