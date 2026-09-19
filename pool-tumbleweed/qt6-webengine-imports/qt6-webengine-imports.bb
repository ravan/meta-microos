SUMMARY = "Qt 6 WebEngine QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebEngine module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webengine-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0d949b60d60f69ac52d45517ac2d4a26b1183e9cc5034eb9bd18744ead20852a44192ed9fda8a456a0781cf576d461145dfef0bfbe87b8770a3bab9554b99360"

RPROVIDES:${PN} += "libqtwebenginequickdelegatesplugin.so \
libqtwebenginequickplugin.so \
qt6-webengine-imports \
qt6qmlimport-QtWebEngine \
qt6qmlimport-QtWebEngine.1 \
qt6qmlimport-QtWebEngine.2 \
qt6qmlimport-QtWebEngine.6 \
qt6qmlimport-QtWebEngine.ControlsDelegates \
qt6qmlimport-QtWebEngine.ControlsDelegates.1 \
qt6qmlimport-QtWebEngine.ControlsDelegates.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebEngineQuickDelegatesQml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtWebChannel"

inherit rpm
