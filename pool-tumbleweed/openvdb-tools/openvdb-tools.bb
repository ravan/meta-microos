SUMMARY = "OpenVDB command line tools"
DESCRIPTION = "This package contains the command line utilites that come with the OpenVDB \
library: vdb_lod, vdb_print, vdb_render, vdb_view"
LICENSE = "Apache-2.0"

PV = "13.0.0"

RPM_NAME = "openvdb-tools-13.0.0-2.1.aarch64.rpm"
RPM_HASH = "c0b9f5b62c4ab190f4d223fae351fb97e7f615849b743869587f028a708df194b9efc4cd6425d24be706d096422453705f142306851433e25ea66f6823ea99fc"

RPROVIDES:${PN} += "openvdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAlembic.so.1.8 \
libGLU.so.1 \
libImath-3-2.so.30 \
libOpenEXR-3-4.so.33 \
libOpenGL.so.0 \
libblosc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libjemalloc.so.2 \
libjpeg.so.8 \
libm.so.6 \
libopenvdb.so.13.0 \
libopenvdb13-0 \
libpng16.so.16 \
libstdc++.so.6 \
libtbb.so.12 \
libz.so.1"

inherit rpm
