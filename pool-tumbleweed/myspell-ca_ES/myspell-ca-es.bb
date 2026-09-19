SUMMARY = "MySpell ca_ES Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ca_ES-20240321-1.7.noarch.rpm"
RPM_HASH = "0226d81724ebf53fe225586ff64820da6cfd29c6962700867801f70e03064e914ea344ee6dd4756debb43f157aa8095ebc8d309fca5c6f297aa06867cce2ef0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ca-ES \
locale-seamonkey-spellchecker-ca-ES \
myspell-ca-ES \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ca \
myspell-dictionaries"

inherit rpm
