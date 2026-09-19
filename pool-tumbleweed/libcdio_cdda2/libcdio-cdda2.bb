SUMMARY = "CD-DA reading library"
DESCRIPTION = "This CD-DA reader distribution ('libcdio-cdparanoia') reads audio from \
CD-ROMs directly as data, with no analog step between, and writes \
the data to a file or pipe as .wav, .aifc or as raw 16-bit linear PCM."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "libcdio_cdda2-10.2+2.0.1-1.19.aarch64.rpm"
RPM_HASH = "4aa1d222e3427d8bfe900fe39c41674d8aa34f7f9d5086a8bbb54d18171f612b99b846637e0a0620e6e7381599e91fa3e8f7c3ba0ff919b0093ee181efea0619"

RPROVIDES:${PN} += "libcdio-cdda.so.2 \
libcdio-cdda2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libm.so.6"

inherit rpm
