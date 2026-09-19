SUMMARY = "GtkD sourceview library"
DESCRIPTION = "This package contains the GtkD sourceview library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libgtkdsv-3-0-3.9.0-3.10.aarch64.rpm"
RPM_HASH = "1085646ae19c6f18519a5697c85c34dc25acd81030ffd5ac62e2c1e6acf6d2d19310c97a528d75d345a2690458d61e56283f2c654509ba0a8c7b4b4592ec520d"

RPROVIDES:${PN} += "libgtkdsv-3-0 \
libgtkdsv-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdruntime-ldc-shared.so.112 \
libgcc-s.so.1"

inherit rpm
