SUMMARY = "MySpell tr Dictionary"
DESCRIPTION = "Turkish Spellcheck Dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-tr-20240321-1.7.noarch.rpm"
RPM_HASH = "35e7d1aabfea3c295b10e9ef48628adc0d64510af7a225810764e1e4ed583956af1865f34e509cb440a70adaf669b5e8385cc89f845e639fe9bc630170e5d7a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-tr \
locale-seamonkey-spellchecker-tr \
myspell-dictionary \
myspell-tr"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-tr-TR"

inherit rpm
