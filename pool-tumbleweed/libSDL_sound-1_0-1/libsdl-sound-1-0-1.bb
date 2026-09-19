SUMMARY = "Sound Sample Library for SDL (Simple DirectMedia Layer)"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libSDL_sound-1_0-1-1.0.3-96.19.aarch64.rpm"
RPM_HASH = "9f82c44e8b682bd67aca43ac56ce1a9039126bb33d7aeaaeef47a69caad86a05ab38c9d37d9ef07689200b8e5a7c1b5c6ab42e564b8923312c7381661423aa9b"

RPROVIDES:${PN} += "SDL-sound \
libSDL-sound-1-0-1 \
libSDL-sound-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL-1.2.so.0 \
libc.so.6 \
libmikmod.so.3 \
libmodplug.so.1 \
libogg.so.0 \
libspeex.so.1 \
libvorbisfile.so.3"

inherit rpm
