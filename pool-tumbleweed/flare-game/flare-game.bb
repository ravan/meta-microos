SUMMARY = "Free Libre Action Roleplaying Engine — Game"
DESCRIPTION = "Flare (Free Libre Action Roleplaying Engine) is a simple game engine built \
to handle a very specific kind of game: single-player 2D action RPGs. \
Flare is not a reimplementation of an existing game or engine. It is a \
tribute to and exploration of the action RPG genre. \
 \
Rather than building a very abstract, robust game engine, the goal of this \
project is to build several real games and harvest an engine from the common, \
reusable code. The first game, in progress, is a fantasy dungeon crawl. \
 \
Flare uses simple file formats (INI style config files) for most of the \
game data, allowing anyone to easily modify game contents. Open formats \
are preferred (png, ogg). The game code is C++."
LICENSE = "CC-BY-SA-3.0+"

PV = "1.15"

RPM_NAME = "flare-game-1.15-1.2.noarch.rpm"
RPM_HASH = "896095fa724cf927d7c615ed167aba46c60b5d00400acdbaabab0a442dadc8002e195d8b17305d398c1b75c2ddab582b948369c1bc55216e680152f62bd901f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flare-data \
flare-game"

RDEPENDS:${PN} += "flare-engine"

inherit rpm
