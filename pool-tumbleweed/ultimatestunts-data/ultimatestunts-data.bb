SUMMARY = "Graphics, music, cars and tracks for Ultimate Stunts"
DESCRIPTION = "This package contains the game data for Ultimate Stunts. \
 \
Ultimate Stunts is a remake of the famous DOS game 'Stunts'. Racing in \
Ultimate Stunts involves some really spectacular stunts, like \
loopings, corkscrews, bridges to jump over, etc. You can also design \
your own tracks."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.7.1"

RPM_NAME = "ultimatestunts-data-0.7.7.1-3.4.noarch.rpm"
RPM_HASH = "5890d84ef4d938241118ccfe34621aa84d011beea041626334ab94d454145855d4ad9c7226eccb86837bd0c849c2256a3a29fdcd3e1eb6b3575cd51388f435d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ultimatestunts-data"

RDEPENDS:${PN} += ""

inherit rpm
