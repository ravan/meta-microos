SUMMARY = "MPEG-2 Decoder"
DESCRIPTION = "An MPEG2Decoder based on the libmpeg2 libraries."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "mpeg2dec-0.5.1-3.23.aarch64.rpm"
RPM_HASH = "e06b72f8ae0225e1ca1404d335734c9a688acd52cf3bc73bdca56007cc883f08b4734431494c7925e056637de1bb0dd5e7c1fafbb6de7d5fee762dc488549b25"

RPROVIDES:${PN} += "mpeg2dec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmpeg2-0 \
libmpeg2.so.0 \
libmpeg2convert.so.0 \
libmpeg2convert0"

inherit rpm
