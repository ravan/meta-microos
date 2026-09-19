SUMMARY = "DOS/x86 emulator to run old DOS games"
DESCRIPTION = "dosbox-staging is DOS/x86 emulator focusing on ease of use. \
Based on DOSBox, it is a fork which use modern library (e.g.: sdl2) and \
practice in an attempt to revitalize the development process. \
DOSBox Staging is an attempt to revitalize DOSBox's development process. \
It's not a rewrite, but a continuation and improvement on the existing \
DOSBox codebase while leveraging modern development tools and practices. \
Added support: Opus, FLAC, MT32, GM, GUS, Raw mouse input and more. \
https://github.com/dosbox-staging/dosbox-staging#readme"
LICENSE = "GPL-2.0-or-later"

PV = "0.82.2"

RPM_NAME = "dosbox-0.82.2-1.7.aarch64.rpm"
RPM_HASH = "45d33f6850af7194140560ad3424bb82d37edc790ca69a8edba74d412fd938408f2fab55f359969a113c1773dbdaba93c72d1fd944460e73f180accc2937aec8"

RPROVIDES:${PN} += "dosbox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libiir.so.1 \
libm.so.6 \
libmt32emu.so.2 \
libopusfile.so.0 \
libpng16.so.16 \
libslirp.so.0 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libz-ng.so.2"

inherit rpm
