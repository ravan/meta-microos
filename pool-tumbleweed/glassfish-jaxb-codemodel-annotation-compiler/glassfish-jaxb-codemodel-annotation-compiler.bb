SUMMARY = "Codemodel Annotation Compiler"
DESCRIPTION = "The annotation compiler ant task for the CodeModel java source code \
generation library."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-codemodel-annotation-compiler-2.3.1-12.4.noarch.rpm"
RPM_HASH = "98048ed1a2ba93df8b3b76d19a569600744569a2d2cd7d7bd140a186c94620016da4757ece7ba6624df2851ae941f75181eb0d12c7df74969537651f0d4b6e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-codemodel-annotation-compiler \
mvn-org.glassfish.jaxb-codemodel-annotation-compiler \
mvn-org.glassfish.jaxb-codemodel-annotation-compiler-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.istack-istack-commons-tools \
mvn-org.glassfish.jaxb-codemodel"

inherit rpm
