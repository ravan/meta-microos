SUMMARY = "Static libraries, header files and documentation for libmspack"
DESCRIPTION = "The libmspack-devel package contains the header files and static \
libraries necessary for developing programs using libmspack."
LICENSE = "LGPL-2.1-only"

PV = "0.11"

RPM_NAME = "libmspack-devel-0.11-2.11.aarch64.rpm"
RPM_HASH = "6e2986469aa97e1349ff0007acaab7bef4b014abe6ec4edf5e56c2d1b6c86d7b7d659e971086cc2e4b644d792d6b942b1398f469225e730e98afe6fe4e6c78c4"

RPROVIDES:${PN} += "libmspack-devel \
pkgconfig-libmspack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmspack0"

inherit rpm
