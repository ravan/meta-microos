SUMMARY = "Arcade 2D shoot-them-up game"
DESCRIPTION = "In this 'shoot 'em up' with 3d graphics, you'll have to face \
and destroy more than 60 different types of opponents. \
Nice musics, many weapons, and a ton of surprises."
LICENSE = "GPL-3.0-or-later"

PV = "0.93.1"

RPM_NAME = "powermanga-0.93.1-6.11.aarch64.rpm"
RPM_HASH = "93f8f7aabe0a1861b35218858c9d4f7c761eae43dce5269df3031c2556ca2066b67c24c3276312e7a9efb003b369999baf09caf95547eb4098186b28827a2f62"

RPROVIDES:${PN} += "config-powermanga \
powermanga"

RDEPENDS:${PN} += "/usr/bin/sh \
group-games \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
