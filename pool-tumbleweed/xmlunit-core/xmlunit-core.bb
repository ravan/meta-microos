SUMMARY = "XMLUnit for Java core package"
DESCRIPTION = "This package provides XMLUnit for Java core package."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "xmlunit-core-2.11.0-2.4.noarch.rpm"
RPM_HASH = "602302fa3fed283d813cdbcccecc1eed4432d06f360c43e4bab26d1a88feebbad2e2d1178a8a52d03e603daa373ab3274f869463e37d02d3e6ca9afddda029b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.xmlunit-xmlunit-core \
mvn-org.xmlunit-xmlunit-core-pom- \
osgi-org.xmlunit.xmlunit-core \
xmlunit-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
