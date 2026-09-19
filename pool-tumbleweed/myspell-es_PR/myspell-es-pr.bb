SUMMARY = "MySpell es_PR Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_PR-20240321-1.7.noarch.rpm"
RPM_HASH = "c89b656c66ab522875fa149f88df25f937c0654f3b15f24da796d1d2a40bedc569278ff3502ecee2e66babcd71c1c5922fd0ae17f164265993ffc0feffa916da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-PR \
locale-seamonkey-spellchecker-es-PR \
myspell-dictionary \
myspell-es-PR \
myspell-spanish-puerto-rican"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
