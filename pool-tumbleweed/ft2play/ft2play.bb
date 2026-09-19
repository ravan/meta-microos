SUMMARY = "Bit-accurate C port of Fasttracker's XM replayer"
DESCRIPTION = "Bit-accurate C port of Fasttracker's XM replayer (SB16/WAV render mode). \
This is a direct port of the original asm/Pascal source codes."
LICENSE = "BSD-3-Clause"

PV = "0~git20230215"

RPM_NAME = "ft2play-0~git20230215-1.12.aarch64.rpm"
RPM_HASH = "4828383e81229c8320ea4809e3fd55511516f47ae15d3be0407fbac6bd1c8c08f18c328ac8963cc0ecb9c9a7852c0a726ea9ac8c7a3854fd2e30591887dc0de1"

RPROVIDES:${PN} += "ft2play"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
