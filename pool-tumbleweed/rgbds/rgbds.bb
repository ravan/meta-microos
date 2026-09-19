SUMMARY = "An assembly toolchain for the Nintendo Game Boy & Game Boy Color"
DESCRIPTION = "RGBDS (Rednex Game Boy Development System) is a free assembler/linker package \
for the Game Boy and Game Boy Color."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "rgbds-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "474ebac3782795c63f33a9e59a06aebed8f9af0579bef58634739a2cc5acea5b3675f6c3e53412ec3e2c09029a77a78cc53cc4c04167c77ae313f9f673535a49"

RPROVIDES:${PN} += "rgbds"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
