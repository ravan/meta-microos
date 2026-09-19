SUMMARY = "KDE Subversion Client"
DESCRIPTION = "kdesvn is a GUI client for subversion repositories."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0git.20260824T015138~94bd2ad8"

RPM_NAME = "kdesvn-2.1.0git.20260824T015138~94bd2ad8-1.1.aarch64.rpm"
RPM_HASH = "7030a5ae9778ef649f7058d253c06f4d134299a2b69ad8367857e0c51cf62ead94e155fdd219347634a2a3e8cb9429d71bc6eb1f80f81196b9898a19bc933d43"

RPROVIDES:${PN} += "kdesvn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
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
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6TextWidgets.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsvn-client-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
qt6-sql-sqlite"

inherit rpm
