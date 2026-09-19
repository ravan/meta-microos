SUMMARY = "MySpell es_GT Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_GT-20240321-1.7.noarch.rpm"
RPM_HASH = "ab12df741af4de396fc4a07164523d035b2b61c2188df02cddd4627f6829e85ce7ce2a44848a44867fe373c5c760f8b454e43fabeffbe589b145ef2c57e71962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-GT \
locale-seamonkey-spellchecker-es-GT \
myspell-dictionary \
myspell-es-GT \
myspell-spanish-guatemalan"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
