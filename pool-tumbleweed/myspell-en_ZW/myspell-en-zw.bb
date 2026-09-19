SUMMARY = "MySpell en_ZW Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_ZW-20240321-1.7.noarch.rpm"
RPM_HASH = "59fbd93e55619a4908d947e6de4dbfbf4d66a34b10637592873a4be8bfef52c3ad8eb6e955ed750855eac17f7a8ac0d5a28f6fc8442f00f97b6b9bb5eba7ca38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-ZW \
locale-seamonkey-spellchecker-en-ZW \
myspell-dictionary \
myspell-en-ZW"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US \
myspell-en-ZA"

inherit rpm
