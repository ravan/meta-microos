SUMMARY = "MySpell pl_PL Dictionary"
DESCRIPTION = "Polish spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-pl_PL-20240321-1.7.noarch.rpm"
RPM_HASH = "4d49d1c4eb3669684cc5a76c91810fa77961caee2f7f1dbe380c475e56ccbc6d83df0185e4330606ca765defe94af701eb7c0a8ada7da7b1355b44876bb97c7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-pl \
locale-libreoffice-pl-PL \
locale-seamonkey-spellchecker-pl-PL \
myspell-dictionary \
myspell-pl-PL \
myspell-polish"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
