SUMMARY = "Image processing libraries for OpenCV"
DESCRIPTION = "Image processing libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_ximgproc413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "5f53efb05e040fa55f52133a572498792487e1150724e2ace11892f2edada83f9f787e56d48ff746308fc63bd74629f02ee62946aabd81e4d72aa6f42bebee8e"

RPROVIDES:${PN} += "libopencv-ximgproc.so.413 \
libopencv-ximgproc413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libopencv-video.so.413 \
libstdc++.so.6"

inherit rpm
