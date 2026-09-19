SUMMARY = "An arcade-style vertical scrolling shooter"
DESCRIPTION = "OpenTyrian is a port of the DOS shoot-em-up Tyrian. Thanks to Jason Emery, \
the developers were given a copy of the Tyrian source to port but \
not redistribute. That code has since been ported from Turbo Pascal to C \
using SDL, making it easily cross-platform. The 'Classic' port involves \
minimal changes, but the 'Enhanced' port will feature further development. \
Tyrian is an arcade-style vertical scrolling shooter. The story is set \
in 20,031 where you play as Trent Hawkins, a skilled fighter-pilot employed \
to fight Microsol and save the galaxy."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.20260913"

RPM_NAME = "opentyrian-2.1.20260913-1.1.aarch64.rpm"
RPM_HASH = "06c171f20866a933c41c75efcead86dd989486bcda375cd2d33d646d605214e27a728f6070ce381b70e2d316795bcbe8b4386cc49f9b1fcc61b3c5eede37b0cc"

RPROVIDES:${PN} += "opentyrian"

RDEPENDS:${PN} += "/usr/bin/sh \
libSDL2-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
