SUMMARY = "Binary-decimal and decimal-binary routines for IEEE doubles"
DESCRIPTION = "Double-conversion provides binary-decimal and decimal-binary routines \
for IEEE double-precision floating point numbers. The library \
consists of conversion routines that have been extracted from the V8 \
JavaScript engine."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "libdouble-conversion3-3.4.0-1.4.aarch64.rpm"
RPM_HASH = "e5553811084ad4f13e94f1590ae08d9d780b292e3ba9486b1c6697ee62ec826b75401a8c7598eed5245e20d9d3192756954acdd1b15e98ad6d8d82564f89c54d"

RPROVIDES:${PN} += "libdouble-conversion.so.3 \
libdouble-conversion3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
