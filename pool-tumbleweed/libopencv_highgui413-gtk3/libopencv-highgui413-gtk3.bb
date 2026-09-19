SUMMARY = "Higlevel GUI libraries for OpenCV"
DESCRIPTION = "Higlevel GUI libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_highgui413-gtk3-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "87de59a7c342160ffbd3115a390d9309032da061f39cb7bd68af3eb8e9fd39f2a6bfdb31f9ee6f9a185c350e32fc6ffde1a5c4757d2c0f367a3c2519bab7c81f"

RPROVIDES:${PN} += "libopencv-highgui.so.413 \
libopencv-highgui413-gtk3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libstdc++.so.6"

inherit rpm
