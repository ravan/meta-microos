SUMMARY = "Headers and devel files for TRNG"
DESCRIPTION = "TRNG is a C++ pseudo random number generator library. \
 \
This package provides the headers and devel files for developing \
applications against TRNG."
LICENSE = "BSD-3-Clause"

PV = "4.28"

RPM_NAME = "trng-devel-4.28-1.3.aarch64.rpm"
RPM_HASH = "4e247b332fe2756fb8ea7e8674c78e3a37006687c3884b5163e78dc18fa012a4d9bd0eb1c554e5653cb3ff5202d8d1915aab57c27adfd4e9c2d0f4cc1a8692e4"

RPROVIDES:${PN} += "cmake-trng4 \
trng-devel"

RDEPENDS:${PN} += "libtrng4-28"

inherit rpm
