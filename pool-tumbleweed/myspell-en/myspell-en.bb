SUMMARY = "MySpell en Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en-20240321-1.7.noarch.rpm"
RPM_HASH = "f51e260bfdc43de6c89e58601f074f2e5811072091017f1ff7e7c627aa6e4996476d5d41784eadf690e752a07dd811646949805db4af05b1567fb1fa3002f84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en \
locale-seamonkey-spellchecker-en \
myspell-dictionary \
myspell-en"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
