SUMMARY = "Examples for the qt6-sensors modules"
DESCRIPTION = "Examples for the qt6-sensors modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sensors-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6a54d86357af9e7ea59153f2d7d5b5958e28f89cd07fa526ee3ea5a9b09e8dbdb54c55269b436000dbdb74d6665f7aae81ce1b19d1f745ee657ab7d512eea966"

RPROVIDES:${PN} += "qt6-sensors-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Sensors.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtSensors"

inherit rpm
