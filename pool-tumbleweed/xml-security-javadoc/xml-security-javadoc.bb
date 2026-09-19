SUMMARY = "Javadoc for xml-security"
DESCRIPTION = "This package contains javadoc for xml-security."
LICENSE = "Apache-2.0"

PV = "2.1.7"

RPM_NAME = "xml-security-javadoc-2.1.7-5.10.noarch.rpm"
RPM_HASH = "062442f153c334b830458ef0ded2dd165c3f8af3e45fec6af53695be6664337b38beb81c88b1f3f82b442e0b291d1001561d97ed07e7641723075ded08650c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-security-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
