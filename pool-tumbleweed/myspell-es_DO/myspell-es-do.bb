SUMMARY = "MySpell es_DO Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_DO-20240321-1.7.noarch.rpm"
RPM_HASH = "df914c8cdf31c5f4dadbc413af5548033a4dc62c671659f355f0da59c2523b6d4e7094c22f8d4346ee031315ce909a18cdf4174273d1b8d0419560cde5db398d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-DO \
locale-seamonkey-spellchecker-es-DO \
myspell-dictionary \
myspell-es-DO \
myspell-spanish-dominican"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
