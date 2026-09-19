SUMMARY = "XSOM"
DESCRIPTION = "XML Schema Object Model (XSOM) is a Java library that allows \
applications to easily parse XML Schema documents and inspect \
information in them. It is expected to be useful for applications \
that need to take XML Schema as an input."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-xsom-2.3.1-12.4.noarch.rpm"
RPM_HASH = "84c4162460e05fc58399c9ebd6c3603e57785fef6b8f39d0affcd8afd6bbbd76577a6ec44e77353b18bcab8739d8f359db1f972abc422260fb2e3969a5ca53c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-xsom \
mvn-org.glassfish.jaxb-xsom \
mvn-org.glassfish.jaxb-xsom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.external-relaxng-datatype"

inherit rpm
