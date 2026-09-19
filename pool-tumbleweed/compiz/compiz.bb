SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-0.8.18-4.5.aarch64.rpm"
RPM_HASH = "0dbb1b31f61d3d0ae7a6804cd397f5399eaa12ef6d0e39232571fd8a1aa120db5f415c0e20b1fa8ef4fe2eba427163573dcc416e730424de97afe03e6f464879"

RPROVIDES:${PN} += "compiz \
windowmanager"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
compiz-branding \
compiz-decorator \
compiz-plugins \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libcompizconfig \
libm.so.6 \
libstartup-notification-1.so.0 \
libxml2.so.16 \
pciutils"

inherit rpm
