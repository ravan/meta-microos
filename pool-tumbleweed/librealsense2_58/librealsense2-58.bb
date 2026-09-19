SUMMARY = "Library for Intel RealSense depth cameras"
DESCRIPTION = "Library for Intel RealSense depth cameras applications."
LICENSE = "Apache-2.0"

PV = "2.58.3"

RPM_NAME = "librealsense2_58-2.58.3-1.1.aarch64.rpm"
RPM_HASH = "5529714c3bbc03867b07cf735418c28dcf4ab0aab894ecd00f82a0d2f6da8676fd1abaafea97929e96f509fe5649606b2206d9123c45bbca7408ad0da6e9eb26"

RPROVIDES:${PN} += "librealsense2-58 \
librealsense2-gl.so.2.58 \
librealsense2.so.2.58 \
librsutils.so.2.58"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
librealsense-file.so \
libstdc++.so.6 \
libudev.so.1 \
libusb-1.0.so.0"

inherit rpm
