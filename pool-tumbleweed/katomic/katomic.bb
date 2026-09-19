SUMMARY = "Sokoban-like logic game"
DESCRIPTION = "KAtomic is a thinking game where you have to form chemical molecules \
out of atoms. This is done with a nice graphical interface where you \
can move each atom in a labyrinth."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "katomic-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "059ac051e3a90a27237463417a9791512be0b7f908bcaaac057f4ebe5e77c15b4f70c9120b86896ada8b580c70fc390f637c270e57ac9bd715ce0d1ebf85156b"

RPROVIDES:${PN} += "katomic \
katomic5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
