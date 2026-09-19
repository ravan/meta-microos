SUMMARY = "Development files for the SDL2 sound mixer library"
DESCRIPTION = "A multi-channel audio mixer. It supports 4 channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the MikMod MOD, \
Timidity MIDI, and mpg123 MP3 libraries."
LICENSE = "Zlib"

PV = "2.8.2"

RPM_NAME = "SDL2_mixer-devel-2.8.2-1.2.aarch64.rpm"
RPM_HASH = "0f1322de55a1b4b727f1746b3d496a17bcfcbbfcbf283a5333a2b50d8663061935172fce0aca0d2ebc0e638452b9f0a00142044af038bb9178da22b06340291d"

RPROVIDES:${PN} += "SDL2-mixer-devel \
libSDL2-mixer-devel \
pkgconfig-SDL2-mixer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-mixer-2-0-0 \
pkgconfig-flac \
pkgconfig-fluidsynth \
pkgconfig-libgme \
pkgconfig-libmpg123 \
pkgconfig-libxmp \
pkgconfig-opusfile \
pkgconfig-sdl2 \
pkgconfig-vorbisfile \
pkgconfig-wavpack"

inherit rpm
