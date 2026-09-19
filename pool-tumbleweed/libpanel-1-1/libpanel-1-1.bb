SUMMARY = "Shared library files for libpanel"
DESCRIPTION = "The libpanel-1-1 package contains shared libraries libpanel."
LICENSE = "LGPL-3.0-or-later"

PV = "1.10.4"

RPM_NAME = "libpanel-1-1-1.10.4-2.3.aarch64.rpm"
RPM_HASH = "3e7223cebb10fcd31d595b0f7d24f4807bbfda37e3ae1589119d0baa2bb54e9cfc3454cf8cb8361681475024e11320b874760da01e3bd2f1b37399f97b3f6248"

RPROVIDES:${PN} += "libpanel \
libpanel-1-1 \
libpanel-1.so.1 \
libpanel1-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1"

inherit rpm
