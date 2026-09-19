SUMMARY = "Luanti shared data"
DESCRIPTION = "An infinite-world block sandbox game and a game engine, inspired by \
InfiniMiner, Minecraft and the like. \
 \
This package contains data for luanti and luantiserver."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.1-or-later"

PV = "5.17.0"

RPM_NAME = "luanti-data-5.17.0-1.2.noarch.rpm"
RPM_HASH = "c6b69c8e2bc3b4fe0049713757f85220517aaed53127dec9e2a69f657eeb4ce98f23413cba289261683867a676c9a476d55ae787c92c93847dfc2ecfadb967b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luanti-data \
minetest-data"

RDEPENDS:${PN} += "/usr/bin/sh \
google-arimo-fonts \
google-cousine-fonts \
google-droid-fonts"

inherit rpm
