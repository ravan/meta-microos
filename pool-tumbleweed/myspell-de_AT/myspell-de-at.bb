SUMMARY = "MySpell de_AT Dictionary"
DESCRIPTION = "German (Austria, Germany, Switzerland) spelling dictionaries, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-de_AT-20240321-1.7.noarch.rpm"
RPM_HASH = "77e3b8deace4af9b86f48ba0e26b16b6764d5aa7657606b69200cda33c0543e6f7b858955258feb4dc57c0adbea953eb05f7aa01f8f643f5bc2b8af95206c813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-de-AT \
locale-seamonkey-spellchecker-de-AT \
myspell-austrian \
myspell-de-AT \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-de \
myspell-de-DE \
myspell-dictionaries"

inherit rpm
