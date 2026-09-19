SUMMARY = "WildMidi Midi Wavetable Synth Lib"
DESCRIPTION = "This package contains the WildMidi core softsynth library. The library is \
designed to process a midi file and stream out the stereo audio data \
through a buffer which an external program can then process further."
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libWildMidi2-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "9785ac73599fc19d761bbcd8d80e721d32a3918f96b7e91ac79998f7ae4ed9e46be0fea55cdfcfa9b025e0e3fa4893e22c156d9200c29f8334a30389bf2beaa8"

RPROVIDES:${PN} += "config-libWildMidi2 \
libWildMidi.so.2 \
libWildMidi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
timidity"

inherit rpm
