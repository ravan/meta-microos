SUMMARY = "MySpell en_PH Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_PH-20240321-1.7.noarch.rpm"
RPM_HASH = "97118ef353b7982b0f80fa4e33ef8e159f5eade5d7a75671f1ff887e6235d3c147ecba32137c66a6406434888324c9b7f3a2ed9421efa9c8af4308029ba1240c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-PH \
locale-seamonkey-spellchecker-en-PH \
myspell-dictionary \
myspell-en-PH"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-US"

inherit rpm
