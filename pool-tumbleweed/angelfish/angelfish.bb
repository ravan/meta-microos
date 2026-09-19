SUMMARY = "Mobile web browser"
DESCRIPTION = "Angelfish is a mobile web browser. It supports typical browser features, such \
as bookmarks, history and tabs."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "angelfish-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b21b3d358f51124184653fbd592a902f7a25ebe5889ddc03db8630d0de5eb61d0e2f39b5a6799bfe5ec29ce473f64dbab156351e1ef9c43c56f892a1a19cdb74"

RPROVIDES:${PN} += "angelfish"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6Notifications.so.6 \
libKF6WindowSystem.so.6 \
libQCoro6Qml.so.0 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Sql.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfuturesql6.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
