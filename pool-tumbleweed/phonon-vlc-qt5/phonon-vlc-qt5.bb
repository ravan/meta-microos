SUMMARY = "Phonon VLC Backend"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used. \
 \
This is the VLC backend for Phonon"
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "phonon-vlc-qt5-0.12.0-2.13.aarch64.rpm"
RPM_HASH = "d301dce3c6e8354153e44489dbfd61ac817b2c1c36fa1008c6e9b58c83ba20ee6feeb491c47bb9a4fae1249d03b1f8e79027f342de9732a41dc57f8ef259d9e5"

RPROVIDES:${PN} += "phonon-qt5-backend \
phonon-vlc-qt5 \
phonon4qt5-backend \
phonon4qt5-backend-vlc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6 \
libvlc.so.5 \
libvlccore.so.9 \
vlc \
vlc-noX"

inherit rpm
