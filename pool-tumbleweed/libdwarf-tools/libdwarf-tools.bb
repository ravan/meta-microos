SUMMARY = "DWARF-related tools"
DESCRIPTION = "Contains dwarfdump, a tool to access DWARF debug information."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "libdwarf-tools-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "4296e78344d982e275a2e624ce0b97bd9709b15200fbecfc8a7e08df66d5bc2127c91a66c9eb88c489a3d41eefa1a5dc308e04b6652a8b719409bb5ea600d466"

RPROVIDES:${PN} += "dwarfutils \
libdwarf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdwarf.so.2 \
libdwarfp.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
