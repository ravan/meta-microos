SUMMARY = "Development libraries for BLACS (openmpi5)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against openmpi5."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libblacs2-openmpi5-devel-static-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "0d92dcfc71fcb4926afbc5e5e1699e829b334585faedcd5ec69641b570bfb7090ead97b0169bfb359bd9b5dfaf6400976800550a67eccea24dde7280f60ae8c6"

RPROVIDES:${PN} += "libblacs2-openmpi-devel \
libblacs2-openmpi5-devel-static"

RDEPENDS:${PN} += "libblacs2-openmpi5-devel"

inherit rpm
