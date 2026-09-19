SUMMARY = "The Quasar DV Codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv4-1.0.0-181.3.aarch64.rpm"
RPM_HASH = "e4ef172b665cb039663ddca0d72e997143d9ffbc62b119e126e6fcd3e9e448cd8d017c644acbca4c710db9dd58658d3dd96fe7c087792d0116ea32be15e3edbc"

RPROVIDES:${PN} += "libdv.so.4 \
libdv4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
