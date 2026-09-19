SUMMARY = "JLine Reader"
DESCRIPTION = "JLine is a Java library for handling console input. It is similar in \
functionality to BSD editline and GNU readline but with additional features \
that bring it in par with ZSH line editor. People familiar with the \
readline/editline capabilities for modern shells (such as bash and tcsh) will \
find most of the command editing features of JLine to be familiar. \
 \
JLine 3.x is an evolution of JLine 2.x. \
 \
This package contains the line reader (including completion, history, etc…)."
LICENSE = "BSD-3-Clause"

PV = "3.30.16"

RPM_NAME = "jline3-reader-3.30.16-1.2.noarch.rpm"
RPM_HASH = "186001d7430185e053f98609614147781e62afc160f3f3c5620182fd0813315053e7b24bfcdb3d84a83143773d0de95fd6d818d84ede113cd580ec7baaeb0c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline3-reader \
mvn-org.jline-jline-reader \
mvn-org.jline-jline-reader-pom- \
osgi-org.jline.reader"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jline-jline-terminal"

inherit rpm
