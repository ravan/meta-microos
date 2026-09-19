SUMMARY = "KDE Translation Editor"
DESCRIPTION = "This package contains lokalize, an editor for translations"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "lokalize-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0ba4c245b3f8a16bb8a0cd207e7faf8b440a16a5e65c740e5ed9706fb1b3b4cbfbab4cdf6eca807a9723928e35ba189d7fd2dd7e4c0f4c50ac14d681a179cdf7"

RPROVIDES:${PN} += "lokalize \
lokalize5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libhunspell-1.7.so.0 \
libm.so.6 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
