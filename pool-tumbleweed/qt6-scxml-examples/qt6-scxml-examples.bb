SUMMARY = "Examples for the qt6-scxml modules"
DESCRIPTION = "Examples for the qt6-scxml modules."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-scxml-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "c46931c3f0c7faa8eb6e0185727f082552d916e71b94c0bd18bbd072753f0d84b85bcba8d1902e2192aa3f513dd6116a55ef3b359f8b291717662228a4684061"

RPROVIDES:${PN} += "qt6-scxml-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libQt6StateMachine.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-QtScxml"

inherit rpm
