SUMMARY = "Library for Intel RealSense depth cameras"
DESCRIPTION = "The SDK allows depth and color streaming, and provides intrinsic and extrinsic \
calibration information. The library also offers synthetic streams (pointcloud, \
depth aligned to color and vise-versa), and a built-in support for record and \
playback of streaming sessions."
LICENSE = "Apache-2.0"

PV = "2.58.3"

RPM_NAME = "librealsense-2.58.3-1.1.aarch64.rpm"
RPM_HASH = "b995afe4b7330b325d78414910d93cfd68ae690051d6ec40103aa59f30ef0a95a556ec69247c5aff500aa704b62eb022ec6c24efb7e16d8303eb6241097be41a"

RPROVIDES:${PN} += "librealsense"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
librealsense2-gl.so.2.58 \
librealsense2.so.2.58 \
librsutils.so.2.58 \
libstdc++.so.6"

inherit rpm
