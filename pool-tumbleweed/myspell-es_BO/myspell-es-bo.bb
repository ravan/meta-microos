SUMMARY = "MySpell es_BO Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_BO-20240321-1.7.noarch.rpm"
RPM_HASH = "d700a35fb41adf922c90310adbeb396051ba16590cd60378ff22248f21675438346a91e4aa8db518780aa08676aa5edb8a362a817256f2d392da942aa5c3471e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-BO \
locale-seamonkey-spellchecker-es-BO \
myspell-dictionary \
myspell-es-BO \
myspell-spanish-bolivian"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
