SUMMARY = "KDE Access to window manager"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kwindowsystem-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "369ea22bd32a996fcded6dc632b1ad79c626a04c0f87bd2fcf1cee23fb5fb7fe74837aff2e5a60ce545f0937c446034f6008ae99b739869ce4e3cf69ab4a029a"

RPROVIDES:${PN} += "kf6-kwindowsystem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb.so.1"

inherit rpm
