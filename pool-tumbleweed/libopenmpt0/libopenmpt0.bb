SUMMARY = "Library to operate with module formats using the openmpt API"
DESCRIPTION = "libopenmpt is a C++ and C library to decode tracker music files \
(modules) into a PCM audio stream. It is based on the player code of \
the OpenMPT project, a descendant of the original ModPlug Tracker."
LICENSE = "BSD-3-Clause"

PV = "0.8.9"

RPM_NAME = "libopenmpt0-0.8.9-1.1.aarch64.rpm"
RPM_HASH = "5bcde3ae9056dc9c6758dc121523b07ec0fd18809d1a3ffdb17abab401043768f044900a3280cf8a9c4965c56ab6ed16cdcc4359c2f72e3de551f28ce5aa4e7b"

RPROVIDES:${PN} += "libopenmpt.so.0 \
libopenmpt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpg123.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
