SUMMARY = "Header files, libraries and development documentation for freeradius-client"
DESCRIPTION = "This package contains the header files, static libraries and \
development documentation for freeradius-client. You need to install \
freeradius-client-devel if you want to develop applications using \
freeradius-client."
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "freeradius-client-devel-1.1.7-3.9.aarch64.rpm"
RPM_HASH = "6fac6a4ac7be21d2269a0c9bce39e84f4be9d48ff2936d98f756a0e66d17e8fa30414453934babfdd3a079a33323865d1141f74832436d1750a331ee03d8cfe4"

RPROVIDES:${PN} += "freeradius-client-devel"

RDEPENDS:${PN} += "freeradius-client-libs \
glibc-devel"

inherit rpm
