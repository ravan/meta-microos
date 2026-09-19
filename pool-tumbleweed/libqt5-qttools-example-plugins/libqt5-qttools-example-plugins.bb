SUMMARY = "Example plugins for Qt5 Designer"
DESCRIPTION = "Example plugins for Qt5 Designer, e.g. a TicTacToe and a World Clock widget."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qttools-example-plugins-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "5b0a1d54dd982940fd66eb259c374e9ff9508eb458fef29504a78eb98b71a37246bd2e28b9769534354324acba1fc3b5678940c85efd1b921515f39df3d99691"

RPROVIDES:${PN} += "libcontainerextension.so \
libcustomwidgetplugin.so \
libqt5-qttools-example-plugins \
libtaskmenuextension.so \
libworldtimeclockplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
