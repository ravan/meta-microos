SUMMARY = "MySpell en_IL Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_IL-20240321-1.7.noarch.rpm"
RPM_HASH = "4ea2efea820a4e31016085074527248db73ecbd1825ffd3397a5bb59878b594d4c6956ab05143ae26f7719f46c6fefb59e1dc78a06c24a95dc402ef7d53414dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-IL \
locale-seamonkey-spellchecker-en-IL \
myspell-dictionary \
myspell-en-IL"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-US"

inherit rpm
