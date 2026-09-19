SUMMARY = "Error correction library for CD-DA data blocks"
DESCRIPTION = "This CD-DA reader distribution ('libcdio-cdparanoia') reads audio from \
CD-ROMs directly as data, with no analog step between, and writes \
the data to a file or pipe as .wav, .aifc or as raw 16-bit linear PCM."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "libcdio_paranoia2-10.2+2.0.1-1.19.aarch64.rpm"
RPM_HASH = "4bc34b67b5fd3f571084bfebc24adac4d32bf68365f74a4f11697acd93e56d7534bab18fa7638905da7c01b9b02cc4a0872f943d9bf7cf6abff42cb840ed045b"

RPROVIDES:${PN} += "libcdio-paranoia.so.2 \
libcdio-paranoia2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio.so.19"

inherit rpm
