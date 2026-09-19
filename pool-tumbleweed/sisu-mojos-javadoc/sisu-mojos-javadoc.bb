SUMMARY = "API documentation for sisu-mojos"
DESCRIPTION = "This package contains API documentation for sisu-mojos."
LICENSE = "EPL-1.0 & EPL-2.0"

PV = "1.1.0"

RPM_NAME = "sisu-mojos-javadoc-1.1.0-2.1.noarch.rpm"
RPM_HASH = "70539474808cfab974228bb292bcf41e4d52cc7ddc8fb1570392f8ee5cea69022f839b889974dd002104421de6d1fac5096cc872b8776a604193444c6288f9d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sisu-mojos-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
