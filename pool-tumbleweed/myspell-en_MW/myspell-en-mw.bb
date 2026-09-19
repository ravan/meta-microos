SUMMARY = "MySpell en_MW Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_MW-20240321-1.7.noarch.rpm"
RPM_HASH = "693a7ffebd14e3de33ca004f5e39bd105b3e49acf75adcaa7df903dae6b9faed0e1cc8f3348f825409a631beb4d5b9fb9150162427a22cb2bca292b411d09608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-MW \
locale-seamonkey-spellchecker-en-MW \
myspell-dictionary \
myspell-en-MW"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US \
myspell-en-ZA"

inherit rpm
