SUMMARY = "MySpell tr_TR Dictionary"
DESCRIPTION = "Turkish Spellcheck Dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-tr_TR-20240321-1.7.noarch.rpm"
RPM_HASH = "caa6c3eeea68c25e9e193d6a04e26b3b0f5dd77c2e06efb916ac5895c220e68420f297e82749c70a6fa3097574720858432af64d062a2ac3b68636750749cda4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-tr-TR \
locale-seamonkey-spellchecker-tr-TR \
myspell-dictionary \
myspell-tr-TR"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
