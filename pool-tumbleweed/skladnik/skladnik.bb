SUMMARY = "Sokoban-like game"
DESCRIPTION = "Skladnik is an implementation of the Japanese warehouse keeper game “sokoban”. \
 \
The idea is that you are a warehouse keeper trying to push crates to their proper \
locations in a warehouse. The problem is that you cannot pull the crates or step \
over them. If you are not careful, some of the crates can get stuck in wrong \
places and/or block your way."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "skladnik-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e5739d53b4609e14559e3a790cc8b06667be842e50bc6cb1071260aeea8b6a78e0ddbb18f3fa18099d7e376468752267cee5919606e73af52b1a115cd3c2b53c"

RPROVIDES:${PN} += "skladnik"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
