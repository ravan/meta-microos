SUMMARY = "MySpell en_IN Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_IN-20240321-1.7.noarch.rpm"
RPM_HASH = "a9f2f59d9444af3ef223622ba19994091854fb3b0c8af525d37f3670ba7f6960cbb844248db506f007c4781c20fa191462e45c828c6cb9af5f24b9ba2cc127ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-IN \
locale-seamonkey-spellchecker-en-IN \
myspell-dictionary \
myspell-en-IN"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
