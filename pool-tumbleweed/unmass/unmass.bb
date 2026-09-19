SUMMARY = "Tool to Extract Game Archives"
DESCRIPTION = "unmass is a tool to extract game archives. \
 \
It supports the following archive types: Crimson Land, Baldur's Gate 2, \
Civilization 4, Doom (WADs), Dune 2, Etherlords 2, Final Fantasy 7 and 8, \
Flashpoint, Knights of Xentar, Metal Gear Solid (DARs), Moorhuhn 2 and 3, \
Megaman Legends, Oni, Operation Flashpoint, Princess Maker 2, Quake 1, \
RollCage, Swine, Unreal Tournament umods, Virtua Fighter bitmaps, MEA exe's, \
and some economy file formats."
LICENSE = "GPL-2.0-only"

PV = "0.92"

RPM_NAME = "unmass-0.92-3.24.aarch64.rpm"
RPM_HASH = "7470a5c666add61d1ebd909ab0e00608608ca3ed50e95708dba8e64202a2195f8b7a0c55bf3a6d62017def20c3719470a92c3750451b1949e66a134f52fb736d"

RPROVIDES:${PN} += "unmass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
