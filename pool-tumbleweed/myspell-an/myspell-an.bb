SUMMARY = "MySpell an Dictionary"
DESCRIPTION = "Aragonese spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-an-20240321-1.7.noarch.rpm"
RPM_HASH = "25be992dc33fa5018c73f431bb32a77cf29c80ace5853e3596a880b60f5b3e4fe1e07427d6c21a62d7bca3d86058b64bbcb2502d26831e36adb77765cfe91af0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-an \
locale-seamonkey-spellchecker-an \
myspell-an \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-an-ES \
myspell-dictionaries"

inherit rpm
