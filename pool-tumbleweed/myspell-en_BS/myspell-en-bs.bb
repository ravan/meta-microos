SUMMARY = "MySpell en_BS Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_BS-20240321-1.7.noarch.rpm"
RPM_HASH = "b677de44e9c627d0470c640975314bd554f80c7a13730b9eb0d87f06f862e67678bf5e59b9cfa1929340d496619a76d9739cabd980c940946ab1b78bff274df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-BS \
locale-seamonkey-spellchecker-en-BS \
myspell-dictionary \
myspell-en-BS"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
