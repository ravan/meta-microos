SUMMARY = "MySpell ar_EG Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_EG-20240321-1.7.noarch.rpm"
RPM_HASH = "b9e5f15554e0931c8bcce69017164af394f9697c789d077f603af744638683ecf3680f9c0fa008e1b1ecc0790a4c7c88e5d633c8949ce86713c55dda55c95afa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-EG \
locale-seamonkey-spellchecker-ar-EG \
myspell-ar-EG \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
