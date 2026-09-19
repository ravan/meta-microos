SUMMARY = "YT Music player and playlists manager"
DESCRIPTION = "AudioTube can search YouTube Music, list albums and artists, play automatically \
generated playlists, albums and allows to put your own playlist together. It is \
adapted to mobile phones and desktop computers."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "audiotube-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "db93f4f3db65ea5bd815dae93088de3be230d7ed374321bea4a398a94bef0bdb9019aaba7c9af6ef4d025860bb33c62a0f3299fe1634183e84817097277c7170"

RPROVIDES:${PN} += "audiotube"

RDEPENDS:${PN} += "gstreamer-plugins-bad \
kf6-kconfig-imports \
kf6-kirigami-imports \
kf6-purpose \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
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
libc.so.6 \
libfuturesql6.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python3-ytmusicapi \
qt6-declarative-imports \
qt6-multimedia-imports \
qt6-sql-sqlite \
yt-dlp"

inherit rpm
