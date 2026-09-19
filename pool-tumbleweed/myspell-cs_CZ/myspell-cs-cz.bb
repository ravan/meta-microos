SUMMARY = "MySpell cs_CZ Dictionary"
DESCRIPTION = "Czech spell check dictionary, hyphenation rules and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-cs_CZ-20240321-1.7.noarch.rpm"
RPM_HASH = "0b57fe941cbaa059764356844ef5e3975a0851859618260a61e821f058b93cc4b18b7a29382c4314b4ab86619947f4f00dd75601f7ba241bdc8a43d450990c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-cs \
locale-libreoffice-cs-CZ \
locale-seamonkey-spellchecker-cs-CZ \
myspell-cs-CZ \
myspell-czech \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
