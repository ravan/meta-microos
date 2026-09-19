SUMMARY = "Qt style supporting both QtQuick and QtWidgets"
DESCRIPTION = "A Qt style supporting both QtQuick and QtWidgets."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "union6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "38c2a983f60d980f57613453be99f52228686b2f7258810c249e77ca9e9e04fe73e66c599c5f53f33e8c309baf1f703d9e1b60e6857e695df836684f753d84d4"

RPROVIDES:${PN} += "libUnion.so.6 \
libUnionQuickImpl.so.6 \
libUnionQuickImplplugin.so \
libUnionQuickStyle.so.6 \
libUnionQuickStyleplugin.so \
qt6qmlimport-org.kde.union \
qt6qmlimport-org.kde.union.254 \
qt6qmlimport-org.kde.union.impl \
qt6qmlimport-org.kde.union.impl.2 \
qt6qmlimport-org.kde.union.impl.254 \
qt6qmlimport-org.kde.union.impl.6 \
union6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6IconThemes.so.6 \
libKirigamiPlatform.so.6 \
libKirigamiPlatform6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcxx-rust-cssparser.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.qmlmodels \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.impl \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Shapes \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-org.kde.breeze \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.platform \
qt6qmlimport-org.kde.kirigami.templates \
qt6qmlimport-org.kde.plasma.components"

inherit rpm
