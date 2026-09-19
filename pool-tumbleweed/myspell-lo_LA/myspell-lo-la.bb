SUMMARY = "MySpell lo_LA Dictionary"
DESCRIPTION = "Lao spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-lo_LA-20240321-1.7.noarch.rpm"
RPM_HASH = "c24c06be25c778c039da1563298d461c56e6a3872ea02888e8c6952a6f5f24b67ec96d9d5ecf982204e9621a4a9ae0149c37454a11ac7a410447aeac8d377af7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-lo-LA \
locale-seamonkey-spellchecker-lo-LA \
myspell-dictionary \
myspell-lo-LA"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
