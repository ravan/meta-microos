SUMMARY = "Qt 6 Quick3D QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Quick3D module"
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3d-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "87c20110830e32e21c959ed43c0bbb3f9f042057a8565127133ebfc9d8fc433751eee1ce9842460c34ede0261eaa2c7b320abd1d0be4273508d7f4ab796db54b"

RPROVIDES:${PN} += "libqquick3dplugin.so \
libqtquick3dassetutilsplugin.so \
libqtquick3deffectplugin.so \
libqtquick3dhelpersimplplugin.so \
libqtquick3dhelpersplugin.so \
libqtquick3dparticleeffectsplugin.so \
libqtquick3dparticles3dplugin.so \
libquick3dxrplugin.so \
qt6-quick3d-imports \
qt6qmlimport-QtQuick3D \
qt6qmlimport-QtQuick3D.2 \
qt6qmlimport-QtQuick3D.6 \
qt6qmlimport-QtQuick3D.AssetUtils \
qt6qmlimport-QtQuick3D.AssetUtils.6 \
qt6qmlimport-QtQuick3D.Effects \
qt6qmlimport-QtQuick3D.Effects.6 \
qt6qmlimport-QtQuick3D.Helpers \
qt6qmlimport-QtQuick3D.Helpers.1 \
qt6qmlimport-QtQuick3D.Helpers.6 \
qt6qmlimport-QtQuick3D.Helpers.impl \
qt6qmlimport-QtQuick3D.Helpers.impl.6 \
qt6qmlimport-QtQuick3D.MaterialEditor \
qt6qmlimport-QtQuick3D.MaterialEditor.1 \
qt6qmlimport-QtQuick3D.ParticleEffects \
qt6qmlimport-QtQuick3D.ParticleEffects.6 \
qt6qmlimport-QtQuick3D.Particles3D \
qt6qmlimport-QtQuick3D.Particles3D.6 \
qt6qmlimport-QtQuick3D.Xr \
qt6qmlimport-QtQuick3D.Xr.6 \
qt6qmlimport-QtQuick3D.lightmapviewer \
qt6qmlimport-QtQuick3D.lightmapviewer.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DAssetUtils.so.6 \
libQt6Quick3DEffects.so.6 \
libQt6Quick3DHelpers.so.6 \
libQt6Quick3DHelpersImpl.so.6 \
libQt6Quick3DParticleEffects.so.6 \
libQt6Quick3DParticles.so.6 \
libQt6Quick3DXr.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.platform \
qt6qmlimport-QtCore \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Window"

inherit rpm
