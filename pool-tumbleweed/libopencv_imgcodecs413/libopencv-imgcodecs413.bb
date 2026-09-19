SUMMARY = "Image codec libraries for OpenCV"
DESCRIPTION = "Image codec libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_imgcodecs413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "047e78e0623b2eb6f33db8eb7da145bd7086affa73e66b05924c1f4586bf89e76c8223974b0345cc3a1c5bfe1f46c4973992241882284eb90d59022f3674cbb5"

RPROVIDES:${PN} += "libopencv-imgcodecs.so.413 \
libopencv-imgcodecs413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenEXR-3-4.so.33 \
libavif.so.16 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libopenjp2.so.7 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libz.so.1"

inherit rpm
