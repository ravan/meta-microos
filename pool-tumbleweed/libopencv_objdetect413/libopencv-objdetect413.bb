SUMMARY = "Face detection libraries for OpenCV"
DESCRIPTION = "Object detection libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_objdetect413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "36bc33ae98968f38458ac7b5823ba5188770d75afc6ea81490b30ef8b6f1d2dcd5758c294c3149d2cf1c221808b4c0ba8b9832cc6811aefc0ed08ea041268011"

RPROVIDES:${PN} += "libopencv-objdetect.so.413 \
libopencv-objdetect413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-dnn.so.413 \
libopencv-imgproc.so.413 \
libstdc++.so.6 \
opencv4-cascades-data"

inherit rpm
