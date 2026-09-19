SUMMARY = "Javadoc for bsf"
DESCRIPTION = "Bean Scripting Framework (BSF) is a set of Java classes which provides \
scripting language support within Java applications, and access to Java \
objects and methods from scripting languages. BSF allows one to write \
JSPs in languages other than Java while providing access to the Java \
class library. In addition, BSF permits any Java application to be \
implemented in part (or dynamically extended) by a language that is \
embedded within it. This is achieved by providing an API that permits \
calling scripting language engines from within Java, as well as an \
object registry that exposes Java objects to these scripting language \
engines. \
 \
This package contains the javadoc documentation for the Bean Scripting \
Framework."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "bsf-javadoc-2.4.0-18.9.noarch.rpm"
RPM_HASH = "8a8c0e231529f44acca14ccef5958337c019e58fa8c2e882c0fb65f3880a77e7459e85ce3789fa4296f8414b14714915f3aeaf5873604dde93ec0ced2e3ff529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsf-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
