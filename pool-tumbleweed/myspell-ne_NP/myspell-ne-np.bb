SUMMARY = "MySpell ne_NP Dictionary"
DESCRIPTION = "Nepali spelling dictionary, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ne_NP-20240321-1.7.noarch.rpm"
RPM_HASH = "8ea14e0ee93221537f5687a2cb9ff4ee648e2d16e5547ea2d8b74933872d19f51e648f3fd272585ba8f3c6776bfa814f128c5869db75935d25b3af4924432cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ne-NP \
locale-seamonkey-spellchecker-ne-NP \
myspell-dictionary \
myspell-ne-NP"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
