SUMMARY = "Qt 6 Scxml QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Scxml module"
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-scxml-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "cd70711ab2e05cb9787706795e58e391d5b4bd7d97cadb6bad65de8bfa58c825a2a46d8fb063d9752acb8005078fa804559dbe982e6edcd9ccbb48b4ed9ee5e9"

RPROVIDES:${PN} += "libdeclarative-scxmlplugin.so \
libqtqmlstatemachineplugin.so \
qt6-scxml-imports \
qt6qmlimport-QtQml.StateMachine \
qt6qmlimport-QtQml.StateMachine.1 \
qt6qmlimport-QtQml.StateMachine.6 \
qt6qmlimport-QtScxml \
qt6qmlimport-QtScxml.5 \
qt6qmlimport-QtScxml.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6ScxmlQml.so.6 \
libQt6StateMachineQml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQml"

inherit rpm
