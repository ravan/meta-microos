SUMMARY = "MySpell ar_SA Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_SA-20240321-1.7.noarch.rpm"
RPM_HASH = "6848b65394830299261b8a90253f664d1db2f08d741b9226a7066095108c530f76be1ef6223b345758d81936e44093cf5be53f730779f281c97d5417599efe9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-SA \
locale-seamonkey-spellchecker-ar-SA \
myspell-ar-SA \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
