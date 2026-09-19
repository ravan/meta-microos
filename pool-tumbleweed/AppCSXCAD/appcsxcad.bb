SUMMARY = "Minimal GUI Application using the QCSXCAD library"
DESCRIPTION = "Minimal GUI Application using the QCSXCAD library."
LICENSE = "GPL-3.0-only"

PV = "0.2.3"

RPM_NAME = "AppCSXCAD-0.2.3-4.4.aarch64.rpm"
RPM_HASH = "2d5472bab5ce7508334d0721d76ce98ce34674ea39e1d2be1469308bec8f26b41d4d6d5b941b63b344201309f8035d736549ff06d73049ffd6ab80516bca5bff"

RPROVIDES:${PN} += "AppCSXCAD"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libCSXCAD.so.0 \
libQCSXCAD.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvtkGUISupportQt.so.1 \
libvtksys.so.1"

inherit rpm
