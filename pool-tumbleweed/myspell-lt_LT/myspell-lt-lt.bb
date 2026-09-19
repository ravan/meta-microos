SUMMARY = "MySpell lt_LT Dictionary"
DESCRIPTION = "Lithuanian spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-lt_LT-20240321-1.7.noarch.rpm"
RPM_HASH = "aae4d2c890086a04d2a37665fda99f6091a2b585cc1bd886957d92c8cfd74798d51b52c28ebab091184fb58b7de14e50adeeeaa6727b9a918be64ee32b597655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-lt-LT \
locale-seamonkey-spellchecker-lt-LT \
myspell-dictionary \
myspell-lithuanian \
myspell-lt-LT"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
