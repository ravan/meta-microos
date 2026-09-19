SUMMARY = "MySpell ar_OM Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_OM-20240321-1.7.noarch.rpm"
RPM_HASH = "e1ce1a2564f587dabad6e40ca74e62f88d17c526627ab46ee550d254752eca47cebb3d3aad3534068b555d69e5da7364c1d85c825ec759a7a189322e6229075c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-OM \
locale-seamonkey-spellchecker-ar-OM \
myspell-ar-OM \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
