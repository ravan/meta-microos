SUMMARY = "MySpell es_AR Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_AR-20240321-1.7.noarch.rpm"
RPM_HASH = "9d71ad6cd7f33cc808bdb1e870834e347f1d64ae435a4b723830bbdc7da7f62e8c244d2879a854ba6b4b85b104bbe8e8c8336832c750656227f0e65543df9d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-AR \
locale-seamonkey-spellchecker-es-AR \
myspell-dictionary \
myspell-es-AR \
myspell-spanish-argentine"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
