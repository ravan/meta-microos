SUMMARY = "Ebook reader and library management app"
DESCRIPTION = "An ebook reader and library management app supporting '.epub' files. Arianna \
discovers your books automatically, and sorts them by categories, genres and \
authors."
LICENSE = "GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "arianna-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0f135cc1609814d45f77aa8abd585c79a64ffa00910677384e3c428672bbce6056ac06dff80105bff1c3e5a667e9c0eb864ab439336ac513675d8b318419dd9a"

RPROVIDES:${PN} += "arianna"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kf6-kquickcharts \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Baloo.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6HttpServer.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Sql.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-sql-sqlite"

inherit rpm
