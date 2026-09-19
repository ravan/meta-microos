SUMMARY = "MySpell vi_VN Dictionary"
DESCRIPTION = "Vietnamese spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-vi_VN-20240321-1.7.noarch.rpm"
RPM_HASH = "43df0266615a2e69c23b1bc48d1d2509b5e24faa08c8cedd9cb1f1d214a43c2fb598ac83b9a2baae326c141b57672dbde6e7b358a7ad6c30e55f657a98ff6a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-vi-VN \
locale-seamonkey-spellchecker-vi-VN \
myspell-dictionary \
myspell-vi-VN"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-vi"

inherit rpm
