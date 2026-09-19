SUMMARY = "Include Files and Libraries mandatory for Ogg Vorbis Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libvorbis."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libvorbis-devel-1.3.7-5.10.aarch64.rpm"
RPM_HASH = "86cac4c21c49b8ec6d856c8bb8f6617c07d5a4140d64836b697777b5adf60f3a5381b1015a75038d7af8b2d92ddc5725b70d393466c3191e178177511b6c091f"

RPROVIDES:${PN} += "libvorbis-devel \
pkgconfig-vorbis \
pkgconfig-vorbisenc \
pkgconfig-vorbisfile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libogg-devel \
libvorbis0 \
libvorbisenc2 \
libvorbisfile3 \
pkgconfig-ogg \
pkgconfig-vorbis"

inherit rpm
