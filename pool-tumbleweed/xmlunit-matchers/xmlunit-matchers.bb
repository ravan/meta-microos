SUMMARY = "XMLUnit for Java Hamcrest Matchers"
DESCRIPTION = "This package provides XMLUnit for Java Hamcrest Matchers."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "xmlunit-matchers-2.11.0-2.4.noarch.rpm"
RPM_HASH = "d0ecac9743377e584d89d6817a733977ef61643b476e205be6e32e787ac10a7a166f9e31487ef29f0591e488fa87318993c3d07cf704bbe44647fc5c6805be1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.xmlunit-xmlunit-matchers \
mvn-org.xmlunit-xmlunit-matchers-pom- \
osgi-org.xmlunit.xmlunit-matchers \
xmlunit-matchers"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.hamcrest-hamcrest-core \
mvn-org.xmlunit-xmlunit-core"

inherit rpm
