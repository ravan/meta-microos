SUMMARY = "MySpell sv_FI Dictionary"
DESCRIPTION = "Swedish Dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sv_FI-20240321-1.7.noarch.rpm"
RPM_HASH = "8a0d078f46c3699a20fd1042af8202637147c2dad96045558dfa360c7f02d30ca460256f98ae8c9c2085133322c9f89b2260e251cd0c144db7e96aad4a22da0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sv-FI \
locale-seamonkey-spellchecker-sv-FI \
myspell-dictionary \
myspell-sv-FI"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-sv-SE"

inherit rpm
