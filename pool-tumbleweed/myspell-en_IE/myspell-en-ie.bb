SUMMARY = "MySpell en_IE Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_IE-20240321-1.7.noarch.rpm"
RPM_HASH = "0ff022426d10669d7a3717512fe95d58e3f1b19fdacf4fd68cc6a3aea7118162bc65873f9d0f60b4c5cd1ee9ef781e204752a2cc58e2d4f552ec54748ec5260d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-IE \
locale-seamonkey-spellchecker-en-IE \
myspell-dictionary \
myspell-en-IE"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
