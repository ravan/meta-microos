SUMMARY = "Development files for BCD/DCB routines for IEEE doubles"
DESCRIPTION = "Double-conversion provides binary-decimal and decimal-binary routines \
for IEEE double-precision floating point numbers. The library \
consists of conversion routines that have been extracted from the V8 \
JavaScript engine. \
 \
This package provides libraries and header files for developing applications \
that use double-conversion."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "double-conversion-devel-3.4.0-1.4.aarch64.rpm"
RPM_HASH = "c4984a68bd18b7f1ea77fa46bb5f320dbe024143d9109f2c2fc6ab6ed79e5a10079189e9b4ae76471c31c30f9cb7f1093062f07229f175d30ff8d0dc18e5a73a"

RPROVIDES:${PN} += "cmake-double-conversion \
double-conversion-devel \
pkgconfig-double-conversion"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdouble-conversion3"

inherit rpm
