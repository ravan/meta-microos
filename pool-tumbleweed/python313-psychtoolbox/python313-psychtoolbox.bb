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

RPM_NAME = "python313-psychtoolbox-3.0.22.2-1.2.aarch64.rpm"
RPM_HASH = "382d76e9149cbec3980e67f7f778e0c8cd668c746eb22f99f935c4248e3794970593b78affb6227eab0dba19d036ab0b6cf3bc69ad2c5710b1b838bb3baf5897"

RPROVIDES:${PN} += "python3-psychtoolbox \
python3.13dist-psychtoolbox \
python313-psychtoolbox \
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
