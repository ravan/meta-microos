SUMMARY = "XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This library is used by several XApp applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.2"

RPM_NAME = "libxapp1-3.2.2-1.4.aarch64.rpm"
RPM_HASH = "e3b50b48dd9df3c17c05a976c1f1a3aeae525962cb0961cb4e94f7de9e3f8c9d7d47033a20be7f26ebe8925b07d2589444ab924e89d12cd048512426d1739e2a"

RPROVIDES:${PN} += "libxapp.so.1 \
libxapp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdbusmenu-gtk3.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnomekbdui.so.8 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
xapp-common"

inherit rpm
