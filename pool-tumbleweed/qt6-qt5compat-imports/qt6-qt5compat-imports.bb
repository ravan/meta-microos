SUMMARY = "Qt 6 Core 5 Compat QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Core5Compat module. \
This package shall be used while porting away from qtgraphicaleffects."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qt5compat-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e2f8802eaeeb5a38830d24cdb92571109f32b1b0c6836f80047e99721bdc738a5b13f87d13531ccbdc48007947531c1fb98d21ef00bda337edffa89a6fda8e0d"

RPROVIDES:${PN} += "libqtgraphicaleffectsplugin.so \
libqtgraphicaleffectsprivateplugin.so \
qt6-qt5compat-imports \
qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-Qt5Compat.GraphicalEffects.1 \
qt6qmlimport-Qt5Compat.GraphicalEffects.6 \
qt6qmlimport-Qt5Compat.GraphicalEffects.private \
qt6qmlimport-Qt5Compat.GraphicalEffects.private.1 \
qt6qmlimport-Qt5Compat.GraphicalEffects.private.2 \
qt6qmlimport-Qt5Compat.GraphicalEffects.private.5 \
qt6qmlimport-Qt5Compat.GraphicalEffects.private.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6ShaderTools.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Window"

inherit rpm
