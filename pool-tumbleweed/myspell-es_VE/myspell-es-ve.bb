SUMMARY = "MySpell es_VE Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_VE-20240321-1.7.noarch.rpm"
RPM_HASH = "e8b323791abb4beee7c0899018093cc6bf393b33a0d4cc0d4421893a12390d572794ab03b9e0107139ed20206eeb410f3b9daf4ac706e3403fe631ca659bf26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-VE \
locale-seamonkey-spellchecker-es-VE \
myspell-dictionary \
myspell-es-VE \
myspell-spanish-venezuelan"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
