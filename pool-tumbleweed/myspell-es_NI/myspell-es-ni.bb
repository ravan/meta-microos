SUMMARY = "MySpell es_NI Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_NI-20240321-1.7.noarch.rpm"
RPM_HASH = "922ab51389f11753796acd44ef342fa959072320761c3ec69ab4fd26b0a8043fd651022fa76b490a5442d252a2218ab19fce955ac901f7926927b8dce22229f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-NI \
locale-seamonkey-spellchecker-es-NI \
myspell-dictionary \
myspell-es-NI \
myspell-spanish-nicaraguan"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
