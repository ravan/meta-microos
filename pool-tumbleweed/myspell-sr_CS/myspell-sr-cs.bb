SUMMARY = "MySpell sr_CS Dictionary"
DESCRIPTION = "Serbian (Cyrillic and Latin) spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sr_CS-20240321-1.7.noarch.rpm"
RPM_HASH = "d15fa3fcae490895be2c1c73bc36ee857f6e46a1a760d236bc2a49aa6d4abeead52b5361c9788e6e27397781f7445be871603b6118c4acf957974d579087d66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sr-CS \
locale-seamonkey-spellchecker-sr-CS \
myspell-dictionary \
myspell-sr-CS"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-sr"

inherit rpm
