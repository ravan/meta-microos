SUMMARY = "Phonon VLC Backend"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used. \
 \
This is the VLC backend for Phonon"
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "phonon-vlc-qt6-0.12.0-2.13.aarch64.rpm"
RPM_HASH = "5b17ffa285068b5f4dee63ccec37b10f5254886ea255c68a6cfc16222881207802d37fb2653d30fc41c1ab56079c5884c23bf765518076ae4714422ea553e9ca"

RPROVIDES:${PN} += "phonon-qt6-backend \
phonon-vlc-qt6"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libphonon4qt6.so.4 \
libstdc++.so.6 \
libvlc.so.5 \
libvlccore.so.9 \
vlc \
vlc-noX"

inherit rpm
