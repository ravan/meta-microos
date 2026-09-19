SUMMARY = "MySpell es Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es-20240321-1.7.noarch.rpm"
RPM_HASH = "400fc345a5898c5f7f46e2cc02f890b0915b1e8a93f5b532eabd5c84bc318c49c8950058ed9e736ef71431bde2fd5a4a36cdecb04c875085c797b048868e3b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es \
locale-seamonkey-spellchecker-es \
myspell-dictionary \
myspell-es"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
