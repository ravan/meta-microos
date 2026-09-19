SUMMARY = "GNOME-like client-side decoration plugin"
DESCRIPTION = "This package provides a client-side decoration plugin implementing GNOME's \
Adwaita style."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-wayland-decoration-client-adwaita-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "cffce9f930ce03c6791431a794e386f6bc54fa5636e8721fd567371d005ed3668b4d45dcce153a1f8341a663a46ddc5b6bb26ff18f56cf2544f23e6fad5d4971"

RPROVIDES:${PN} += "libadwaita.so \
qt6-wayland-decoration-client-adwaita"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
