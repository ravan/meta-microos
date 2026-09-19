SUMMARY = "KDE File Manager and Browser"
DESCRIPTION = "Konqueror allows you to manage your files and browse the web in a \
unified interface."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "konqueror-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ffe86e2685220138cd39851cbd3809763d70fdae635d51d76b9a8a625ba2b6148f0c5777e1cbb51fdf236d8c0581300ed36d4b171a919da9a43beb16b8069a0e"

RPROVIDES:${PN} += "config-konqueror \
konqueror \
libKF6Konq.so.7 \
libkonquerorprivate.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6Codecs.so.6 \
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
libKF6IconWidgets.so.6 \
libKF6ItemViews.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6KonqSettings.so.7 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6SonnetUi.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WebEngineCore.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
webenginepart"

inherit rpm
