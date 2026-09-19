SUMMARY = "Kirigami-based podcast player"
DESCRIPTION = "Kasts is a convergent podcast application. \
Its main features are: \
 \
- Episode management through play queue \
- Sync playback positions with other clients through gpodder.net or \
  gpodder-nextcloud \
- Variable playback speed \
- Search for podcasts \
- Full system integration: e.g. inhibit system suspend while listening"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kasts-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8f37f30b48f787883124e703e6c5af8b411d4c44068d7dba813b9c6a291fea0407b80f6e15a53320e431fc7e13b3c93dc523f3db33008b70e3de3ea0aba5d255"

RPROVIDES:${PN} += "kasts \
libKMediaSession.so \
libkmediasessionqmlplugin.so \
qt6qmlimport-org.kde.kmediasession \
qt6qmlimport-org.kde.kmediasession.254"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6Syndication.so.6 \
libKF6ThreadWeaver.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqt6keychain.so.1 \
libstdc++.so.6 \
libtag.so.2 \
libvlc.so.5 \
qt6-sql-sqlite \
vlc-noX"

inherit rpm
