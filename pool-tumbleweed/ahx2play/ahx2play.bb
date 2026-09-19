SUMMARY = "Bit-accurate C port of the Amiga AHX replayer"
DESCRIPTION = "Bit-accurate C port of the Amiga AHX replayer. \
This is a direct port of the original tracker source codes."
LICENSE = "BSD-3-Clause"

PV = "0~git20230215"

RPM_NAME = "ahx2play-0~git20230215-1.11.aarch64.rpm"
RPM_HASH = "9e4a0ce1a472ace6546fa012eeb63837fb56fe0d282a5472241d1c4578320d227a22742888cb11df67bc095e119408abfdcb3d24b704475c5abc7de004f2bdf3"

RPROVIDES:${PN} += "ahx2play"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
