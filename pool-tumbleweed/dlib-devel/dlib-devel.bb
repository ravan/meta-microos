SUMMARY = "Headers and sources for developing apps with dlib"
DESCRIPTION = "dlib is a toolkit for making real world machine learning and data analysis \
applications using Python \
 \
This package provides headers and sources needed to build applications using dlib."
LICENSE = "BSL-1.0"

PV = "20.0"

RPM_NAME = "dlib-devel-20.0-2.4.aarch64.rpm"
RPM_HASH = "0ef684ab4e47d6c2d55d590f9b9849ddf072f8ac88c9261dd037b1e6f88411c3edabe9a78c48cf7d4d3d36300e4fcec4de07c7bbfc493f4da89eeeb64bf3cd5c"

RPROVIDES:${PN} += "cmake-dlib \
dlib-devel \
pkgconfig-dlib-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
giflib-devel \
libdlib20-0-0 \
pkgconfig-blas \
pkgconfig-cblas \
pkgconfig-fftw3 \
pkgconfig-lapack \
pkgconfig-libavcodec \
pkgconfig-libavdevice \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libjpeg \
pkgconfig-libjxl \
pkgconfig-libpng16 \
pkgconfig-libswresample \
pkgconfig-libswscale \
pkgconfig-libwebp"

inherit rpm
