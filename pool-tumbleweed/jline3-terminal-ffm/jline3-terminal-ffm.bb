SUMMARY = "JLine FFM Terminal"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-terminal-ffm-3.30.16-1.2.noarch.rpm"
RPM_HASH = "16ffababbdc412ef5e3e6aa1c734f93003224742bc392459636e1518f70034d03b23346344acdd16020346d14ecbca7b3b8831652d8954ba66ea73bd505886c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-terminal-ffm \
mvn-org.jline-jline-terminal-ffm \
mvn-org.jline-jline-terminal-ffm-pom- \
osgi-org.jline.terminal-ffm"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-terminal"

inherit rpm
