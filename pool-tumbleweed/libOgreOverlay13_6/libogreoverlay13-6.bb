SUMMARY = "Ogre Overlay library"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
An overlay is an additional plane that is layed over the finished render of a \
scene. Commonly, scores or interaction menus for the player are positioned \
there. In the Ogre demos, overlays are used to display the Ogre logo as well as \
current information about the scene, such as polygon count or current frames \
per second."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreOverlay13_6-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "9b4baa2fce48255820bb066e4eadfafaa1d3be36ae67c1d9ed3f8838f9f6ce538dc7e902ef4d4af4668d335dae05828f030bd9ee3d950d3691c4aa777cb17173"

RPROVIDES:${PN} += "libOgreOverlay.so.13.6 \
libOgreOverlay13-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.6 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
