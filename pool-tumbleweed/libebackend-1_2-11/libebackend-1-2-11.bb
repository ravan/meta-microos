SUMMARY = "Evolution Data Server's Backend Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for backends."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "libebackend-1_2-11-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "26c2e5e70057f97f7fa013b89c69db14c881237dcf6d2169dff754db0e0bfb9dcd5a723d507850941a9285b7572ac3ef82d9a4420af80194a7872fdc9daf5ef3"

RPROVIDES:${PN} += "libebackend-1-2-11 \
libebackend-1.2.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libdb-4.8.so \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0"

inherit rpm
