SUMMARY = "TOMOE GTK+ library"
DESCRIPTION = "TOMOE GTK+ library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "libtomoe-gtk0-0.6.0-45.6.aarch64.rpm"
RPM_HASH = "0a06f42288c1eb44d5eb515166a2a4410a3bd8c07a23eccc16599a0ac245146ce81ebb56c50c8a4f8ea3245c596ca39d5794e44e66ab567a77a95cbf44afbc38"

RPROVIDES:${PN} += "libtomoe-gtk.so.0 \
libtomoe-gtk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libtomoe.so.0 \
tomoe-gtk"

inherit rpm
