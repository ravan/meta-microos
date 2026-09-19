SUMMARY = "Development package for the libsndfile library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
libsndfile library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libsndfile-devel-1.2.2-5.3.aarch64.rpm"
RPM_HASH = "fd8d17011d86c0f7f05a39b220b6796754939b1991c7f5729e9ca017e9a011aacedf1debe22aff51e68188c0e25a192a77fb695a414338ff5eea4c74b23e98fa"

RPROVIDES:${PN} += "cmake-SndFile \
libsndd \
libsndfile-devel \
pkgconfig-sndfile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsndfile1 \
libstdc++-devel \
pkgconfig-flac \
pkgconfig-ogg \
pkgconfig-opus \
pkgconfig-vorbis \
pkgconfig-vorbisenc"

inherit rpm
