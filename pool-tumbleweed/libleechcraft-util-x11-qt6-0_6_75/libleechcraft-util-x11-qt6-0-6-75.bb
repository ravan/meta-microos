SUMMARY = "X11 utility library for LeechCraft"
DESCRIPTION = "A library providing X11 wrappers for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-x11-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "b836660bb5b22a6e6dc80ef5938106ef9c867b486884714fbd1e805108323941062eed910f241d9a125478af0634c42e174fe9e0d1edda6da3b4fb4c4a68dc77"

RPROVIDES:${PN} += "libleechcraft-util-x11-qt6-0-6-75 \
libleechcraft-util-x11-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
