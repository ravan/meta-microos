SUMMARY = "Simple DirectMedia Layer 2 – Sound mixer library"
DESCRIPTION = "A multichannel audio mixer. It supports four channels of 16-bit stereo \
audio, plus a single channel of music, mixed by the MikMod MOD, \
Timidity MIDI, and mpg123 MP3 libraries."
LICENSE = "Zlib"

PV = "2.8.2"

RPM_NAME = "libSDL2_mixer-2_0-0-2.8.2-1.2.aarch64.rpm"
RPM_HASH = "620b02491919271afb1f327ff72da2905ee0e28f364198e0cce92b49b4598902cf620b6c67068fbb82f9fa8feba8129f93587bc1353d4c1751e36bd69fa8a399"

RPROVIDES:${PN} += "SDL2-mixer \
libSDL2-mixer-2-0-0 \
libSDL2-mixer-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libgme.so.0 \
libmpg123.so.0 \
libopusfile.so.0 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libxmp.so.4"

inherit rpm
