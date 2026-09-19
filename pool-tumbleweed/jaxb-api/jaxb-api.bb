SUMMARY = "Jakarta XML Binding API"
DESCRIPTION = "The Jakarta XML Binding provides an API and tools that automate the mapping \
between XML documents and Java objects."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "jaxb-api-4.0.0-3.9.noarch.rpm"
RPM_HASH = "73188d80b303957456d815e0c34c14563f88246d16c96f0ae65ba3065180cfc60d6625212bee6fd288e40705e24b83f10612b962586ad1b12a0e045f0c2e5113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxb-api \
mvn-jakarta.xml.bind-jakarta.xml.bind-api \
mvn-jakarta.xml.bind-jakarta.xml.bind-api-pom- \
osgi-jakarta.xml.bind-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jakarta.activation-jakarta.activation-api"

inherit rpm
