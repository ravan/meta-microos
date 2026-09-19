SUMMARY = "Rocket.chat Client"
DESCRIPTION = "Ruqola is a Rocket.Chat client for the KDE desktop. \
 \
It supports multi-account, search in room, open close rooms, direct message, \
thread, discussions. \
RC settings can be changed directly. \
 \
It's a native alternative to the official embedded browser type of desktop app \
available from Rocket.Chat project."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "ruqola-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "9342ab67a52a5d336517fca90c40375309f863c231de780f821160a8806925e62a52a4b67257cba39df0bcebd0912f75b0531e7edc8e7a440730fc78975a562f"

RPROVIDES:${PN} += "libcmark-rc-copy.so.0 \
librocketchatrestapi-qt.so.0 \
libruqolacore.so.0 \
libruqolawidgets.so.0 \
ruqola"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IdleTime.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Prison.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6Service.so.6 \
libKF6SonnetUi.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6TextAutoCorrectionCore.so.1 \
libKF6TextAutoCorrectionWidgets.so.1 \
libKF6TextAutoGenerateText.so.1 \
libKF6TextCustomEditor.so.1 \
libKF6TextEmoticonsCore.so.1 \
libKF6TextEmoticonsWidgets.so.1 \
libKF6TextTranslator.so.1 \
libKF6TextUtils.so.1 \
libKF6TextWidgets.so.6 \
libKF6UserFeedbackCore.so.6 \
libKF6UserFeedbackWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6Sql.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqt6keychain.so.1 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
