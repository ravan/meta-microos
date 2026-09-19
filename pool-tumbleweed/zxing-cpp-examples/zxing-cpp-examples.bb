SUMMARY = "Commandline examples for zxing-cpp"
DESCRIPTION = "This package holds the commandline examples for zxing-cpp."
LICENSE = "Apache-2.0 & Zlib & LGPL-2.1-with-Qt-Company-Qt-exception-1.1"

PV = "3.1.1"

RPM_NAME = "zxing-cpp-examples-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "924643cec2c87467630650bac7e9248d7e76439c804bf564bc1e4e85922f00664e4a348f602f984402ec6a7e3d4700f18c0561e55fa0f06095110741d6fa0536"

RPROVIDES:${PN} += "zxing-cpp-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libZXing.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-highgui.so.413 \
libopencv-imgproc.so.413 \
libopencv-stitching.so.413 \
libopencv-videoio.so.413 \
libstdc++.so.6 \
libwebp.so.7"

inherit rpm
