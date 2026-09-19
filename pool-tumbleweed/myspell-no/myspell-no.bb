SUMMARY = "MySpell no Dictionary"
DESCRIPTION = "Norwegian (Nynorsk and Bokmål) spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-no-20240321-1.7.noarch.rpm"
RPM_HASH = "57f3d96217ae032a1f82b4967b2659889f18493a34e00056af850c7e730cd734b87ddb5add13bb97cac0ebbc214cf68722b8e602d36641b9e0973f55a956fbeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-no \
locale-seamonkey-spellchecker-no \
myspell-dictionary \
myspell-no"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
