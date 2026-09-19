SUMMARY = "MySpell he_IL Dictionary"
DESCRIPTION = "Hebrew spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-he_IL-20240321-1.7.noarch.rpm"
RPM_HASH = "409f7210aec21f9b2a723aeebfddf59dc3f5e01b141a01970b0c2bcf6b985be9175fa00658d796f1c3c9ff99fbd18a7090627e26c25d80aa63f03502388bf5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-he-IL \
locale-seamonkey-spellchecker-he-IL \
myspell-dictionary \
myspell-he-IL \
myspell-hebrew"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
