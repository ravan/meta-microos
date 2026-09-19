SUMMARY = "A portable interface for writing games"
DESCRIPTION = "ClanLib delivers a platform independent interface to write games with."
LICENSE = "Zlib"

PV = "4.2.0"

RPM_NAME = "clanlib-devel-4.2.0-4.1.aarch64.rpm"
RPM_HASH = "64b77e1001d4170552ca3ea6c126ccdaac0a127b0496e7d0ee9647d05ce013a4c0ebfc4f2e9348fff561621d99ac9ffa1bf86ab06b045ffd6fc4bbd7b15224f5"

RPROVIDES:${PN} += "clanlib-devel \
pkgconfig-clanApp-4.2 \
pkgconfig-clanCore-4.2 \
pkgconfig-clanDisplay-4.2 \
pkgconfig-clanGL-4.2 \
pkgconfig-clanNetwork-4.2 \
pkgconfig-clanSound-4.2 \
pkgconfig-clanUI-4.2 \
pkgconfig-clanXML-4.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
c++-compiler \
clanlib \
pkgconfig-alsa \
pkgconfig-fontconfig \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xinerama"

inherit rpm
