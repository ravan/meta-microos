SUMMARY = "MySpell sr Dictionary"
DESCRIPTION = "Serbian (Cyrillic and Latin) spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sr-20240321-1.7.noarch.rpm"
RPM_HASH = "afeb943bfb8d3f031404ad91a61f21e223510a9af17f01c07620c4f7158b7fd2452bce44d9d522ff7ed03f46b88e94c069b3f49c7a60b8719e8e1386769ea1fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sr \
locale-seamonkey-spellchecker-sr \
myspell-dictionary \
myspell-serbian-cyrillic \
myspell-serbian-latin \
myspell-sr"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
