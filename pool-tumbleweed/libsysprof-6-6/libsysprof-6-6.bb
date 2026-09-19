SUMMARY = "Sysprof Shared Library"
DESCRIPTION = "The libsysprof-6-6 package contains the Sysprof shared \
library."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "libsysprof-6-6-50.0-1.3.aarch64.rpm"
RPM_HASH = "c8db4a2b18e5d971f6d3b16cf19c2d7b0fac47855ef3f79c3304705f5faf324872bba15b113430f364c333eadc4928f24c2ae147988590395d83e2720970a1b0"

RPROVIDES:${PN} += "libsysprof-6-6 \
libsysprof-6.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libdex-1.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
