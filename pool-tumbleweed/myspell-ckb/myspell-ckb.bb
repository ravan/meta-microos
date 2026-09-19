SUMMARY = "MySpell ckb Dictionary"
DESCRIPTION = "Central Kurdish (Sorani) spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ckb-20240321-1.7.noarch.rpm"
RPM_HASH = "71bc024e4852b1e9629ce8e30144376a8f99469dda7dff02e63dfe6bd16be2d905e4a606179d1d2fe7e2214d2a86d79d8c076575c3c1c7e77c8e647220c986b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ckb \
locale-seamonkey-spellchecker-ckb \
myspell-ckb \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
