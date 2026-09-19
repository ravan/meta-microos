SUMMARY = "Cross platform audio library"
DESCRIPTION = "The Portable C Audio Library (pcaudiolib) provides a C API to different audio devices."
LICENSE = "GPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "libpcaudio0-1.3-1.6.aarch64.rpm"
RPM_HASH = "f9ffaa1fe2d9e96eb6694cd79a242a4b944dadb1fb846572102f4ebcc2df6abfc0dab9cdacb1a1b726aa069f7fc4ea439c9b7547303a4463351632cf74522205"

RPROVIDES:${PN} += "libpcaudio.so.0 \
libpcaudio0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
