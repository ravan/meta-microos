SUMMARY = "OpenGL Game Similar to the Film Tron"
DESCRIPTION = "In this game, race against other players on a permanently moving \
lightcycle (virtual motorbike), which leaves a wall as a trace. The \
lightcycles can make 90 degree turns and accelerate when driven close \
to walls. The game is over if you hit a wall. The goal of the game is \
to try to make your enemies hit the walls, while you avoid doing the \
same. Unlike glTron, this program does not require 3D hardware support."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.9.3.0"

RPM_NAME = "armagetron-0.2.9.3.0-1.4.aarch64.rpm"
RPM_HASH = "72a4e1e9637f7d5dd5cc3bd060d2a1ee74155aec40ef06202c702efa51c0a4e6ac7b3ed0800170a201a5cec0e620f6c6b2859378ccdb6d0a2f26d974b4931bfb"

RPROVIDES:${PN} += "armagetron \
config-armagetron"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
