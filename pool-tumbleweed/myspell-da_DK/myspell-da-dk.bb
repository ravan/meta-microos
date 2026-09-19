SUMMARY = "MySpell da_DK Dictionary"
DESCRIPTION = "Danish spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-da_DK-20240321-1.7.noarch.rpm"
RPM_HASH = "ec5450b6cf57b8521d6d9998f72811849315ccfab62bf2828d1910061d421017bb5eba8e3ebfc962bd8144066d3d716d24006da60f36284b54b43dff9dc5d5f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-da \
locale-libreoffice-da-DK \
locale-seamonkey-spellchecker-da-DK \
myspell-da-DK \
myspell-danish \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
