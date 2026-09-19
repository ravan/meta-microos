SUMMARY = "QuesoGLC Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications using QuesoGLC."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libGLC-devel-0.7.2-5.3.aarch64.rpm"
RPM_HASH = "555b81dc2882b5fce4d640ce7f42ba381118549c65e99484520cada90fed4ecd58bbad5ed0c1bcebf6e99b89757070db924104c84132af0f642a41cee712c03c"

RPROVIDES:${PN} += "libGLC-devel \
pkgconfig-quesoglc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-devel \
libGLC0 \
pkgconfig-expat \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-fribidi \
pkgconfig-zlib"

inherit rpm
