SUMMARY = "Share directory from caja via Samba"
DESCRIPTION = "Caja-share allows you to quickly share a directory from the Caja \
file manager without requiring root access. It uses Samba, so your \
directories can be accessed by any operating system."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-share-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "0561979ab435c6ef39465764eb3b8f4af8aab787caa0fbcb698f051c92a96e04651d745bd91cf78d50de52501e64e2ad7e8b2925c9603c96582cc2007bea9617"

RPROVIDES:${PN} += "caja-extension-share \
caja-share \
libcaja-share.so \
mate-file-manager-share"

RDEPENDS:${PN} += "caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
mate-icon-theme \
samba"

inherit rpm
