SUMMARY = "Google Drive KIO slave for KDE applications"
DESCRIPTION = "Google Drive KIO slave for KDE applications. \
KIO GDrive requires a KIO-enabled file manager at runtime, otherwise there is \
no way to setup a Google Drive account. \
This can be Dolphin or Gwenview."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kio-gdrive-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "533f6bb5ace218c72d17688690056a50228fd2d38fe11bdc10274cbb36c5f32fc8ed1183ab9da6e4b63f09b5472430a83ea658ca0d07fa41b15f3e5a764373f5"

RPROVIDES:${PN} += "kio-gdrive"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Purpose.so.6 \
libKF6WidgetsAddons.so.6 \
libKPim6GAPICore.so.6 \
libKPim6GAPICore6 \
libKPim6GAPIDrive.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libaccounts-qt6.so.1 \
libc.so.6 \
libkaccounts6.so.2 \
libstdc++.so.6 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-SSO.OnlineAccounts.0 \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.kquickcontrolsaddons.2"

inherit rpm
