SUMMARY = "The GL Vendor-Neutral Dispatch library"
DESCRIPTION = "Vendor-neutral dispatch layer for arbitrating OpenGL API calls between \
multiple vendors on a per-screen basis, as described by Andy Ritger's \
OpenGL ABI proposal."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "libglvnd-1.7.0-2.3.aarch64.rpm"
RPM_HASH = "73ef0bbcb7eb782df4e2baed3e1f1049aa666a1989fd4eb21556c8d6cd1b81a79358b9f29c2c070e4b77308534e1489d2dfcfe507ee9d6bcfeff4c4443e198b5"

RPROVIDES:${PN} += "Mesa-libGLESv1-CM1 \
Mesa-libGLESv2-2 \
libEGL.so.1 \
libGL.so.1 \
libGLESv1-CM.so.1 \
libGLESv2.so.2 \
libGLX.so.0 \
libGLdispatch.so.0 \
libOpenGL.so.0 \
libglvnd \
libglvnd0 \
provide-gl-headers-for-mesa"

RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa-dri \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
