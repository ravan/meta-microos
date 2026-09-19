SUMMARY = "Lightweight Spotify client using Qt"
DESCRIPTION = "An unofficial Spotify client using Qt as a simpler, lighter alternative to the official client, inspired by spotify-tui. Much like spotify-tui, you need an actual Spotify client running, for example spotifyd, which can be configured from within the app. Also like other clients, controlling music playback requires Spotify Premium."
LICENSE = "GPL-3.0-only"

PV = "4.0.4"

RPM_NAME = "spotify-qt-4.0.4-1.3.aarch64.rpm"
RPM_HASH = "f33f85592ec256a24f104e8d6945048d350d2044c24a6d842bd325e7d40cd0888d9e5b1d176d91da0044d4f9ff3282b6c6e4e2090ec813e5028317e24bab1f78"

RPROVIDES:${PN} += "spotify-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
