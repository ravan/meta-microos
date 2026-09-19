SUMMARY = "The Quasar DV Codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M. \
 \
This package contains the encodedv, dubdv and dvconnect tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv-1.0.0-181.3.aarch64.rpm"
RPM_HASH = "4c3c88b734960c1712aa2b3c935737019b87911c499a5ddd4ad7753e8d680ffca71e89e23a9dff50ff9e4a21373e08d34ae9dee6b96fc62fc4d4719db625c3a4"

RPROVIDES:${PN} += "libdv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdv.so.4 \
libpopt.so.0"

inherit rpm
