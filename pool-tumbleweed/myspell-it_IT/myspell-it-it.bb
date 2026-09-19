SUMMARY = "MySpell it_IT Dictionary"
DESCRIPTION = "Italian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-it_IT-20240321-1.7.noarch.rpm"
RPM_HASH = "634f8c4f24ea4feb5ea9baecb2d130cbfa3d3b52af09702aa24303f3d7715ff264f1e64a3b6b4b7c17baaf1262f569a39afd92daf6d2e6f97e46b4649a2d98a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-it \
locale-libreoffice-it-IT \
locale-seamonkey-spellchecker-it-IT \
myspell-dictionary \
myspell-it-IT \
myspell-italian"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
