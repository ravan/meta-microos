SUMMARY = "Data files for Warzone 2100"
DESCRIPTION = "You command the forces of 'The Project' in a battle to rebuild \
the world after mankind has almost been destroyed by nuclear \
missiles. \
 \
The game offers campaign, multi-player and single-player skirmish \
modes. An extensive tech tree with over 400 different \
technologies, combined with the unit design system, allows for \
a wide variety of possible units and tactics. \
 \
Warzone 2100 was originally developed as a commercial game by \
Pumpkin Studios and published in 1999, and was released as \
open source by them in 2004, for the community to continue \
working on it. \
 \
This package provides the game data for Warzone 2100."
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-3.0-or-later & CC0-1.0 & LGPL-2.1-only"

PV = "4.7.0"

RPM_NAME = "warzone2100-data-4.7.0-1.4.noarch.rpm"
RPM_HASH = "ebb03782589edd6248be15c3957ac122e37f5235ddd7d9370a363dec89f4af1451ad594dbfd332e5e1ed95d100485755dc52007cdfd4b94be4392c8e15e5939b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warzone2100-data"

RDEPENDS:${PN} += "warzone2100"

inherit rpm
