SUMMARY = "MySpell es_HN Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_HN-20240321-1.7.noarch.rpm"
RPM_HASH = "0ac2df6789db17d5aec70a260a3e3cabbd7985f5afc245cf7246c7791ca83baa9d16d6f4a62b61d45452e897136917aefe194406bcdc362b9c7727f9e572ca3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-HN \
locale-seamonkey-spellchecker-es-HN \
myspell-dictionary \
myspell-es-HN \
myspell-spanish-honduran"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
