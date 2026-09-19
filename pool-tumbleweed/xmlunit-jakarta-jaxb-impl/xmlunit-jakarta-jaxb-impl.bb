SUMMARY = "XMLUnit for Java JAXB support using Jakarta EE packages"
DESCRIPTION = "This package provides XMLUnit for Java JAXB support using Jakarta EE packages."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "xmlunit-jakarta-jaxb-impl-2.11.0-2.4.noarch.rpm"
RPM_HASH = "e6e306feac7ca09306856dbdc9e4d943d312724a7bae251f97928d561b50e4a8061cf7bc12f5227bf2b02fea69fddfb1db1fcb4c9b6300772783f13cf329524f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.xmlunit-xmlunit-jakarta-jaxb-impl \
mvn-org.xmlunit-xmlunit-jakarta-jaxb-impl-pom- \
osgi-org.xmlunit.xmlunit-jakarta-jaxb-impl \
xmlunit-jakarta-jaxb-impl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jakarta.xml.bind-jakarta.xml.bind-api \
mvn-org.xmlunit-xmlunit-core"

inherit rpm
