SUMMARY = "Javadoc for unit-api"
DESCRIPTION = "This package contains javadoc for unit-api."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "unit-api-javadoc-1.0-3.10.noarch.rpm"
RPM_HASH = "2edd67d42a7eccf32e9fa1209f88185610369c9bb4836c41b58126db6eb20b6a20e1eaa072b7e51e794c2bb6ad4f65f3a05bad42fe4e7310fcb1a9608c359e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unit-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
