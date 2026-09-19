SUMMARY = "Javadoc for jbcrypt"
DESCRIPTION = "This package contains API documentation for jbcrypt."
LICENSE = "ISC"

PV = "1.0.2"

RPM_NAME = "jbcrypt-javadoc-1.0.2-1.9.noarch.rpm"
RPM_HASH = "8d4a6c1458e3eb3e13f8410ead5017f59fb81ab9926d7a9749a645a39df8fa6e7343ad1794d64a6e8e5f247a15be3cec2aef192e818889826a4c3b7050d724ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jbcrypt-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
