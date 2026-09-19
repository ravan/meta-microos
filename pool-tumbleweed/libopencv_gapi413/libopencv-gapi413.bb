SUMMARY = "G-API library component for OpenCV"
DESCRIPTION = "G-API library component for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_gapi413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "818921f1607ce3e6ae261bb26def2563233c3f81c2fcae1fba6c4f57f25677508c7d309530881c8946a4ee938a5cf9edb18b0546e40ec1d1a9bfbb773d1d5d01"

RPROVIDES:${PN} += "libopencv-gapi.so.413 \
libopencv-gapi413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libopencv-video.so.413 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
