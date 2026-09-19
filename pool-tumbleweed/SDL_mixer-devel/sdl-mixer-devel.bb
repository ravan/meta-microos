SUMMARY = "Development files for the SDL sound mixer library"
DESCRIPTION = "A multi-channel audio mixer. It supports 4 channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the popular MikMod MOD, \
Timidity MIDI, and SMPEG MP3 libraries."
LICENSE = "Zlib"

PV = "1.2.12"

RPM_NAME = "SDL_mixer-devel-1.2.12-10.8.aarch64.rpm"
RPM_HASH = "fe839a04a42c0d4d3006b7b15f0b3009b84527d71a0a31cb05df63287d62d9ef182234818ac08e0a63d076717dd01b39919367d8dac81fb33a14afc2e80eb13c"

RPROVIDES:${PN} += "SDL-mixer-devel \
libSDL-mixer-devel \
pkgconfig-SDL-mixer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1-2-0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
pkgconfig-sdl"

inherit rpm
