SUMMARY = "A BitTorrent client in Qt"
DESCRIPTION = "qBittorrent is a bittorrent client programmed in C++ and Qt that \
uses libtorrent-rasterbar. \
 \
It has a streaming-like function to let users download and play video \
files, supports Unicode and has a bandwith scheduler."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.3"

RPM_NAME = "qbittorrent-5.2.3-1.1.aarch64.rpm"
RPM_HASH = "c48744e39ad49c15fbd94d85c4a8ab43e6250373a37d61be61d2dac06e2edc8a262ef2b1369243543ab497cfb0822bcff2a89416c690e0e98a1f1f052d2ca5a5"

RPROVIDES:${PN} += "qbittorrent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Svg6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtorrent-rasterbar.so.2.0 \
libz.so.1"

inherit rpm
