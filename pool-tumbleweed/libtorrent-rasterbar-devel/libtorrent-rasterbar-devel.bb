SUMMARY = "Header files for libtorrent, a C++ implementation of the BitTorrent protocol"
DESCRIPTION = "libtorrent-rasterbar is a C++ library that aims to be a good \
alternative to all the other bittorrent implementations around. \
It is a library and not a full featured client, although it comes \
with a working example client. \
 \
This package holds the development files for libtorrent-rasterbar."
LICENSE = "BSD-3-Clause"

PV = "2.0.14"

RPM_NAME = "libtorrent-rasterbar-devel-2.0.14-1.1.aarch64.rpm"
RPM_HASH = "35aaaf2a47a615e9600a3964f113aa84f54b53b36882e54ac51dff2e4adb7969bb721361fccafb8f15cd1a79beef734674c64b28249429904a812c44fcf5cfa1"

RPROVIDES:${PN} += "cmake-LibtorrentRasterbar \
libtorrent-rasterbar-devel \
pkgconfig-libtorrent-rasterbar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc-c++ \
libboost-headers-devel \
libtorrent-rasterbar2-0 \
pkgconfig-openssl"

inherit rpm
