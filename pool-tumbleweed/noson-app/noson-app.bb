SUMMARY = "SONOS device controller"
DESCRIPTION = "A controller for SONOS devices. It allows for browsing the music \
library, and playing tracks or radio on any zones. Zone groups, \
queues and playlists can be managed, and playback be controlled."
LICENSE = "GPL-3.0-or-later"

PV = "5.6.27"

RPM_NAME = "noson-app-5.6.27-1.2.aarch64.rpm"
RPM_HASH = "8ed67aaefcdbe21fab9d475c310aa08ee70b7e1d968d5935f887db619a35fda1fa14d2d49fb1e38bd291cb0b300d70c994bf5f4adaea4a54d4f95b8c685f2f94"

RPROVIDES:${PN} += "libNosonApp.so \
libNosonMediaScanner.so \
libNosonThumbnailer.so \
noson-app"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libFLAC++.so.11 \
libFLAC.so.14 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
