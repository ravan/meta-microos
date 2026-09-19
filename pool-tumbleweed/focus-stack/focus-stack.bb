SUMMARY = "Fast and easy focus stacking"
DESCRIPTION = "This project implements a cross-platform tool for focus stacking images. The \
application takes a set of images captured at different focus distances and \
combines them so that the complete subject is in focus."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "focus-stack-1.4-1.14.aarch64.rpm"
RPM_HASH = "952589ecbde80369be3513b63e49fbe391ed505f32c743c39b114143e688c34641df0800c4c2ef0f54d6a75808d9075e336687895a93ca8c99aa46d87f626c9a"

RPROVIDES:${PN} += "focus-stack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libopencv-video.so.413 \
libstdc++.so.6"

inherit rpm
