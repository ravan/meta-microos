SUMMARY = "Audio Processing Library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other. \
 \
* Implements time stretch, pitch shift and sample rate transposing \
  routines. \
* Supports the 16-bit integer or 32-bit floating point \
  PCM mono/stereo formats. \
* Capable of real-time audio stream processing (depending on hardware). \
* Additional use of assembler level and Intel MMX instruction sets."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.1"

RPM_NAME = "soundtouch-2.4.1-1.2.aarch64.rpm"
RPM_HASH = "b83934035271b90acc4fe63e5164b546572e21ee67bbec060dd8124dd4c1c1a47c3b426f09183130d6e9bbc029708faa1fb760f3a80a18af9a8b9b0121e049cb"

RPROVIDES:${PN} += "soundtouch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoundTouch.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
