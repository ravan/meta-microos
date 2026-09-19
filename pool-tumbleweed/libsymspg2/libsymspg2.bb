SUMMARY = "The shared library for SPGLIB"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "libsymspg2-2.4.0-1.9.aarch64.rpm"
RPM_HASH = "a3f1d0b476611cd6e4a1e309f0bd1744ce1ab75459d1ca29b5ee068e8d940b5aabc14f516e5b6f829f507a915c3c1b9dd4016bd1b4805e29e4b371afb74c19d9"

RPROVIDES:${PN} += "libsymspg.so.2 \
libsymspg2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
