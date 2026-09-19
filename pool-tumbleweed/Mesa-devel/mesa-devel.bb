SUMMARY = "Libraries, includes and more to develop Mesa applications"
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

RPM_NAME = "Mesa-devel-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "9fa2294f67c3b11e177c64e18ebd4b0f8b72eb29af11c4a5166cefeb44dd8d1b7a3366621a05967f26f640047233a602a3a8ad13806e8e0f9456a8127775553f"

RPROVIDES:${PN} += "Mesa-devel \
Mesa-devel-static \
Mesa-libIndirectGL-devel \
libtxc-dxtn-devel \
s2tc-devel \
xorg-x11-Mesa-devel"

RDEPENDS:${PN} += "Mesa \
Mesa-dri-devel \
Mesa-libEGL-devel \
Mesa-libGL-devel \
Mesa-libGLESv1-CM-devel \
Mesa-libGLESv2-devel \
libgbm-devel \
libglvnd-devel"

inherit rpm
