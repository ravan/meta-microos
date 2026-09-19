SUMMARY = "Library for Elliptic Curve Integer Factorization"
DESCRIPTION = "Library for ecm. To use the library, you need to install ecm-devel, include \
'ecm.h' in your source file and link with -lecm."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "libecm1-7.0.5-1.14.aarch64.rpm"
RPM_HASH = "0f415e8449181da177f2b4f97583ba18aad7a97549da31510c5a6489bba576834f649f03998db9217535e94c7d3cef1b4a5012f3f02329f374c1a2cececa5dbd"

RPROVIDES:${PN} += "libecm.so.1 \
libecm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
