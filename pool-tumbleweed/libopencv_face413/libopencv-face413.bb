SUMMARY = "Face detection libraries for OpenCV"
DESCRIPTION = "Face detection libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_face413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "717614cde7fbedab5f2826e301bfcf2803646381524474a96d8f60b0ed38588fd1c125e60bdf1c24bf81411a961858d20a7a53d533f3b6986b346363adb73041"

RPROVIDES:${PN} += "libopencv-face.so.413 \
libopencv-face413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libopencv-objdetect.so.413 \
libstdc++.so.6 \
opencv4-cascades-data"

inherit rpm
