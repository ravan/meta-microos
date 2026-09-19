SUMMARY = "JLine JNI Terminal"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x. \
 \
This package contains terminal implementations leveraging the JNI library."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-terminal-jni-3.30.16-1.2.noarch.rpm"
RPM_HASH = "d05ef73c85eaba16cc4fec7236ef5ff8181bd99341150037d8e63d67d4f52d2c5ae1f0c9d2a1aa41f7b958da55661e3773f7b151c176d60e5190f6cb0e461166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-terminal-jni \
mvn-org.jline-jline-terminal-jni \
mvn-org.jline-jline-terminal-jni-pom- \
osgi-org.jline.terminal-jni"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-native \
mvn-org.jline-jline-terminal"

inherit rpm
