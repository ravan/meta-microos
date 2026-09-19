SUMMARY = "A Portable Interface for Writing Games"
DESCRIPTION = "ClanLib delivers a platform-independent interface for writing games."
LICENSE = "Zlib"

PV = "4.2.0"

RPM_NAME = "clanlib-doc-4.2.0-4.1.noarch.rpm"
RPM_HASH = "703da1454ff9320335719824a2c94ab99a0bf593ebb341ff8314b8f8239ac1ef77dd835ad0166e20a7ac6b0eb3e20476e1f2097f462c5c835e41739e3ffc33cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clanlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
