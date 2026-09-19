SUMMARY = "Intelligent predictive text entry platform (development files)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains development files. \
 \
This package contains the header files needed to compile applications or shared objects that use libpresage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "libpresage-devel-0.9.1-18.6.aarch64.rpm"
RPM_HASH = "a01914581a5ebbdfbf99813decf60faec54aa1e1b8ac70bb4c00dac48f98a7aada0ea9c3acd6ea2cfc5a2ff560ef6b2d38d0c94d37fb2c08b6931dc9b91b8b87"

RPROVIDES:${PN} += "libpresage-devel"

RDEPENDS:${PN} += "libpresage1"

inherit rpm
