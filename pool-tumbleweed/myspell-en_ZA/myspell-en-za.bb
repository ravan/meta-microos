SUMMARY = "MySpell en_ZA Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_ZA-20240321-1.7.noarch.rpm"
RPM_HASH = "40f4f78976b4925f57b88f7d84a405521cf0c512bb8afca34d212336bcc540733b4dfe4bfcb4120e8e53ca49b99b97ad070463a0ce264791e186bb9de342edf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-ZA \
locale-seamonkey-spellchecker-en-ZA \
myspell-dictionary \
myspell-en-ZA \
myspell-south-african-english"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
