SUMMARY = "Plasma 6 IBus Configuration"
DESCRIPTION = "Plasma 6 Input Method Backend for IBus support."
LICENSE = "GPL-2.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-kimpanel-ibus-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "3f0379d959ef6ac001a16c5236bd446403ecbc3ae6e5fa84f9f3dc60f4a6cb38405a059226e1543f519fc84314f85466620e64964297c6215052aafcfe68c4b3"

RPROVIDES:${PN} += "plasma6-kimpanel-ibus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb.so.1 \
plasma6-desktop"

inherit rpm
