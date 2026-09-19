SUMMARY = "Bit-accurate C port of Impulse Tracker 2.15's IT replayer"
DESCRIPTION = "Bit-accurate C port of Impulse Tracker 2.15's IT replayer. \
This is a direct port of the original asm source codes."
LICENSE = "BSD-3-Clause"

PV = "0~git20230215"

RPM_NAME = "it2play-0~git20230215-1.12.aarch64.rpm"
RPM_HASH = "9a2a0996230237d61cbceca0c4e09f8c4a1d05d0d55fb1b7cfa2a76a6740073539c56e0c0dea4e4aff57d9a7ae2a3f7b43da47f0313a6d5264e58d929dc5d7b9"

RPROVIDES:${PN} += "it2play"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
