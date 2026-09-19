SUMMARY = "XMLUnit 1.x Compatibility Layer"
DESCRIPTION = "This package provides XMLUnit 1.x Compatibility Layer."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "xmlunit-legacy-2.11.0-2.4.noarch.rpm"
RPM_HASH = "c71316c712f64741785a52677b720da9adb450c1504830dfd0deea2371e0f613d1d17f84b091f858f53f6d4af8951bedbe810e6007e6e771264121ee85b56f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.xmlunit-xmlunit-legacy \
mvn-org.xmlunit-xmlunit-legacy-pom- \
mvn-xmlunit-xmlunit \
mvn-xmlunit-xmlunit-pom- \
osgi-org.xmlunit.xmlunit-legacy \
xmlunit \
xmlunit-legacy"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-junit-junit \
mvn-org.xmlunit-xmlunit-core"

inherit rpm
