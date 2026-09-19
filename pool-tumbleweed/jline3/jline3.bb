SUMMARY = "Java library for handling console input"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-3.30.16-1.2.aarch64.rpm"
RPM_HASH = "54d87c3aad870e5a89ceca4387ccc101ded215939df2adbc28f0b572d39e8049ad1eb2fdbac07925f763d658d6a19e20aee2845b9c5fb4aad827a5e8ec059cc1"

RPROVIDES:${PN} += "jline3 \
mvn-org.jline-jline \
mvn-org.jline-jline-pom- \
osgi-org.jline"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
