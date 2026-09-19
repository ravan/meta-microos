SUMMARY = "Macro Assembler AS"
DESCRIPTION = "AS is a portable macro cross-assembler for a variety of microprocessors \
and controllers. Although it is mainly targeted at embedded processors \
and single-board computers, you also find CPU families that are used in \
workstations and PCs in the target list."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.42_bld310"

RPM_NAME = "asl-1.42_bld310-1.2.aarch64.rpm"
RPM_HASH = "bd4298ddaa60392a556258f8c415cf798620b06034359dc8c8e6bd7f1163785eea90a741d62695b1238188460f0c4761298fac0eeaaba90e9cc21d7d3116c811"

RPROVIDES:${PN} += "asl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
