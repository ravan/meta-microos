SUMMARY = "Development files for the SDL sound sample library"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "SDL_sound-devel-1.0.3-96.19.aarch64.rpm"
RPM_HASH = "d85551cc6a14787a0d5353750e6afcb89998d8cf28ea0ec0d8fdbd8fd670ada37a3728ad5159c2d3247f94252f79da9b7fbbf30e90a4256687f0912af9ba2636"

RPROVIDES:${PN} += "SDL-sound-devel \
libSDL-sound-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-sound-1-0-1 \
libSDL-sound-1.0.so.1 \
libc.so.6 \
pkgconfig-sdl"

inherit rpm
