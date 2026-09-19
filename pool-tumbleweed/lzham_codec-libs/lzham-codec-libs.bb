SUMMARY = "Lossless data compression codec"
DESCRIPTION = "Libraries for encoding/decoding lzham codec files."
LICENSE = "MIT"

PV = "1_0_stable1"

RPM_NAME = "lzham_codec-libs-1_0_stable1-3.9.aarch64.rpm"
RPM_HASH = "b76f4b411b6577326c32b2354760905261d91c838b9eb7a877b433160a9248c0747d8003a6b720c8a80743d6dced580191761fce4b7735bffe5e828439ff52d8"

RPROVIDES:${PN} += "liblzhamcomp.so \
liblzhamdecomp.so \
liblzhamdll.so \
lzham-codec-libs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
