SUMMARY = "MySpell ar_BH Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_BH-20240321-1.7.noarch.rpm"
RPM_HASH = "4d3bfa565d36a1657e97d67226f5d7ef77c7b773a47210aeb958217f6bd9d8d7efc47a9dc27a02f75930b790fd4a7374da02c1767cc3dc2b49f25d3074e94f5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-BH \
locale-seamonkey-spellchecker-ar-BH \
myspell-ar-BH \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
