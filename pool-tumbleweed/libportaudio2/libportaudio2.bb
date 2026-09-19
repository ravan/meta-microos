SUMMARY = "Portable Real-Time Audio Library"
DESCRIPTION = "PortAudio is a portable audio I/O library designed for cross-platform \
support of audio. It uses a callback mechanism to request audio \
processing. Audio can be generated in various formats, including 32 bit \
floating point, and will be converted to the native format internally."
LICENSE = "MIT"

PV = "190700_20210406"

RPM_NAME = "libportaudio2-190700_20210406-1.19.aarch64.rpm"
RPM_HASH = "c0524a070e0346ac86105cd586dc34365f65b1f60fcaa882e036d0bc7d2736cd7f897c67e3eb8431f84abf0b8c77a22137c4b208d78910a717d1452fbf45484a"

RPROVIDES:${PN} += "libportaudio.so.2 \
libportaudio2 \
portaudio"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6"

inherit rpm
