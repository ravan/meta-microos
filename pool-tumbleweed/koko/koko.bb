SUMMARY = "Kirigami based gallery application"
DESCRIPTION = "Koko is a simple image gallery application that is designed to view, edit and \
share images."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "koko-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3e3b885e3e2588512457acc41ec0ac8ac02206755fda1083770b6bf38a87739ac955a6a2e4279e8c668961b3063d641c11abcf9f8979b82bbe67f31179140a5d"

RPROVIDES:${PN} += "koko"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kirigami-imports \
kirigami-addons6 \
kquickimageeditor6-imports \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6WindowSystem.so.6 \
libKQuickImageEditor.so.1 \
libKirigamiActionCollection.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Positioning.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1 \
qt6-sql-sqlite"

inherit rpm
