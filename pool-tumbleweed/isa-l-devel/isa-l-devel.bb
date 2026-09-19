SUMMARY = "Development files for the Intel Intelligent Storage Acceleration Library"
DESCRIPTION = "ISA-L is a collection of optimized low-level functions targeting \
storage applications. \
 \
This package contains the development headers for the library found \
in libisal2."
LICENSE = "BSD-3-Clause"

PV = "2.32.1"

RPM_NAME = "isa-l-devel-2.32.1-1.3.aarch64.rpm"
RPM_HASH = "e3ab1dfd6e07f21eaf199a214cef52106091c8b26485b905adfa78b83239e5681b3759dfe5e875529c7c791e858c93e0aaeaffc2aa1c4ba685b4ec379e652ad6"

RPROVIDES:${PN} += "isa-l-devel \
pkgconfig-libisal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libisal2"

inherit rpm
