SUMMARY = "Common files for international-doom, international-heretic and international-hexen"
DESCRIPTION = "Common files for international-doom, international-heretic and international-hexen"
LICENSE = "GPL-2.0-or-later"

PV = "9.0"

RPM_NAME = "international-doom-common-9.0-1.2.aarch64.rpm"
RPM_HASH = "f050762fc48d1675dbf51f426f16bcc30669ef7a1e0869eb1e4058e7225f31e5be1495d67ffa9dfba3ad3b000cfdef1d3e7c4e99ab72aca646b8e15b764a4996"

RPROVIDES:${PN} += "international-doom-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6"

inherit rpm
