SUMMARY = "Qt 6 Tools libraries and tools"
DESCRIPTION = "The QtTools modules contains some tools mostly useful for application \
development. \
 \
Included are Qt Designer (GUI design), QDbusViewer and more."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-tools-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "586d1c22375856700349dc96806612d6c20b8d72eff6f58ad57f740d2b4783282f4301e458c4bb7764e809678ce118ff6e6fc2172ea1bdd9cf203261b275db5d"

RPROVIDES:${PN} += "qt6-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-tools-helpgenerators \
qt6-tools-qdoc"

inherit rpm
