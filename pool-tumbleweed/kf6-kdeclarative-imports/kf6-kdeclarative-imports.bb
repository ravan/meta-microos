SUMMARY = "KDeclarative QML imports"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kdeclarative-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "898349e54bdbc4db1e4e453179d1de8c63217ffdfc5e65c596517236eeff36c946c9bc857b1ff3a991328b362886ed0eadb3d5968e254bf1c7da27b94f1cc336"

RPROVIDES:${PN} += "kf6-kdeclarative-imports \
libdraganddropplugin.so \
libgraphicaleffects.so \
libkquickcontrols.so \
libkquickcontrolsaddonsplugin.so \
libkquickcontrolsprivate.so.0 \
libkquickcontrolsprivateplugin.so \
qt6qmlimport-org.kde.draganddrop \
qt6qmlimport-org.kde.draganddrop.2 \
qt6qmlimport-org.kde.graphicaleffects \
qt6qmlimport-org.kde.graphicaleffects.1 \
qt6qmlimport-org.kde.kquickcontrols \
qt6qmlimport-org.kde.kquickcontrols.2 \
qt6qmlimport-org.kde.kquickcontrolsaddons \
qt6qmlimport-org.kde.kquickcontrolsaddons.2 \
qt6qmlimport-org.kde.private.kquickcontrols \
qt6qmlimport-org.kde.private.kquickcontrols.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-ki18n-imports \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6ConfigGui.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.ki18n"

inherit rpm
