SUMMARY = "Qt6 Phonon Backend using MPV Player(libmpv)"
DESCRIPTION = "This is a fork of phonon-vlc, rewritten to work with libmpv instead of \
libVLC. libmpv supports less features than VLC but they are only \
related to memory streams and audio/video dumps. This backend should be \
a lightweight alternative to libVLC with less dependencies."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.0"

RPM_NAME = "phonon4qt6-backend-mpv-0.1.0-1.7.aarch64.rpm"
RPM_HASH = "db0d87949877a337a930c9c0a7bd584cb6b874fb3edd5a723c68d0a847f05daa1eadead88fd82347c5779f7131b28b0598cf1fb83f3136b7b5a904ac6f9045ac"

RPROVIDES:${PN} += "phonon4qt6-backend \
phonon4qt6-backend-mpv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libmpv.so.2 \
libphonon4qt6 \
libphonon4qt6.so.4 \
libstdc++.so.6"

inherit rpm
