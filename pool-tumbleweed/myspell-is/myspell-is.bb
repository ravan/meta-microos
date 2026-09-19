SUMMARY = "MySpell is Dictionary"
DESCRIPTION = "Icelandic spelling dictionary, hyphenation rules and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-is-20240321-1.7.noarch.rpm"
RPM_HASH = "8d495651bbdc2a35d15de2e724c3b0c029fc808fcc7a2d70f6833e2d10dc519dd1d86f4c0fdce2ac5866772568356cba5846bc974a18769ab3048dd2333d7542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-is \
locale-seamonkey-spellchecker-is \
myspell-dictionary \
myspell-icelandic \
myspell-is"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
