SUMMARY = "Pieces of Psychtoolbox-3 ported to CPython"
DESCRIPTION = "Psychtoolbox is a toolbox for psychophysics experiments. \
The PTB core routines provide access to the display frame buffer and color \
lookup table, reliably synchronize with the vertical screen retrace, support \
sub-millisecond timing, expose raw OpenGL commands, support video playback \
and capture as well as low-latency audio, and facilitate the collection of \
observer responses. Ancillary routines support common needs like color \
space transformations and the QUEST threshold seeking algorithm. \
 \
This module contains pieces of Psychtoolbox ported to CPython."
LICENSE = "AML & BSD-2-Clause & MIT & X11 & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.22.2"

RPM_NAME = "python314-psychtoolbox-3.0.22.2-1.2.aarch64.rpm"
RPM_HASH = "4cb0f0516c88e646cc8e4b14afb97b38e5c60d68a43921d2c827c818e0e34aaf2636378a4c85e2d3457e9157fc3870a374c2efb4305f38bd87bd8877644b987c"

RPROVIDES:${PN} += "python3.14dist-psychtoolbox \
python314-psychtoolbox \
python3dist-psychtoolbox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libasound.so.2 \
libc.so.6 \
libportaudio.so.2 \
libusb-1.0.so.0 \
python-abi"

inherit rpm
