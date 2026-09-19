SUMMARY = "Shared library for dlib, a machine learning and data analysis library"
DESCRIPTION = "dlib is a toolkit for making real world machine learning and data analysis \
applications using Python \
 \
This package provides the shared library for dlib, a machine learning and data \
analysis library."
LICENSE = "BSL-1.0"

PV = "20.0"

RPM_NAME = "libdlib20_0_0-20.0-2.4.aarch64.rpm"
RPM_HASH = "f7a737462e4f6eef6b96ded4f5eb31142cf2012b6da3d34d14b5d4ebfc1551827ad069056074800578d8cc98d12024afa3d2103965599b6a27de1246c25eb56d"

RPROVIDES:${PN} += "libdlib.so.20.0.0 \
libdlib20-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcblas.so.3 \
libgcc-s.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblapack.so.3 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libwebp.so.7"

inherit rpm
