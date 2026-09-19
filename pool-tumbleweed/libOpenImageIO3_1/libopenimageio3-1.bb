SUMMARY = "Library for Reading and Writing Images"
DESCRIPTION = "OpenImageIO is a library for reading and writing images, and a bunch of related \
classes, utilities, and applications. There is a particular emphasis on formats \
and functionality used in professional, large-scale animation and visual \
effects work for film. OpenImageIO is used extensively in animation and VFX \
studios all over the world, and is also incorporated into several commercial \
products."
LICENSE = "Apache-2.0"

PV = "3.1.17.0"

RPM_NAME = "libOpenImageIO3_1-3.1.17.0-1.1.aarch64.rpm"
RPM_HASH = "9ef27866574153d9a59d8f83f65da6c66f44be769f5cbe27240ace43f205cefe48ff30f00256b631d375d5893f445f766b6f2ea37182dfa71eaf33649586badb"

RPROVIDES:${PN} += "libOpenImageIO.so.3.1 \
libOpenImageIO3-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libOpenColorIO.so.2.5 \
libOpenEXR-3-4.so.33 \
libOpenEXRCore-3-4.so.33 \
libOpenImageIO-Util.so.3.1 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libdcmdata.so.20 \
libdcmimage.so.20 \
libdcmimgle.so.20 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libheif.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libm.so.6 \
liboflog.so.20 \
libofstd.so.20 \
libopenjp2.so.7 \
libopenjph.so.0.31 \
libopenvdb.so.13.0 \
libpng16.so.16 \
libpugixml.so.1 \
libraw-r.so.25 \
libstdc++.so.6 \
libswscale.so.9 \
libtbb.so.12 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libz.so.1"

inherit rpm
