SUMMARY = "A Personal Finance Management Tool"
DESCRIPTION = "Skrooge allows managing personal finances, powered by KDE. \
It has many features and can be used to enter, follow, and \
analyze expenses."
LICENSE = "GPL-3.0-only"

PV = "26.8.0"

RPM_NAME = "skrooge-26.8.0-1.2.aarch64.rpm"
RPM_HASH = "b200e110c23139e019ad4471ef9b2d496ac393219491c1a6eb3a3464a9b22d80e22dcf56b51de151e2a1bd5a5057308dd55cfd6bd508176cf7929f655a62d12c"

RPROVIDES:${PN} += "libskgbankgui.so.2 \
libskgbankmodeler.so.2 \
libskgbasegui.so.2 \
libskgbasemodeler.so.2 \
libskgsqlcipher.so \
skrooge"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Parts.so.6 \
libKF6TextTemplate.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libofx.so.7 \
libsqlcipher.so.0 \
libstdc++.so.6 \
qt6-sql-sqlite \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Layouts.1"

inherit rpm
