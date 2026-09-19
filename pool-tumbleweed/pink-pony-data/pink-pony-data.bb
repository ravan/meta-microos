SUMMARY = "3D racing game with ponies - data files"
DESCRIPTION = "Pink Pony is a Tron­-like multiplayer racing­ game. You control \
little ponies that leave a trail of flowers everywhere they step. \
You have to evade these trails and force other ponies into them. \
The last pony standing wins the game. \
 \
 This package contains architecture-independent game data"
LICENSE = "CC-BY-3.0 & CC-BY-SA-3.0 & GPL-3.0-or-later & OFL-1.1 & CC0-1.0"

PV = "1.4.1"

RPM_NAME = "pink-pony-data-1.4.1-6.10.noarch.rpm"
RPM_HASH = "c3da9d8bbcb169f8fa7dbf0fdf6adac785fbe609abfb7637cd408b5bf327a41c9201ba6a86775698722903bc975f2f0cd06e99e712836b28fd021f4b0dea89a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pink-pony-data"

RDEPENDS:${PN} += "pink-pony"

inherit rpm
