SUMMARY = "MySpell ar_SY Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_SY-20240321-1.7.noarch.rpm"
RPM_HASH = "b23a47d83fbf79bdb8189ec7666d94ae038957813d9d7234126636852fcb14f82cb6a9afccee449475daec247e8d2b74044e13899a9e9a0d9e22d6597a6d8483"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-SY \
locale-seamonkey-spellchecker-ar-SY \
myspell-ar-SY \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
