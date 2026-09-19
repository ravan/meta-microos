SUMMARY = "Java library for modeling data in XML format"
DESCRIPTION = "The Kojan XML library is used to model data according to the \
entity–relationship (ER) model and write and read data in XML \
format. It allows you to define data entities with their properties, \
such as attributes and relationships, and serialize and deserialize \
data in XML format."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "kojan-xml-1.0.1-1.5.noarch.rpm"
RPM_HASH = "66333aead6c709e8b465dcb0e21e157ae552af98de136213047151bb2e124628f36f4b11b9f2d7f3e4b07d246c8588915b75f86051620bf61f1eb318e4cbe724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kojan-xml \
mvn-io.kojan-kojan-xml \
mvn-io.kojan-kojan-xml-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
