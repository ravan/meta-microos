SUMMARY = "MySpell es_ES Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_ES-20240321-1.7.noarch.rpm"
RPM_HASH = "4e4cacd310b07217c74d052571bf4313809d434e73e295aaa9ffa19edf48553f7e0761ab5d57d2a7462e2193f59575b12ca1a0c25fa21b5911bb791f48a4cf18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-ES \
locale-seamonkey-spellchecker-es-ES \
myspell-dictionary \
myspell-es-ES \
myspell-spanish"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
