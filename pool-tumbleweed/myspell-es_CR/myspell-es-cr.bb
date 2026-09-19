SUMMARY = "MySpell es_CR Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_CR-20240321-1.7.noarch.rpm"
RPM_HASH = "08213cc5d77728258a9f1ae377099e3e928db6957ecede3f493108a6bdb2a85eb08bf78215ddb87bf1a4ff259f0921464a2a8672df2c42af0dc8b710c08290f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-CR \
locale-seamonkey-spellchecker-es-CR \
myspell-dictionary \
myspell-es-CR \
myspell-spanish-costa-rican"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
