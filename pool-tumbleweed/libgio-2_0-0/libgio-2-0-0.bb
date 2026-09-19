SUMMARY = "A virtual file system library API"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
GIO provides a modern, easy-to-use VFS API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "libgio-2_0-0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "ea656ed13b6c4f62b9c36c24f049259a4ae278309eeb9822e0c21022d97dd19dc4f8e80ec08f9a5e1d0aba46b249d1fca982f79aec8daa2fa7c06bc2c071640d"

RPROVIDES:${PN} += "gio \
libgio-2-0-0 \
libgio-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
gio-branding \
glib2-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libmount.so.1 \
libselinux.so.1 \
libz.so.1 \
shared-mime-info"

inherit rpm
