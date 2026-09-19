SUMMARY = "Further Card Decks for KDE Games"
DESCRIPTION = "This package contains several further card deck set for KDE games."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdegames-carddecks-other-26.08.1-1.1.noarch.rpm"
RPM_HASH = "43cc2212289429e1181b672b3c08200bb22942a291515d31b81fa9aad1ea7651a3a29dd0f3a3f97309eb8c5de8caabef17ce9f806680e68e1581c1e52d8fd4b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdegames-carddecks-other"

RDEPENDS:${PN} += "kdegames-carddecks-default"

inherit rpm
