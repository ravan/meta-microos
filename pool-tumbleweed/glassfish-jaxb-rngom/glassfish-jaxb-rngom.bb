SUMMARY = "RELAX NG Object Model/Parser"
DESCRIPTION = "This package contains RELAX NG Object Model/Parser."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-rngom-2.3.1-12.4.noarch.rpm"
RPM_HASH = "f7240cd06b1ac1154364775f5fcc0ab078578b2e4b87e0558d4538221c0aa24ae5f22e3f6c9773ba0a6d014a2677834d6db98e52f909fb9c9d3ae2c31615310a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-rngom \
mvn-com.sun.xml.bind.external-rngom \
mvn-com.sun.xml.bind.external-rngom-pom-"

RDEPENDS:${PN} += "javapackages-filesystem \
mvn-com.sun.xml.bind.external-relaxng-datatype"

inherit rpm
