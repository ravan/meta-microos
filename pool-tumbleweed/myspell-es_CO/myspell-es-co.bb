SUMMARY = "MySpell es_CO Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_CO-20240321-1.7.noarch.rpm"
RPM_HASH = "a6cc862c2b07381228344a10b446ea43e714f3844fd6f44ba137a8d5b2359f4833a54afca383e8f9f67c7375f7c640bdea8c77b26e8f08f7d728a5d9c8c8031b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-CO \
locale-seamonkey-spellchecker-es-CO \
myspell-dictionary \
myspell-es-CO \
myspell-spanish-colombian"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
