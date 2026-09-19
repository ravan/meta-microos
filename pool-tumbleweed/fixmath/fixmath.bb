SUMMARY = "Fixed-point math operations library"
DESCRIPTION = "fixmath is a fixed-point math operations library written in C and \
implementing the Q16.16 format."
LICENSE = "MIT"

PV = "2022.07.20"

RPM_NAME = "fixmath-2022.07.20-6.11.aarch64.rpm"
RPM_HASH = "69d7e70689aa225052bdac2d0d4eb9b75c051f61629c41d916e46f1771b4f07e2cc427d06d9819f0593a45a6aec34ccd8ceb97e9b8f87682562d2fff46fe9014"

RPROVIDES:${PN} += "fixmath \
libfixmath.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
