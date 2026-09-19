SUMMARY = "MySpell pt_BR Dictionary"
DESCRIPTION = "Spelling, thesaurus, hyphenation and grammar checking tools for Brazilian Portuguese."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-pt_BR-20240321-1.7.noarch.rpm"
RPM_HASH = "91ec591c707b38e077b3c1be10f6888d273745656059e7ed821d2e10a61a1dc0ede0a54cb85d6d83ffcf773025171cf76b0368258b1398132816f156033bcca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-pt \
locale-libreoffice-pt-BR \
locale-seamonkey-spellchecker-pt-BR \
myspell-brazilian \
myspell-dictionary \
myspell-pt-BR"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
