SUMMARY = "A modern reimplementation of the game Duke Nukem II"
DESCRIPTION = "A modern reimplementation of the game Duke Nukem II, originally released in \
1993 for MS-DOS by Apogee Software. \
 \
You need the original game's data files in order to play, e.g. the freely \
available shareware version."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "RigelEngine-0.9.1-5.5.aarch64.rpm"
RPM_HASH = "02049a26613d9cc1a659399e5fc066f10be37e27abf077e4eff7c6a16da6df2534ff4b2a1ade72081352b4e5d5146432ea93f960bc23c88b8c712cd924934819"

RPROVIDES:${PN} += "RigelEngine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
