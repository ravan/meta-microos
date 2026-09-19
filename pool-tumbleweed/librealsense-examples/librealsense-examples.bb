SUMMARY = "Examples for librealsense"
DESCRIPTION = "Examples from the librealsense library."
LICENSE = "Apache-2.0"

PV = "2.58.3"

RPM_NAME = "librealsense-examples-2.58.3-1.1.aarch64.rpm"
RPM_HASH = "41273f72983bc7f0b42ab6c1f1f6dad407cc59145ec647cecfc5f2b1167af242e94e96a28f9d6c0ab72412a6ba72db9084ddd3d09d3c2df11030d502a31f97b5"

RPROVIDES:${PN} += "librealsense-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
librealsense \
librealsense-file.so \
librealsense2-gl.so.2.58 \
librealsense2.so.2.58 \
librsutils.so.2.58 \
libstdc++.so.6"

inherit rpm
