SUMMARY = "Development files for the SDL sound sample library"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.6"

RPM_NAME = "SDL2_sound-devel-2.0.6-1.2.aarch64.rpm"
RPM_HASH = "1bdd16310d86ce32aa83f5fb22c6023a42616ceb6bf92f81fd78f4a86a266f83452d656228e1bb9f562b91c72c6e0b9f98d5e1d3cc0d26549f0090e508da6808"

RPROVIDES:${PN} += "SDL2-sound-devel \
cmake-SDL2-sound \
pkgconfig-SDL2-sound"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-sound.so.2 \
libSDL2-sound2 \
libc.so.6 \
pkgconfig-sdl2"

inherit rpm
