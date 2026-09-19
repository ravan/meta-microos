SUMMARY = "Shared library for framel, a library for gravitational wave frame data"
DESCRIPTION = "The Frame Library is a software dedicated to frame data manipulation including \
file input/output. \
 \
This package provides the shared library for framel."
LICENSE = "LGPL-2.1-or-later"

PV = "8.48.4"

RPM_NAME = "libframel8-8.48.4-2.7.aarch64.rpm"
RPM_HASH = "2507d106c2b579f78495c7cbd4cab72c2506e13f78a6f2c7fd72e5772d4f36cb627b0e85e2d52c567a37249b14f64456f1ba6e7c487d02d6b25c539003e437ee"

RPROVIDES:${PN} += "libframel.so.8 \
libframel8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
