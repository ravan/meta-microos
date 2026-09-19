SUMMARY = "MySpell sr_RS Dictionary"
DESCRIPTION = "Serbian (Cyrillic and Latin) spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sr_RS-20240321-1.7.noarch.rpm"
RPM_HASH = "195f1dc24ca414d1d5fabe0d139bdd1a46d4f1b2b442bdb59357b49010bb8bc43b5b371b226b182f3bd37ac6369539a381c0b777d70c13222f8cd057430cfcb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sr-RS \
locale-seamonkey-spellchecker-sr-RS \
myspell-dictionary \
myspell-sr-RS"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-sr"

inherit rpm
