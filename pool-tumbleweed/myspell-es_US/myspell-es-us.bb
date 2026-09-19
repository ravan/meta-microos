SUMMARY = "MySpell es_US Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_US-20240321-1.7.noarch.rpm"
RPM_HASH = "5ee0befda6dbef2be949ea998e4c4690d52f916480a33e89c9f5a6eb300004f29e1eca4ed9881e35fd32de52c9fe8fc33dc4f3f236eb503765fab137b6542f1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-US \
locale-seamonkey-spellchecker-es-US \
myspell-dictionary \
myspell-es-US"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
