SUMMARY = "Simple DirectMedia Layer – Sound mixer library"
DESCRIPTION = "A multichannel audio mixer. It supports four channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the popular MikMod MOD, \
Timidity MIDI, and SMPEG MP3 libraries."
LICENSE = "Zlib"

PV = "1.2.12"

RPM_NAME = "libSDL_mixer-1_2-0-1.2.12-10.8.aarch64.rpm"
RPM_HASH = "0a4c74bd528c7e981e03297db45a6393f0530b17dfedaf6976614efb3ed6f261d1546a901d119f75275da52d886720fff306df0b6475b03081e3495d3599cfef"

RPROVIDES:${PN} += "SDL-mixer \
libSDL-mixer-1-2-0 \
libSDL-mixer-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL-1.2.so.0 \
libc.so.6 \
libm.so.6 \
libmikmod.so.3 \
libmodplug.so.1 \
libvorbisfile.so.3"

inherit rpm
