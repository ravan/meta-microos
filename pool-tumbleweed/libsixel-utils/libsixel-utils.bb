SUMMARY = "Utilities for the SIXEL encoder/decoder libsixel"
DESCRIPTION = "img2sixel and sixel2png utilities for libsixel, a C encoder/decoder implementation for DEC SIXEL graphics."
LICENSE = "MIT"

PV = "1.10.5"

RPM_NAME = "libsixel-utils-1.10.5-2.7.aarch64.rpm"
RPM_HASH = "bc423b5094c69c363240aaf9b03ad1a63b5eefda2a41788f580353455f532bd82d08c8badc9a0b3ab9b0197874a507ac511cabfcd7786a7f97efe172561c7972"

RPROVIDES:${PN} += "libsixel-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsixel.so.1 \
libsixel1"

inherit rpm
