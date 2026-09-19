SUMMARY = "JLine Curses"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-curses-3.30.16-1.2.noarch.rpm"
RPM_HASH = "37fa2dba0fb751ff8bd1e37013070d50e61f86792f2626b6e5df3d47f53f31908582b1c3005dffdf19820f29e8629fda20b6c4f785f55a63354b4bb1be558b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-curses \
mvn-org.jline-jline-curses \
mvn-org.jline-jline-curses-pom- \
osgi-org.jline.curses"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-reader \
mvn-org.jline-jline-terminal"

inherit rpm
