SUMMARY = "Development files for libshout, an Icecast communication library"
DESCRIPTION = "This package contains the include files needed to develop \
applications that want to use libshout."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.6"

RPM_NAME = "libshout-devel-2.4.6-3.8.aarch64.rpm"
RPM_HASH = "d93eac49524050f60c6f8d908206f224b398ce30d056cabdffa4a7cf2cd888003a7a94abf1e53374ce92b5b43c4d62e5ac738b8ced708a91b921b43a58573e53"

RPROVIDES:${PN} += "libshout-devel \
pkgconfig-shout"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libshout.so.3 \
libshout3 \
pkgconfig-libssl \
pkgconfig-ogg \
pkgconfig-speex \
pkgconfig-theora \
pkgconfig-vorbis"

inherit rpm
