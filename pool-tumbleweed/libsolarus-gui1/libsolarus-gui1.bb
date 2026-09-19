SUMMARY = "Solarus game engine shared library (GUI parts)"
DESCRIPTION = "This package provides the GUI shared library of the Solarus game \
engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "libsolarus-gui1-1.6.5-3.3.aarch64.rpm"
RPM_HASH = "4c58bd83fa4ef0cc09e7cde899a78f18f549b8ec6e287ad6a1b51f5709c55e46b370c7a66e1d53cd3fe90d3b2ca3ee04e0666aa6866236c103c02ca799295f66"

RPROVIDES:${PN} += "libsolarus-gui.so.1 \
libsolarus-gui1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libluajit-5.1.so.2 \
libsolarus.so.1 \
libstdc++.so.6"

inherit rpm
