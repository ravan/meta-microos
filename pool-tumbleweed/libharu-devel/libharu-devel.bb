SUMMARY = "Development files for libharu"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use libharu."
LICENSE = "Zlib"

PV = "2.4.6"

RPM_NAME = "libharu-devel-2.4.6-1.1.aarch64.rpm"
RPM_HASH = "dd1efc0caa4a65d1e6d34bfd2931ab74976779020066c60dfb097c4a2ff7b314a77376a172b9a7f1f4ff6d64087df77a67c530ad8d2e5c7417f17284eedb46c6"

RPROVIDES:${PN} += "libharu-devel"

RDEPENDS:${PN} += "libhpdf2-4 \
libpng-devel \
zlib-devel"

inherit rpm
