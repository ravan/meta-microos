SUMMARY = "System tray that downloads and display info about the Turris router"
DESCRIPTION = "Spectator, systray tool to display various informations about the \
Turris router from CZ.nic"
LICENSE = "GPL-3.0+"

PV = "0.6+git74.9ef0de5"

RPM_NAME = "spectator-0.6+git74.9ef0de5-1.38.aarch64.rpm"
RPM_HASH = "742c120c9cbecb08192d3a6bbed38879dfed4f7bb6232342f70c900afab7328642855912ccf0d63889f07d80295a77ad678199a6f68bca9390952192f95b72f5"

RPROVIDES:${PN} += "spectator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libturris-spectator.so.0 \
openssl"

inherit rpm
