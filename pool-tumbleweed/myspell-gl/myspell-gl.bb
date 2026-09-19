SUMMARY = "MySpell gl Dictionary"
DESCRIPTION = "Galician spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-gl-20240321-1.7.noarch.rpm"
RPM_HASH = "57ee19b1a0321ba403114554907c5473714e9a8ea3d97accb4b6efa77d4a2fdb061cadd574246526a80e225a1e203e5f957a6419df65ade96d185040a169f2ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-gl \
locale-seamonkey-spellchecker-gl \
myspell-dictionary \
myspell-galician \
myspell-gl"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
