SUMMARY = "MySpell fr_MC Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-fr_MC-20240321-1.7.noarch.rpm"
RPM_HASH = "65438ecc6f87ee8cfb6085ecc1dbab5d4c1cbc5105629c494fd8a51da98ab9e3c736fab18d9de426668adc2ae28edbe3124315e9cc07f828b21fced3a2ec0eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-fr-MC \
locale-seamonkey-spellchecker-fr-MC \
myspell-dictionary \
myspell-fr-MC"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-fr-FR"

inherit rpm
