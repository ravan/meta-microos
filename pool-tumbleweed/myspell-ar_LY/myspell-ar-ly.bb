SUMMARY = "MySpell ar_LY Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_LY-20240321-1.7.noarch.rpm"
RPM_HASH = "20ff308591fe6a3cf2495e1821ea732862fe99bff9a350c5ac3cc410dd0ef44587c39db242d05a5b256ee986e187f8fe7189bcd97e7c563808ca8d64ad8f1758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-LY \
locale-seamonkey-spellchecker-ar-LY \
myspell-ar-LY \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
