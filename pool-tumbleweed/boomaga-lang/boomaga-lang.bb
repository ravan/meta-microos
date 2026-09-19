SUMMARY = "Translations for package boomaga"
DESCRIPTION = "Provides translations for the 'boomaga' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "boomaga-lang-3.0.0-4.8.noarch.rpm"
RPM_HASH = "dbb03055234a660fe02d4e6e12957776ad18732d6716ffe97136d26820a2ba875729251e4c54ceb43d919731803e3f550d6f8204c9b20de02418f50b908dc1af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boomaga-lang \
boomaga-lang-all"

RDEPENDS:${PN} += "boomaga"

inherit rpm
