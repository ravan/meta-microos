SUMMARY = "Library to generate ODF documents from libwpd's and libwpg's api calls"
DESCRIPTION = "libodfgen is a general purpose library designed to generate ODF documents \
from api calls to libwpd and libwpg libraries."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.1.8"

RPM_NAME = "libodfgen-devel-0.1.8-4.6.aarch64.rpm"
RPM_HASH = "065c57d50e551284839313a4a5e742b36d4c2fdb5600e3de021ba56663e8af5de9086ca22a26aead69153b4914f58014b1a11c728a417f99c31df22db4d9a0c5"

RPROVIDES:${PN} += "libodfgen-devel \
pkgconfig-libodfgen-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libodfgen-0-1-1 \
libstdc++-devel \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0"

inherit rpm
