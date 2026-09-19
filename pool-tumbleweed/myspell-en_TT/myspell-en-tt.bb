SUMMARY = "MySpell en_TT Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_TT-20240321-1.7.noarch.rpm"
RPM_HASH = "fa55ef3d26724bc20cd45c133fe7b979021d75cc01452f5d68de28e2724b8229c298c7afb27779f527059cb7c8a5f16296b8f100f5d83bf5a3621c41d0a9b45e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-TT \
locale-seamonkey-spellchecker-en-TT \
myspell-dictionary \
myspell-en-TT"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
