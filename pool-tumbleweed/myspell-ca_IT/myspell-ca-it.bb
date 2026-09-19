SUMMARY = "MySpell ca_IT Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ca_IT-20240321-1.7.noarch.rpm"
RPM_HASH = "43391a6cd4f46fa747f7e6db416b0d95a605e4eb6d0795baec834c6e1d9a8fb531e923659ea40621b2b5002103eff7abba771285f13783e8c8de330ae89ba6c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ca-IT \
locale-seamonkey-spellchecker-ca-IT \
myspell-ca-IT \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ca \
myspell-dictionaries"

inherit rpm
