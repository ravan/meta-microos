SUMMARY = "Scripting for Java (BeanShell Version 2.x)"
DESCRIPTION = "BeanShell is an embeddable Java source interpreter with object \
scripting language features, written in Java. BeanShell executes \
standard Java statements and expressions, in addition to obvious \
scripting commands and syntax. BeanShell supports scripted objects as \
simple method closures like those in Perl and JavaScript. BeanShell \
can be used interactively for Java experimentation and debugging or \
as a scripting engine for applications."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-2.1.1-2.9.noarch.rpm"
RPM_HASH = "678b3d35258a444ed08b975fa42ac2dba8475ad54648d64040e080336b60498a182401b7d8af2840442e7f431bbbc4880cdc482c521083523660bc7a3b193bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2 \
mvn-bsh-bsh \
mvn-bsh-bsh-bsf \
mvn-bsh-bsh-bsf-pom- \
mvn-bsh-bsh-pom- \
mvn-org.apache-extras.beanshell-bsh \
mvn-org.apache-extras.beanshell-bsh-pom- \
mvn-org.beanshell-bsh \
mvn-org.beanshell-bsh-pom- \
mvn-org.beanshell-bsh2 \
mvn-org.beanshell-bsh2-pom-"

RDEPENDS:${PN} += "bsf \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
