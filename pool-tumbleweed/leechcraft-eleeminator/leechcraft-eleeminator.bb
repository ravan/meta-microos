SUMMARY = "LeechCraft terminal plugin"
DESCRIPTION = "This package provides a terminal plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-eleeminator-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "216049801389472862d35363670f4c3a778c218a20edea454fabea2919e651cf4016895fd0b0ec3e5dd264d4021f42fc95deb4caa18997f4d30bdf74dbbad742"

RPROVIDES:${PN} += "leechcraft-eleeminator \
libleechcraft-eleeminator.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libqtermwidget6.so.2 \
libstdc++.so.6"

inherit rpm
