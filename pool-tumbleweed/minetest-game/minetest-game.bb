SUMMARY = "Minetest Game"
DESCRIPTION = "The main game for the Minetest game engine."
LICENSE = "CC-BY-3.0 & CC-BY-SA-3.0 & LGPL-2.1-or-later & CC-BY-SA-4.0 & CC0-1.0"

PV = "5.8.0"

RPM_NAME = "minetest-game-5.8.0-1.11.noarch.rpm"
RPM_HASH = "f2f90b3238ad85fa6c039b16a358b778b91a691d8a866495c005add71991694cc8f840e0eb05a89c745d0481b473ac10ed1c4f51495ac4dde8187ec74aac1fa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minetest-game"

RDEPENDS:${PN} += "minetest-runtime"

inherit rpm
