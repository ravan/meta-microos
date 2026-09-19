SUMMARY = "MySpell es_UY Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_UY-20240321-1.7.noarch.rpm"
RPM_HASH = "8f4843705690d1f855ee273d0ae5c5239d968bd9c0ec379b61a5036e746a280958fb7027e92ccea48098c53abadbaba0bc60a9c9cdd59ecd88606467c4e0a0df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-UY \
locale-seamonkey-spellchecker-es-UY \
myspell-dictionary \
myspell-es-UY \
myspell-spanish-uruguayan"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
