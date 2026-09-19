SUMMARY = "OpenGL driver testing framework"
DESCRIPTION = "Piglit is a collection of automated tests for OpenGL and OpenCL \
implementations. \
 \
The goal of Piglit is to help improve the quality of open source \
OpenGL drivers by providing developers with means to perform \
regression tests. \
 \
It contains the Glean tests, some tests adapted from Mesa, as well as \
some specific regression tests for certain bugs. HTML summaries can \
be generated, including the ability to compare different test runs."
LICENSE = "MIT"

PV = "1~20260521"

RPM_NAME = "piglit-1~20260521-1.3.aarch64.rpm"
RPM_HASH = "01dd1ae84e95d2164d12411d41055cde6ba030e1bed1de12c11b9f1914013ca1dce7520bf623e92878699897373ca18d54ff5060eef5fc4fd4b0bc3105dbbfaf"

RPROVIDES:${PN} += "libpiglitutil-gles1.so.0 \
libpiglitutil-gles2.so.0 \
libpiglitutil-gles3.so.0 \
libpiglitutil.so.0 \
piglit"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libwaffle-1.so.0 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libxcb-dri2.so.0 \
libxcb.so.1 \
libxkbcommon.so.0 \
python3 \
python3-Mako \
python3-numpy \
python3-xml"

inherit rpm
