SUMMARY = "A Python Module for Interfacing with the SDL Multimedia Library"
DESCRIPTION = "Pygame is a Python wrapper module for the SDL multimedia library. It \
contains Python functions and classes that allow you to use SDL's \
support for playing CD-ROMs, audio and video output, and keyboard, \
mouse and joystick input. Pygame also includes support for the \
Numerical Python extension. Pygame is the successor to the pySDL \
wrapper project, written by Mark Baker."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-2-Clause & BSD-3-Clause & libpng-2.0"

PV = "2.6.1"

RPM_NAME = "python314-pygame-2.6.1-3.3.aarch64.rpm"
RPM_HASH = "7a831ae693734ac53921e7138733e9443206773db4a11978ecff40d5dac14856b697d4a5fe6249dd452c190e4e14fcfe006c4cd064eb2a8b571490e1b36c75b6"

RPROVIDES:${PN} += "python3.14dist-pygame \
python314-pygame \
python3dist-pygame"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.14 \
fontconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
libpng16.so.16 \
libportmidi.so.2 \
python-abi \
python314-numpy"

inherit rpm
