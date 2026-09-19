SUMMARY = "Sound Sample Library for SDL (Simple DirectMedia Layer)"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.0"

RPM_NAME = "libSDL3_sound0-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "0a6e647095d4c0322b1b1821142c70ada545ba8c3278c039ac4192c378a9d5a80ad6c61ac374b21a364f90d5a257f06bd799aa7030fb7019b73b2bcf1ae1500c"

RPROVIDES:${PN} += "libSDL3-sound.so.0 \
libSDL3-sound0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6"

inherit rpm
