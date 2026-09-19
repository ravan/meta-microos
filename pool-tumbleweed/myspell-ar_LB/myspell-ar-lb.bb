SUMMARY = "MySpell ar_LB Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_LB-20240321-1.7.noarch.rpm"
RPM_HASH = "bc9b06fbbfb060c042bc6bfa97f0c51b5046bc76fb12a4d85576481fb3fa0cc69ba783a60303b295525e8aa64c5e64f2c7278f53b055f4e5d888f573ba5cf6a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-LB \
locale-seamonkey-spellchecker-ar-LB \
myspell-ar-LB \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
