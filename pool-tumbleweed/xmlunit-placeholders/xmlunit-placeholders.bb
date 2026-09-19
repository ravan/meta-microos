SUMMARY = "XMLUnit for Java Placeholder DSL for Comparisons"
DESCRIPTION = "This package provides XMLUnit for Java Placeholder DSL for Comparisons."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "xmlunit-placeholders-2.11.0-2.4.noarch.rpm"
RPM_HASH = "d13310457b483c3a48239dfc7ce0fadc0961bca8eff361917a61daa565cb7e4f8f5bbff5be148ceb961ae0e56bb73a738323c4f7f064a728eadd99c68bb5d4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.xmlunit-xmlunit-placeholders \
mvn-org.xmlunit-xmlunit-placeholders-pom- \
osgi-org.xmlunit.xmlunit-placeholders \
xmlunit-placeholders"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.xmlunit-xmlunit-core"

inherit rpm
