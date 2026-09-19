SUMMARY = "An action-puzzle game involving bouncing penguins"
DESCRIPTION = "IceBreaker is an action-puzzle game in which the player must section \
off level space, preferably in the least amount of time with the \
least amount of mistakes. IceBreaker was inspired by (but is far from \
an exact clone of) the 1992 game Jezzball by Dima Pavlovsky, itself \
having similarities to the 1981 game of Qix."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "icebreaker-2.2.1-3.8.aarch64.rpm"
RPM_HASH = "66d8bc322d6173507d440f2ce2f7862f32f730889e4f0369861aa235a33457e4a5c86b5f215d22edb357ea6d0d85347cecc3be1f2e8a5dc9887755febb0d52f3"

RPROVIDES:${PN} += "icebreaker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6"

inherit rpm
