SUMMARY = "MySpell es_PA Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_PA-20240321-1.7.noarch.rpm"
RPM_HASH = "883091b5a02f092b426152dafad3ec13e8410b862f47205156a84ed4915bf88570442760799bacdb0597030f6dc1dda87362b59bc63d8835bdc1f0f4b75efdaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-PA \
locale-seamonkey-spellchecker-es-PA \
myspell-dictionary \
myspell-es-PA \
myspell-spanish-panamanian"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
