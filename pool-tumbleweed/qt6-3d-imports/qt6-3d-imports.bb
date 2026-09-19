SUMMARY = "Qt 6 3D Library - QML imports"
DESCRIPTION = "Qt 6 3D QML imports."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3d-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "846b19e4190e86760b1d52d3f07f8600ec385b76d7f0ee6308b5a2dcd62133cffce2fff22cadcbfaf7be0f94e965be97243050584088b3843322ab455fa0a4ff"

RPROVIDES:${PN} += "libqtquickscene2dplugin.so \
libqtquickscene3dplugin.so \
libquick3danimationplugin.so \
libquick3dcoreplugin.so \
libquick3dextrasplugin.so \
libquick3dinputplugin.so \
libquick3dlogicplugin.so \
libquick3drenderplugin.so \
qt6-3d-imports \
qt6qmlimport-Qt3D.Animation \
qt6qmlimport-Qt3D.Animation.2 \
qt6qmlimport-Qt3D.Animation.6 \
qt6qmlimport-Qt3D.Core \
qt6qmlimport-Qt3D.Core.2 \
qt6qmlimport-Qt3D.Core.6 \
qt6qmlimport-Qt3D.Extras \
qt6qmlimport-Qt3D.Extras.2 \
qt6qmlimport-Qt3D.Extras.6 \
qt6qmlimport-Qt3D.Input \
qt6qmlimport-Qt3D.Input.2 \
qt6qmlimport-Qt3D.Logic \
qt6qmlimport-Qt3D.Logic.2 \
qt6qmlimport-Qt3D.Logic.6 \
qt6qmlimport-Qt3D.Render \
qt6qmlimport-Qt3D.Render.2 \
qt6qmlimport-Qt3D.Render.6 \
qt6qmlimport-QtQuick.Scene2D \
qt6qmlimport-QtQuick.Scene2D.2 \
qt6qmlimport-QtQuick.Scene2D.6 \
qt6qmlimport-QtQuick.Scene3D \
qt6qmlimport-QtQuick.Scene3D.2 \
qt6qmlimport-QtQuick.Scene3D.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt63DInput.so.6 \
libQt63DQuick.so.6 \
libQt63DQuickAnimation.so.6 \
libQt63DQuickExtras.so.6 \
libQt63DQuickInput.so.6 \
libQt63DQuickLogic.so.6 \
libQt63DQuickRender.so.6 \
libQt63DQuickScene2D.so.6 \
libQt63DQuickScene3D.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQml \
qt6qmlimport-QtQuick"

inherit rpm
