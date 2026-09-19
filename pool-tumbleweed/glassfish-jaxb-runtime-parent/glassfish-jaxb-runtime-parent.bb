SUMMARY = "JAXB Runtime parent POM"
DESCRIPTION = "This package contains Runtime parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-runtime-parent-2.3.1-12.4.noarch.rpm"
RPM_HASH = "d8ba59e256ed7bb77a2a6405f29b9febf89a63eef42b200d5858832910f2d8069cb67b0fd1713b2976ec37fa0a5c784199a045e5b9b0bc190045139a5642c05e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-runtime-parent \
mvn-com.sun.xml.bind.mvn-jaxb-runtime-parent-pom-"

RDEPENDS:${PN} += "javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
