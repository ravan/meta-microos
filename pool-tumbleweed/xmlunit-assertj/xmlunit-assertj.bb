SUMMARY = "XMLUnit with AssertJ fluent API"
DESCRIPTION = "This package provides XMLUnit with AssertJ fluent API."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "xmlunit-assertj-2.11.0-2.4.noarch.rpm"
RPM_HASH = "38730f103ea80d394bd1bb3cd62977c0cf0440710511dae620d2e77d6de717d191509a3383616287926b65557591c843552399d919ddbf685cf548a06bf2cad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.xmlunit-xmlunit-assertj \
mvn-org.xmlunit-xmlunit-assertj-pom- \
mvn-org.xmlunit-xmlunit-assertj3 \
mvn-org.xmlunit-xmlunit-assertj3-pom- \
osgi-org.xmlunit.xmlunit-assertj3 \
xmlunit-assertj"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.assertj-assertj-core \
mvn-org.xmlunit-xmlunit-core"

inherit rpm
