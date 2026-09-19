SUMMARY = "MySpell ca_AD Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ca_AD-20240321-1.7.noarch.rpm"
RPM_HASH = "bbc5d17a2484b066582b95d5e582396bb21fab4e8812ca0be3bc1fa4267b44caf2e5493f9933d9537723683d9d79286e8f71b726627407b0e2b191ca012a5bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ca-AD \
locale-seamonkey-spellchecker-ca-AD \
myspell-ca-AD \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ca \
myspell-dictionaries"

inherit rpm
