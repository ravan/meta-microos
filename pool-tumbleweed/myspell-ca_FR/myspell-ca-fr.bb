SUMMARY = "MySpell ca_FR Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ca_FR-20240321-1.7.noarch.rpm"
RPM_HASH = "bd2c1faee92b8d1c96b1e4411ff0636e03bbfd2418786d88abd25a0a7df01ea8af326c4c920b39f2298e84233b42901fb034b2699d73bee9010742c9b30b4d44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ca-FR \
locale-seamonkey-spellchecker-ca-FR \
myspell-ca-FR \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ca \
myspell-dictionaries"

inherit rpm
