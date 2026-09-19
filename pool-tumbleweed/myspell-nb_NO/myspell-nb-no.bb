SUMMARY = "MySpell nb_NO Dictionary"
DESCRIPTION = "Norwegian (Nynorsk and Bokmål) spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-nb_NO-20240321-1.7.noarch.rpm"
RPM_HASH = "077889e31c6980c5e27209b160ea24f6285ef75b0350a834cf8e06a9480f632509f48b41580da42651ef5b6537b9f21c36c6a4c2b314bf51015a6aadd27e4dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-nb-NO \
locale-seamonkey-spellchecker-nb-NO \
myspell-dictionary \
myspell-nb-NO \
myspell-norsk-bokmaal"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-no"

inherit rpm
