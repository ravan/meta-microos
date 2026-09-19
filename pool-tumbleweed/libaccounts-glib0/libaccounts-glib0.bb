SUMMARY = "Account management library for GLib Applications"
DESCRIPTION = "This package contains the shared libraries for use by applications."
LICENSE = "LGPL-2.1-only"

PV = "1.27"

RPM_NAME = "libaccounts-glib0-1.27-1.10.aarch64.rpm"
RPM_HASH = "19f322b1cb3dcbec46e226d66c15f206e3b39603f66e06a20a9603bfd71bcbb0f25eecc5a1fcdb0732a63f37773ddc3a9b139de0185d58a609b43f238627ca53"

RPROVIDES:${PN} += "libaccounts-glib.so.0 \
libaccounts-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0 \
libxml2.so.16"

inherit rpm
