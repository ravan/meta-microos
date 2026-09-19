SUMMARY = "Jansi Core"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-jansi-core-3.30.16-1.2.noarch.rpm"
RPM_HASH = "5e9c526cb1a4a72024cb2eae2063191dcc84cc52e3698fe03d398730360f1b722433170b30de9de371da672f7a11c2700c696ce7bb6496c384e578259b823f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-jansi-core \
mvn-org.jline-jansi-core \
mvn-org.jline-jansi-core-pom- \
osgi-org.jline.jansi-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-terminal"

inherit rpm
