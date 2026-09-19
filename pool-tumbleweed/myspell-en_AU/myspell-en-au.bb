SUMMARY = "MySpell en_AU Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_AU-20240321-1.7.noarch.rpm"
RPM_HASH = "33b1fa43989e1e7c81adcfd70410a38d12487c5f98ae0621c8e1f3e0e987c44f1a1818a69b8696d77c1b0c58e6fe8fa5e148d91ac0bed8086d7da4a2f1b8099c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-en-AU \
locale-libreoffice-en-AU \
locale-seamonkey-spellchecker-en-AU \
myspell-australian \
myspell-dictionary \
myspell-en-AU"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
