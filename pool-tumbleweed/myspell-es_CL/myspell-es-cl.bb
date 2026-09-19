SUMMARY = "MySpell es_CL Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_CL-20240321-1.7.noarch.rpm"
RPM_HASH = "7f7a29420a991fc38402314e5eb61c7bd95a64edc6825254d5ccea98bc84ac2f96cf159df41110c9de1ba719f1bbc5fe955e7fb67583156999508f53ec6847f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-CL \
locale-seamonkey-spellchecker-es-CL \
myspell-dictionary \
myspell-es-CL \
myspell-spanish-chilean"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
