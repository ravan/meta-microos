SUMMARY = "MySpell ca_ES_valencia Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ca_ES_valencia-20240321-1.7.noarch.rpm"
RPM_HASH = "6749f7a14918bbe253dc254d6fb2f7f468746a32d223a924f582005bb71b7f247b07f66075f37ba308132520fc8ac4541efc079c4e0d89a89d79857cb4bf979e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ca-ES-valencia \
locale-seamonkey-spellchecker-ca-ES-valencia \
myspell-ca-ES-valencia \
myspell-dictionary \
myspell-valencian"

RDEPENDS:${PN} += "myspell-ca \
myspell-dictionaries"

inherit rpm
