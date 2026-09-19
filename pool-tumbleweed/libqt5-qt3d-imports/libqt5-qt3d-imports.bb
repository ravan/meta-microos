SUMMARY = "Qt 5 3D Library - QML imports"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qt3d-imports-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "64345abde18333c7017e7faf074f5fbc5fcde445475d0d5dd41f3c2c883f72e551eab79b0a72fd81b34ec87d7b8717d031310ab3e5a9f5a0bfff0c83ee3d47fa"

RPROVIDES:${PN} += "libqt5-qt3d-imports \
libqtquickscene2dplugin.so \
libqtquickscene3dplugin.so \
libquick3danimationplugin.so \
libquick3dcoreplugin.so \
libquick3dextrasplugin.so \
libquick3dinputplugin.so \
libquick3dlogicplugin.so \
libquick3drenderplugin.so \
qt5qmlimport-Qt3D.Animation.2 \
qt5qmlimport-Qt3D.Core.2 \
qt5qmlimport-Qt3D.Extras.2 \
qt5qmlimport-Qt3D.Input.2 \
qt5qmlimport-Qt3D.Logic.2 \
qt5qmlimport-Qt3D.Render.2 \
qt5qmlimport-QtQuick.Scene2D.2 \
qt5qmlimport-QtQuick.Scene3D.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt53DAnimation.so.5 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DQuick.so.5 \
libQt53DQuickAnimation.so.5 \
libQt53DQuickExtras.so.5 \
libQt53DQuickInput.so.5 \
libQt53DQuickRender.so.5 \
libQt53DQuickScene2D.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt3D.Logic.2"

inherit rpm
