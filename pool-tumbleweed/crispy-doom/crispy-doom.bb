SUMMARY = "Higher resolution DOOM/Heretic/Hexen/Strife source port"
DESCRIPTION = "Crispy Doom is a limit-removing enhanced-resolution Doom source port \
based on Chocolate Doom."
LICENSE = "GPL-2.0-or-later"

PV = "7.1"

RPM_NAME = "crispy-doom-7.1-1.6.aarch64.rpm"
RPM_HASH = "468f228e34c593a5a25a0977f50a95cc4ee4ba26ad30643e3edfd02392542015f5dddf25d9e5e02e33c52034094399b3a7dc30fe9387591a8fa1350e7594c08b"

RPROVIDES:${PN} += "crispy-doom \
crispy-heretic \
crispy-hexen \
crispy-strife"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libm.so.6 \
libpng16.so.16 \
libsamplerate.so.0 \
libz.so.1"

inherit rpm
