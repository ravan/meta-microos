SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "50.9"

RPM_NAME = "libgpaste-gtk4-1-50.9-1.1.aarch64.rpm"
RPM_HASH = "47545aa6ad6754572d4d39b70d8e4580143534aff40975752e146eb716f31cb3bd114f0e615401ae2bd468b75bf062538a71cc0b02a65dd8d4b991253aa091ba"

RPROVIDES:${PN} += "libgpaste-gtk4-1 \
libgpaste-gtk4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpaste-2.so.0 \
libgtk-4.so.1"

inherit rpm
