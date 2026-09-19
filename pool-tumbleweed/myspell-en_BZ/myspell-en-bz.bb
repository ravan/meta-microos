SUMMARY = "MySpell en_BZ Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_BZ-20240321-1.7.noarch.rpm"
RPM_HASH = "d2a0773e50362fe8062fb5f90fc65e2dccc8aa2f3706852affcf535400c375b1031b19b2008393e5889ba673fc566d3964eef49661750084695c437a0ce06c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-BZ \
locale-seamonkey-spellchecker-en-BZ \
myspell-dictionary \
myspell-en-BZ"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
