SUMMARY = "Caja privilege granting plugin"
DESCRIPTION = "This extension allows you to open files with administration \
privileges using the context menu when browsing your files with \
Caja file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-gksu-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "4dba3a5f97a6abe06c4787b2acd9d38433c831f185c7e929c4cf77cc7f3d557c4d936f8590f333479e8e7424a9c0b9937d87fd5384c291079a1521a408c026aa"

RPROVIDES:${PN} += "caja-extension-gksu \
caja-gksu \
libcaja-gksu.so"

RDEPENDS:${PN} += "ImageMagick \
caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
