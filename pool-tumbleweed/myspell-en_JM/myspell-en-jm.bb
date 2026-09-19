SUMMARY = "MySpell en_JM Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_JM-20240321-1.7.noarch.rpm"
RPM_HASH = "abd16e3cd7a2ddf5542b016ab67304c9cbe1b92d98b7c13de12dc6a02be8b567eb94cfc0372e2e7e6e1fba833dedbfe0b7459972b84d2dfc57b9de8ceddd7508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-JM \
locale-seamonkey-spellchecker-en-JM \
myspell-dictionary \
myspell-en-JM"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
