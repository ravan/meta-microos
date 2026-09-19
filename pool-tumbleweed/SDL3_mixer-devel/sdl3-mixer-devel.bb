SUMMARY = "Development files for the SDL3 sound mixer library"
DESCRIPTION = "A multi-channel audio mixer. It supports 4 channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the MikMod MOD, \
Timidity MIDI, and mpg123 MP3 libraries."
LICENSE = "Zlib"

PV = "3.2.2"

RPM_NAME = "SDL3_mixer-devel-3.2.2-1.2.aarch64.rpm"
RPM_HASH = "e66f2f471ae54c2d9bcd8c9d1a1f7c2aede9777dac69bd4d1272e8fb2202cd69f198dd14b2a9ed2a21fdf56d98adf48668f228a9727b45e7198cafce27568f22"

RPROVIDES:${PN} += "SDL3-mixer-devel \
cmake-SDL3-mixer \
pkgconfig-sdl3-mixer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL3-mixer0 \
pkgconfig-flac \
pkgconfig-fluidsynth \
pkgconfig-libgme \
pkgconfig-libmpg123 \
pkgconfig-libxmp \
pkgconfig-opusfile \
pkgconfig-sdl3 \
pkgconfig-vorbisfile \
pkgconfig-wavpack"

inherit rpm
