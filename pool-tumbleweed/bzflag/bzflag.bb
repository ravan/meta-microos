SUMMARY = "3D Networked Multiplayer Tank Battle Game"
DESCRIPTION = "BZFlag is a 3D multiplayer tank battle game that allows users to play \
against each other in a networked environment. Because it makes heavy \
use of 3D graphics (OpenGL), a fast CPU or a supported 3D video card is \
heavily recommended. \
 \
Find server maps in /usr/share/bzflag/maps."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.30"

RPM_NAME = "bzflag-2.4.30-1.7.aarch64.rpm"
RPM_HASH = "d7295658181364f05ec6846ea778fabe13c2512017be7a4c2bb927ab09a8581809f9e7a41f212d4a474527637d5bfc471f604cee9c25b5252cb53f1c0c2c33cb"

RPROVIDES:${PN} += "bzflag"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.3 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcares.so.2 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
