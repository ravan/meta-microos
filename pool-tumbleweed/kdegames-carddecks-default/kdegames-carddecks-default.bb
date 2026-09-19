SUMMARY = "Default Card Decks for KDE Games"
DESCRIPTION = "This package contains the default card deck set for KDE games."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdegames-carddecks-default-26.08.1-1.1.noarch.rpm"
RPM_HASH = "5181ac423f566fb257d5c08fa2411298816a0b178ec9f519d6755181d73ca6bb55cd3c08ccd95f63827f11b42d82c40959b1debd21b110a4cddca3a1e5c3a03d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdegames-carddecks-default"

RDEPENDS:${PN} += ""

inherit rpm
