SUMMARY = "Music player and collection organizer"
DESCRIPTION = "Elisa is a music player with a library where music can be browsed by \
album, artist or all tracks. It is indexed using either a private \
indexer or an indexer using Baloo. The private one can be configured \
to scan music on chosen paths. The Baloo one is faster because Baloo \
is providing all needed data from its own database. Playlists can be \
built and played."
LICENSE = "LGPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "elisa-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6958fead1ddc9279b2c977d2d0b828e118e6c6e2b21609ae011373c67c4c614a0ebac1f6f99234bbb94f15c25f9c388fa6d479c3df2801c676864b29c8449ea6"

RPROVIDES:${PN} += "elisa \
libelisaLib.so.0"

RDEPENDS:${PN} += "kf6-kdeclarative-imports \
kf6-kirigami \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-multimedia \
qt6-sql-sqlite"

inherit rpm
