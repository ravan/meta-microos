SUMMARY = "Qt 6 DeclarativeOpcua library"
DESCRIPTION = "Qt 6 DeclarativeOpcua library."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-only) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6DeclarativeOpcua6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0c5601db5404f75d5cce0e37cc9315c0321dcc8de2feda8fcb56d2e772173ebf6b2119c8edb65c344d87e8ffa1a79c5bac8697af239a0e733792b8e47f7cc3dd"

RPROVIDES:${PN} += "libQt6DeclarativeOpcua.so.6 \
libQt6DeclarativeOpcua6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpcUa.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
