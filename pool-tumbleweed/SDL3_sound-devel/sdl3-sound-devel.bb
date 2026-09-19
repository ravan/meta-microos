SUMMARY = "Development files for the SDL sound sample library"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.0"

RPM_NAME = "SDL3_sound-devel-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "34761f8baa42575c55f09fc4cf5a2e5573bca29a6a98544bb5fba2b1925167dbc9762ab131bcbf1fd22e297d09cad6493e5c2d81851540992aef0c576b305486"

RPROVIDES:${PN} += "SDL3-sound-devel \
cmake-SDL3-sound \
pkgconfig-sdl3-sound"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libSDL3-sound.so.0 \
libSDL3-sound0 \
libSDL3.so.0 \
libc.so.6 \
pkgconfig-sdl2 \
pkgconfig-sdl3"

inherit rpm
