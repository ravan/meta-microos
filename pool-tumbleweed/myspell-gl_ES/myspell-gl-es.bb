SUMMARY = "MySpell gl_ES Dictionary"
DESCRIPTION = "Galician spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-gl_ES-20240321-1.7.noarch.rpm"
RPM_HASH = "c856fda1cc6aa5f000b62c63ba13c6a9d5ca7f072c9e93e9938103a4b47a6894a99f2abfb5599b7cca5f18fd22c5ac3ff779d1fd080600ca5353f590590000fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-gl-ES \
locale-seamonkey-spellchecker-gl-ES \
myspell-dictionary \
myspell-gl-ES"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-gl"

inherit rpm
