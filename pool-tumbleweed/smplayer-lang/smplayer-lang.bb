SUMMARY = "Translations for package smplayer"
DESCRIPTION = "Provides translations for the 'smplayer' package."
LICENSE = "GPL-2.0-or-later"

PV = "25.6.0"

RPM_NAME = "smplayer-lang-25.6.0-2.2.noarch.rpm"
RPM_HASH = "e5f04bee14e9b2c56b7d264cd9fb724a44af606c296ce39440628b5d0fb42ab8b1a0b2d56bce95f7ae039a216ccdee86fbb72d17099d9b9d776cb23ba245f7e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "smplayer-lang \
smplayer-lang-all"

RDEPENDS:${PN} += "smplayer"

inherit rpm
