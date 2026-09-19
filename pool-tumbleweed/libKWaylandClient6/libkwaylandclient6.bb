SUMMARY = "KDE Wayland library"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "libKWaylandClient6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "e7bab6b5dc0ea0bffd50ff0c26f4e06df434ac933f5e599100cbb9e660dc78be68a5a66d8551fa65ea3bd728364fe337650cc20dd6ba03bceb3962a6de40d356"

RPROVIDES:${PN} += "libKWaylandClient.so.6 \
libKWaylandClient6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kwayland6 \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
