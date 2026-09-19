SUMMARY = "MySpell en_US Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_US-20240321-1.7.noarch.rpm"
RPM_HASH = "199b0e294bdec8b2af137deb98e20b01c87b71b9cf713d4a0e05d7b56f2c21097e2c5f4da530461dc8a1f7febc87013ab076b878111931a0d3ea0c1eae61f0fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-US \
locale-libreoffice-en-US \
locale-seamonkey-spellchecker-en-US \
myspell-american \
myspell-dictionary \
myspell-en-US"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en"

inherit rpm
