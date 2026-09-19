SUMMARY = "Complete frontend for MPV"
DESCRIPTION = "SMPlayer is a front-end for MPV/MPlayer, from basic features like \
playing videos, DVDs, and VCDs to more advanced features like support \
for MPV filters and more. \
 \
SMPlayer remembers the settings of all files you play. Opening a \
movie again will resume at the same point it was left, and with the \
same chosen audio track, subtitles and volume level."
LICENSE = "GPL-2.0-or-later"

PV = "25.6.0"

RPM_NAME = "smplayer-25.6.0-2.2.aarch64.rpm"
RPM_HASH = "437c55b23a7d9394898de264646842f81def71c8e10f1b708c5f9d4922ac5c16f5622a9516dd4108bf396f63b87f37b00f166715ad9009a69d25584af50856b5"

RPROVIDES:${PN} += "smplayer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1 \
mpv"

inherit rpm
