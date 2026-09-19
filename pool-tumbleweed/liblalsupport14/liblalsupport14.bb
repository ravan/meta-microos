SUMMARY = "Shared library for LALSupport"
DESCRIPTION = "The LSC Algorithm Library Suite (LALSuite) is comprised of various \
gravitational wave data analysis routines written in C following the ISO/IEC \
9899:1999 standard. \
 \
This package provides the shared library for lalsupport."
LICENSE = "GPL-2.0-only"

PV = "7.7.0"

RPM_NAME = "liblalsupport14-7.7.0-4.1.aarch64.rpm"
RPM_HASH = "a23ad4a00bc4fb3dc436c71fb197e969e8622ba885b87a2bef001b4269a95e801bb408fdda51e4b318088f4abfe58192b6bee7e94dad90d446cac4e58c0cdb03"

RPROVIDES:${PN} += "liblalsupport.so.14 \
liblalsupport14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
liblal.so.20 \
libm.so.6 \
libz.so.1"

inherit rpm
