SUMMARY = "Qt6 qml style provider for Hyprland"
DESCRIPTION = "A qt6 qml style provider for hypr* apps"
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "hyprland-qt-support-0.1.0-2.2.aarch64.rpm"
RPM_HASH = "71bd5e5a1b07e518e6e758d5d1a528262dbf1e7c11fa7ad44edc2201edf9a3174634a968e912a9b65812e37b25d24c6f1a42e237a78a729fa642dc7a532ba641"

RPROVIDES:${PN} += "hyprland-qt-support \
libhyprland-quick-style-impl.so \
libhyprland-quick-style-implplugin.so \
libhyprland-quick-style.so \
libhyprland-quick-styleplugin.so \
qt6qmlimport-org.hyprland.style \
qt6qmlimport-org.hyprland.style.0 \
qt6qmlimport-org.hyprland.style.impl \
qt6qmlimport-org.hyprland.style.impl.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhyprlang.so.2 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls.impl \
qt6qmlimport-QtQuick.Templates"

inherit rpm
