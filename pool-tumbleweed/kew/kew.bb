SUMMARY = "A command-line music player"
DESCRIPTION = "Listen to music in the terminal."
LICENSE = "GPL-2.0-only"

PV = "4.2.7"

RPM_NAME = "kew-4.2.7-1.2.aarch64.rpm"
RPM_HASH = "8bf99f417c31a856ec57cad4195d88775b2db073e7b3a2233c2f197f106fa9917a8570a3c58d72511a0ce1b8430327189c94012198a90d7a037734071a591609"

RPROVIDES:${PN} += "kew"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchafa.so.0 \
libfaad.so.2 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libogg.so.0 \
libopus.so.0 \
libopusfile.so.0 \
libstdc++.so.6 \
libtag.so.2 \
libvorbis.so.0 \
libvorbisfile.so.3"

inherit rpm
