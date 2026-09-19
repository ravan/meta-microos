SUMMARY = "MySpell de_DE Dictionary"
DESCRIPTION = "German (Austria, Germany, Switzerland) spelling dictionaries, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-de_DE-20240321-1.7.noarch.rpm"
RPM_HASH = "cc1778bd29580dd4da734c1c9d58f6dd67dc9f360f08111ddc2f9cf94c81547812e7c288b24dda9d7cf088fa4330cc4c67cc89c4b245909d45eaad42b6160d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-de-DE \
locale-seamonkey-spellchecker-de-DE \
myspell-de-DE \
myspell-dictionary \
myspell-german"

RDEPENDS:${PN} += "myspell-de \
myspell-dictionaries"

inherit rpm
