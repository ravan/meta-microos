SUMMARY = "Sound Sample Library for SDL (Simple DirectMedia Layer)"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.6"

RPM_NAME = "libSDL2_sound2-2.0.6-1.2.aarch64.rpm"
RPM_HASH = "578e3b483df86ada9ac9095f6b9b4851e754dd39aa94e9b6f82715d04772c5ade4aabe94ea94cdd351a8016bc512fcddc73cb8792e92fb6c3a34bfdad3b06455"

RPROVIDES:${PN} += "libSDL2-sound.so.2 \
libSDL2-sound2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
