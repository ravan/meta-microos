SUMMARY = "MySpell en_CA Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_CA-20240321-1.7.noarch.rpm"
RPM_HASH = "f6424870c6cd9321d6f09bcb101fb3f7fee0407126d7cb3fb8e369af640bd2d868b362d8b3a0156861cea9fe7bd9b15c36a925bd9b8bd92685a88ab5ada38ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-CA \
locale-seamonkey-spellchecker-en-CA \
myspell-canadian \
myspell-dictionary \
myspell-en-CA"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
