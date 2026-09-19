SUMMARY = "Free Libre Action Roleplaying Engine"
DESCRIPTION = "Flare (Free Libre Action Roleplaying Engine) is a game engine built \
to handle a very specific kind of game: single-player 2D action RPGs. \
Flare is not a reimplementation of an existing game or engine. It is a \
tribute to and exploration of the action RPG genre. \
 \
The usecase of this project is to build several real games and \
reuse code. The first game, in progress, is a fantasy dungeon crawl. \
 \
Flare uses .ini-style config files for most of the \
game data to modify game contents. The game code is C++."
LICENSE = "(CC-BY-SA-3.0 | CC-BY-SA-4.0) & GPL-3.0-or-later"

PV = "1.15"

RPM_NAME = "flare-1.15-1.2.aarch64.rpm"
RPM_HASH = "f33e56acdb008fd439dd7b2a79d7a5c202ad0d435093a798a7293edf62ccdb6bf750322258230e687a1ab6ded3edb651204818a52da05a2a2af75f0da483e20e"

RPROVIDES:${PN} += "flare \
flare-engine"

RDEPENDS:${PN} += "flare-game \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
