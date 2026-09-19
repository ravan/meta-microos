SUMMARY = "MATE window manager"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "marco-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "4a0255df7373d50aa4a43b651c526095f097a5881f82569a089c3e1bf7aaf4d09515d1ff9f8c08de7dc76d4d3e5630d8723e2748b5d07372b721fcdd17181003"

RPROVIDES:${PN} += "marco \
mate-window-manager \
windowmanager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmarco-private.so.2 \
libpango-1.0.so.0 \
zenity"

inherit rpm
