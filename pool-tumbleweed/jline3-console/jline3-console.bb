SUMMARY = "JLine Console"
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

RPM_NAME = "jline3-console-3.30.16-1.2.noarch.rpm"
RPM_HASH = "c754d47e606cf890bff43798582aa93bdab421c57fac000df6339478e220e8d7fa204d8fe36da5422177e76fb37491f6bc15b855def887951294e47f9ecbfec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-console \
mvn-org.jline-jline-console \
mvn-org.jline-jline-console-pom- \
osgi-org.jline.console"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-builtins \
mvn-org.jline-jline-style"

inherit rpm
