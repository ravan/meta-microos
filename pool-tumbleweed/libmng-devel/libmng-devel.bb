SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This library can handle MNG and JNG formats which contain animated \
pictures. These formats should replace the GIF format. \
 \
This package contains the static library and the header files."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "libmng-devel-2.0.3-3.14.aarch64.rpm"
RPM_HASH = "7a9b0eeb59267c3dc3347bf1e64a1f0a673b2eacc012b425e0cde22301247eb96e9cae5ff9970ea756a197c3d727eb6517b84b1ed4bd1eca9a68e862ec345e70"

RPROVIDES:${PN} += "libmng-devel \
pkgconfig-libmng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg-devel \
liblcms2-devel \
libmng2 \
zlib-devel"

inherit rpm
