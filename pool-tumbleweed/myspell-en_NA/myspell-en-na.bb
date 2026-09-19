SUMMARY = "MySpell en_NA Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_NA-20240321-1.7.noarch.rpm"
RPM_HASH = "b4244c4728fe2c72bfd327009d42c9bb1a518b3cf9aa35d20f0bad14b505a4c4ab82b91cdbcb5e90b054962f69e59763fbf2d978ad4b7ac844b4a8b8b8455c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-NA \
locale-seamonkey-spellchecker-en-NA \
myspell-dictionary \
myspell-en-NA"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US \
myspell-en-ZA"

inherit rpm
