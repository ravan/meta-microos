SUMMARY = "NetworkManager Tray applet"
DESCRIPTION = "nm-tray is a simple NetworkManager front end with information icon residing in system tray (like nm-applet), but a pure Qt implementation."
LICENSE = "GPL-2.0-only"

PV = "0.5.1"

RPM_NAME = "nm-tray-0.5.1-1.7.aarch64.rpm"
RPM_HASH = "93d797f87a290b76d7cd611348cd9c4814091ae83953dfee15ed875b1eb9dd7f8ca1fb568f285f404f332c90e3b5f7a2f19ce5753fbde40137618c622bba33c1"

RPROVIDES:${PN} += "nm-tray"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libKF6NetworkManagerQt.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
