SUMMARY = "MySpell oc_FR Dictionary"
DESCRIPTION = "Occitan spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-oc_FR-20240321-1.7.noarch.rpm"
RPM_HASH = "08693597bb8519893537706d14a9215bc052e451efe64a89938d5f3b10b3c8d2fb27e07a8323f68e174b9f88982d15014d3b3e91d4123cff2bf2089e7cc722d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-oc-FR \
locale-seamonkey-spellchecker-oc-FR \
myspell-dictionary \
myspell-oc-FR \
myspell-occitan-lengadocian"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
