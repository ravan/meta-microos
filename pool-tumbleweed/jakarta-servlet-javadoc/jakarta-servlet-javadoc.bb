SUMMARY = "Javadoc for jakarta-servlet"
DESCRIPTION = "API documentation for jakarta-servlet."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "6.1.0"

RPM_NAME = "jakarta-servlet-javadoc-6.1.0-1.8.noarch.rpm"
RPM_HASH = "632e3d91a36254f70c1b057a509031ec591ec5650b6ffbdcdb4c3abff84dcd7c2ef2b57646543c73358c119b06ef8f12cd7b3a489a5f3889db6d6421c39ec3ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-servlet-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
