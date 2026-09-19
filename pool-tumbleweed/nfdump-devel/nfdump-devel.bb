SUMMARY = "Development files for libnfdump"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use libnfdump."
LICENSE = "BSD-3-Clause"

PV = "1.7.10"

RPM_NAME = "nfdump-devel-1.7.10-1.1.aarch64.rpm"
RPM_HASH = "f4946d5957677715d7c6d094af59411a9b189c535c1d7ef3a86f339136d41812a6207d49da4a0fd7687a438cd55b3595ea0f73b36a2837f3af5014490b45057c"

RPROVIDES:${PN} += "nfdump-devel \
pkgconfig-nfdump"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfdump-1-7-10 \
libnffile-1-7-10"

inherit rpm
