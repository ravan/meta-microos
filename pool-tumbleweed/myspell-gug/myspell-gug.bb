SUMMARY = "MySpell gug Dictionary"
DESCRIPTION = "Guarani thesaurus and spell checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-gug-20240321-1.7.noarch.rpm"
RPM_HASH = "0f02e5545eceb3b750dd940dfc799fc768fe028018a35c80a971d19febcce94f23ee523ad1b4b91c6376f88c6d884a6d8ec9cbbdeaf13c351b5ee840300d984b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-gug \
locale-seamonkey-spellchecker-gug \
myspell-dictionary \
myspell-gug"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
