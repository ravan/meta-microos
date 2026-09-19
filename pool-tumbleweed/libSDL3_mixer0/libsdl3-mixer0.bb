SUMMARY = "Simple DirectMedia Layer 3 – Sound mixer library"
DESCRIPTION = "A multichannel audio mixer. It supports four channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the MikMod MOD, \
Timidity MIDI, and mpg123 MP3 libraries."
LICENSE = "Zlib"

PV = "3.2.2"

RPM_NAME = "libSDL3_mixer0-3.2.2-1.2.aarch64.rpm"
RPM_HASH = "8ecc2a235a5604ba6aea489a464303f79580b22ab3f230785175ef0321954dd21f86b44b7bc648abc70617f2c822b06182b6364e6a2b48719fdc30410270348c"

RPROVIDES:${PN} += "SDL3-mixer \
libSDL3-mixer.so.0 \
libSDL3-mixer0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL3.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libgme.so.0 \
libmpg123.so.0 \
libopusfile.so.0 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libxmp.so.4"

inherit rpm
