SUMMARY = "Access library for DJ record databases"
DESCRIPTION = "libdjinterop is a C++ library for accessing database formats used to \
store information about DJ record libraries. \
 \
This library currently supports: \
 * Engine Library, as used on 'Prime'-series DJ equipment."
LICENSE = "LGPL-3.0-only"

PV = "0.27.1"

RPM_NAME = "libdjinterop0-0.27.1-1.1.aarch64.rpm"
RPM_HASH = "5d422058180705456304f996855c9a3123f4c242fb7f5288dda7a35f50bf29dc1c162e8ae5d079982651aefab577d291281d9a4cc53b995c16fc8a11df9aef08"

RPROVIDES:${PN} += "libdjinterop.so.0 \
libdjinterop0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
