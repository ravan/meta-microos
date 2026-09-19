SUMMARY = "Seven Kingdoms: Ancient Adversaries"
DESCRIPTION = "Seven Kingdoms made departures from the traditional real-time strategy models \
of 'gather resources, build a base and army, and attack'. The economic model \
bears more resemblance to a turn-based strategy game. It features an espionage \
system that allows players to train and control spies individually, who each \
have a spying skill that increases over time. The player is also responsible \
for catching spies in their own kingdom. Inns built within the game allow \
players to hire mercenaries of various occupations, skill levels, and races. \
Skilled spies of enemy races are essential to a well-conducted espionage \
program, and the player can bolster his forces by grabbing a skilled fighter \
or give ones own factories, mines, and towers of science, a boost by hiring a \
skilled professional. \
 \
Enlight Software decided to release the game to the Open Source community \
in August 2009. At that time everything, but the music, was released under \
the GPL v2."
LICENSE = "GPL-2.0-only"

PV = "2.15.6"

RPM_NAME = "7kaa-2.15.6-1.14.aarch64.rpm"
RPM_HASH = "f8040121c6f5fbad965058f3dd3cdc46088e70eb20ef54bfd7c49acd91619f212383dc7899a90b7bfc060f386229c4eae5072082f9e51a6cdd9716badcae2b61"

RPROVIDES:${PN} += "7kaa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6"

inherit rpm
