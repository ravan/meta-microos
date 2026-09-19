SUMMARY = "MySpell es_CU Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_CU-20240321-1.7.noarch.rpm"
RPM_HASH = "606df344fdecc984c23bd37d4a91bef8dd18d82fb46908927cfda1538d81f3d4a833c0f59898853318b5c4a5262f906e935f2b4eb46ee5b20c7b9cdb8ba781c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-CU \
locale-seamonkey-spellchecker-es-CU \
myspell-dictionary \
myspell-es-CU"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
