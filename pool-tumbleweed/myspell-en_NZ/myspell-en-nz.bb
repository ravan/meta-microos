SUMMARY = "MySpell en_NZ Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_NZ-20240321-1.7.noarch.rpm"
RPM_HASH = "f53e02a1a3d089c7dd4e818978f8b65f7f64ea963a79dc8c567842491aa92a24cc40cd9cebd33871590c804f8038dd8bc6074b35c7491743360adbca4cb0fc01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-NZ \
locale-seamonkey-spellchecker-en-NZ \
myspell-dictionary \
myspell-en-NZ \
myspell-new-zaeland"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
