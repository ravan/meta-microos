SUMMARY = "Codemodel parent POM"
DESCRIPTION = "This package contains codemodel parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-codemodel-parent-2.3.1-12.4.noarch.rpm"
RPM_HASH = "c445165a5b218d47ecd8788d74d19ee760f212851f004563a79aafdd260cc9dd22032037c1912a41c885646d0ffe76021da5121aca0ef93dddbde4fbd295c599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-codemodel-parent \
mvn-com.sun.xml.bind.mvn-jaxb-codemodel-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
