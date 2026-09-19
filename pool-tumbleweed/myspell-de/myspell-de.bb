SUMMARY = "MySpell de Dictionary"
DESCRIPTION = "German (Austria, Germany, Switzerland) spelling dictionaries, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-de-20240321-1.7.noarch.rpm"
RPM_HASH = "b0df9000a71558351d121f21a7bf3a811bd9af82999d7aafbaa13becb838fe8388ced7f76fd2bd15a434085483486cc9c7875df5fd9a6079d705b3ebfa4c6adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-de \
locale-seamonkey-spellchecker-de \
myspell-de \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
