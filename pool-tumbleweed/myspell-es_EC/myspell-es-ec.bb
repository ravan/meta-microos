SUMMARY = "MySpell es_EC Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_EC-20240321-1.7.noarch.rpm"
RPM_HASH = "138ac57f6d31998c1a9a1f216e430d4d6dd9f5bf0b1418b4d70a31bdbe6ae9630f79197a6bf3b8c3f4d725d89bf059e50a56d0122690cfa9dac3b1f9eafd2ad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-EC \
locale-seamonkey-spellchecker-es-EC \
myspell-dictionary \
myspell-es-EC \
myspell-spanish-ecuadorian"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
