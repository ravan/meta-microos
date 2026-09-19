SUMMARY = "System for rendering 3-D graphics"
DESCRIPTION = "Mesa is a 3-D graphics library with an API which is very similar to \
that of OpenGL.* To the extent that Mesa utilizes the OpenGL command \
syntax or state machine, it is being used with authorization from \
Silicon Graphics, Inc.(SGI). However, the author does not possess an \
OpenGL license from SGI, and makes no claim that Mesa is in any way a \
compatible replacement for OpenGL or associated with SGI. Those who \
want a licensed implementation of OpenGL should contact a licensed \
vendor. \
 \
Please do not refer to the library as MesaGL (for legal reasons). It's \
just Mesa or The Mesa 3-D graphics library. \
 \
* OpenGL is a trademark of Silicon Graphics Incorporated."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "6e2fb90b051df2d8f90ce0010150c64bb5e2c5bb95ccf97c3f4a4157f8dc1725b19aa1182757472d994ccdc0ed22895f3d352e0d3721af0e4301728aecc728f7"

RPROVIDES:${PN} += "Mesa \
Mesa-libIndirectGL1 \
Mesa-nouveau3d \
Mesa7 \
intel-i810-Mesa \
libXvMC-nouveau \
libXvMC-r600 \
libtxc-dxtn \
s2tc \
xorg-x11-Mesa"

RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa-dri \
Mesa-libEGL1 \
Mesa-libGL1 \
libglvnd"

inherit rpm
