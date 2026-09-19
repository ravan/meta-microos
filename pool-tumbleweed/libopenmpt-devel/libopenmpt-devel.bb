SUMMARY = "Development files for libopenmpt"
DESCRIPTION = "This package contains the development files required to compile programs \
using libopenmpt."
LICENSE = "BSD-3-Clause"

PV = "0.8.9"

RPM_NAME = "libopenmpt-devel-0.8.9-1.1.aarch64.rpm"
RPM_HASH = "ecdb8026cfbdaba4daa579cd277da0b2b087c9a499f2e48902da3193989859e36476393460896beff8be7ce52a3194c4a996621bfcfdfd5ff4da9e1f10d2f8ed"

RPROVIDES:${PN} += "libopenmpt-devel \
pkgconfig-libopenmpt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenmpt0 \
pkgconfig-libmpg123 \
pkgconfig-ogg \
pkgconfig-vorbis \
pkgconfig-vorbisfile \
pkgconfig-zlib"

inherit rpm
