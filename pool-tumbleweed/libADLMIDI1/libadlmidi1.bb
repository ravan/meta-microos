SUMMARY = "A Software MIDI Synthesizer library with OPL3 (YMF262) emulator"
DESCRIPTION = "A software MIDI synthesizer library with OPL3 emulation (FM synthesis). \
The library is based on the ADLMIDI, a multiplatform MIDI player with OPL3 emulation: \
https://bisqwit.iki.fi/source/adlmidi.html"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.6.2.1"

RPM_NAME = "libADLMIDI1-1.6.2.1-1.1.aarch64.rpm"
RPM_HASH = "68f51c92e08b281f5a1d867f5d63939fed38963219868df69f47a049693c3d4c1dfdd1e4ed280e8ec504f2d8d8c118c00ff63d7cb420d902aec82002c8c7e7f0"

RPROVIDES:${PN} += "libADLMIDI.so.1 \
libADLMIDI1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
