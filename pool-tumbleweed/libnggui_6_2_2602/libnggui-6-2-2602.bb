SUMMARY = "NETGEN mesher library - GUI part"
DESCRIPTION = "GUI support for NETGEN mesh generator shared libraries."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2602"

RPM_NAME = "libnggui_6_2_2602-6.2.2602-3.5.aarch64.rpm"
RPM_HASH = "d998bc06f9d1456020c26a602db0720c0b5b12f6732f376e14b1ed57caacc6e881b2748df254585d66ef6ab9bb2dc5988a0b5d4a7bf90e594e68970960388cd4"

RPROVIDES:${PN} += "libnggui-6-2-2602 \
libnggui.so.6.2.2602"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libTKBRep.so.7.9.3 \
libTKDEIGES.so.7.9.3 \
libTKG3d.so.7.9.3 \
libTKLCAF.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKernel.so.7.9.3 \
libX11.so.6 \
libXmu.so.6 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libngcore.so.6.2.2602 \
libnglib.so.6.2.2602 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libswscale.so.9"

inherit rpm
