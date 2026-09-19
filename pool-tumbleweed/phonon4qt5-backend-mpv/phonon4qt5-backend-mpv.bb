SUMMARY = "Qt5 Phonon Backend using MPV Player(libmpv)"
DESCRIPTION = "This is a fork of phonon-vlc, rewritten to work with libmpv instead of \
libVLC. libmpv supports less features than VLC but they are only \
related to memory streams and audio/video dumps. This backend should be \
a lightweight alternative to libVLC with less dependencies."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.0"

RPM_NAME = "phonon4qt5-backend-mpv-0.1.0-1.7.aarch64.rpm"
RPM_HASH = "a2b53f3bcaae15601908c29bc26db9f0d03c431f52eb19c5476be0bacbffdac03fb71bcb3d2dd3131b88e5138d4c7a308122a4304811d31120d1fd2e6e2d38dd"

RPROVIDES:${PN} += "phonon4qt5-backend \
phonon4qt5-backend-mpv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libmpv.so.2 \
libphonon4qt5 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
