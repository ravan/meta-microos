SUMMARY = "JLine Native Library"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x. \
 \
This package contains the native library."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-native-3.30.16-1.2.aarch64.rpm"
RPM_HASH = "6696b0d8731f59378d38c959191fea9a115c36a960f3e49cd4d366bfe7668c2830426d425a85673602c657087408f7f2d7ac2e50805e3b0aa6ffeadd20f1c82d"

RPROVIDES:${PN} += "jline3-native \
libjlinenative.so \
mvn-org.jline-jline-native \
mvn-org.jline-jline-native-pom- \
osgi-org.jline.native"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
