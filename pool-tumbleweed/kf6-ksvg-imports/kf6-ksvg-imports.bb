SUMMARY = "QML Components for ksvg"
DESCRIPTION = "This package contains QML imports for SVG handling."
LICENSE = "GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ksvg-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "b520587b3d917363b6d9b769a0eb8c48d4da789261b481d28edc0b1c9227df104a477904427fbe24daec7c66b56a00320e74dfd516573e598fa166308c49727f"

RPROVIDES:${PN} += "kf6-ksvg-imports \
libcorebindingsplugin.so \
qt6qmlimport-org.kde.ksvg \
qt6qmlimport-org.kde.ksvg.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6GuiAddons.so.6 \
libKF6Svg.so.6 \
libKirigamiPlatform.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
