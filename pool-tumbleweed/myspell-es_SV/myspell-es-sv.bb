SUMMARY = "MySpell es_SV Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_SV-20240321-1.7.noarch.rpm"
RPM_HASH = "549a3580f70c012046fe25ccb5535d07d38d4401463cbd6886f2455356278c53c28024adc88e7265593c11e9c51eab47f553f1faec8dec0d74ae55e86b3c84f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-SV \
locale-seamonkey-spellchecker-es-SV \
myspell-dictionary \
myspell-es-SV \
myspell-spanish-salvadorean"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
