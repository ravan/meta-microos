SUMMARY = "MySpell ru_RU Dictionary"
DESCRIPTION = "Russian spelling dictionary, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ru_RU-20240321-1.7.noarch.rpm"
RPM_HASH = "88a7ee7d7986a6729a00ae5ac8552bad5431d0cc1d78670e5924276b3c970c53e65e4f09fda0f1f5a27665eca0a9cf113fa25cc244eb7370a76c711fb99b9d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-ru \
locale-libreoffice-ru-RU \
locale-seamonkey-spellchecker-ru-RU \
myspell-dictionary \
myspell-ru-RU \
myspell-russian"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
