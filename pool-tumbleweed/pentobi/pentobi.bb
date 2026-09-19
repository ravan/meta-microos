SUMMARY = "Program to play the board game Blokus"
DESCRIPTION = "Pentobi is a computer opponent for the board game Blokus with \
support for Classic, Duo, Junior, Trigon, and Nexos game variants. \
Different levels of playing strength are available. Pentobi can \
save and load games along with comments and move variations."
LICENSE = "GPL-3.0-only"

PV = "30.3"

RPM_NAME = "pentobi-30.3-1.2.aarch64.rpm"
RPM_HASH = "2ae2731a37dbdb1763adb02c2d05b174af5fd211e5d8ed56e3da362e45dcd4b886417f073b1b306b4baaa3a1b4c5403ab558d00bf0a7f06404ba283b84d5d1e1"

RPROVIDES:${PN} += "pentobi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
