SUMMARY = "A BitTorrent client in Qt, CLI version"
DESCRIPTION = "qBittorrent is a bittorrent client programmed in C++ and Qt that \
uses libtorrent-rasterbar. This subpackage contains a command-line \
version."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.3"

RPM_NAME = "qbittorrent-nox-5.2.3-1.1.aarch64.rpm"
RPM_HASH = "809f5eafbbbd96faad67300995bc37f6d99ff099934402edf84efff05ed113a75facd16237dc74f213626db381e17cc37dac436a0bd033fda3ea3ac023875279"

RPROVIDES:${PN} += "qbittorrent-nox"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtorrent-rasterbar.so.2.0 \
libz.so.1 \
systemd"

inherit rpm
