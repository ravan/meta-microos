SUMMARY = "MySpell fr_BE Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-fr_BE-20240321-1.7.noarch.rpm"
RPM_HASH = "21594a2154c777187fa03fdc7eeef726592f07f243460e23d3afee1df5f6851d3cb276a983d500b645136eaa0fda799c5cc19104cf6e762a7735649b3ade52df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-fr-BE \
locale-seamonkey-spellchecker-fr-BE \
myspell-dictionary \
myspell-fr-BE"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-fr-FR"

inherit rpm
