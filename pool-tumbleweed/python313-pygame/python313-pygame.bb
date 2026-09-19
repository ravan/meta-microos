SUMMARY = "A Python Module for Interfacing with the SDL Multimedia Library"
DESCRIPTION = "Pygame is a Python wrapper module for the SDL multimedia library. It \
contains Python functions and classes that allow you to use SDL's \
support for playing CD-ROMs, audio and video output, and keyboard, \
mouse and joystick input. Pygame also includes support for the \
Numerical Python extension. Pygame is the successor to the pySDL \
wrapper project, written by Mark Baker."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-2-Clause & BSD-3-Clause & libpng-2.0"

PV = "2.6.1"

RPM_NAME = "python313-pygame-2.6.1-3.3.aarch64.rpm"
RPM_HASH = "fc1c28e2929c78835c9afcef5858bc7442afd6872e7ae9f054cbb1ebee3ff52bb11dafe7611d8323ff62e3704758d5e1b6f3dc37f94283eaea703656b698bf0b"

RPROVIDES:${PN} += "python3-pygame \
python3.13dist-pygame \
python313-pygame \
python3dist-pygame"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
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
python313-numpy"

inherit rpm
