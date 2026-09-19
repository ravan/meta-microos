SUMMARY = "Multi-Schema Validator XML Schema Library"
DESCRIPTION = "Multi-Schema Validator XML Schema Library."
LICENSE = "Apache-1.1 & BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-xsdlib-2013.6.1-7.2.noarch.rpm"
RPM_HASH = "2afa98235da7540f3b4a6c58a216b8c0ef00c28e7e1149225c862d6256eeaa46924edcc5bde4bb05b37fd12be300b46124a4df7ba343f7ebedc2aee4be93dff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-xsdlib \
mvn-com.sun.msv.datatype.xsd-xsdlib \
mvn-com.sun.msv.datatype.xsd-xsdlib-pom- \
mvn-net.java.dev.msv-xsdlib \
mvn-net.java.dev.msv-xsdlib-pom- \
osgi-net.java.dev.msv.xsdlib"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-relaxngDatatype-relaxngDatatype \
mvn-xml-resolver-xml-resolver"

inherit rpm
