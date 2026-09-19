SUMMARY = "MySpell nl_BE Dictionary"
DESCRIPTION = "Dutch spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-nl_BE-20240321-1.7.noarch.rpm"
RPM_HASH = "c1e816c5889f2c38877461fb942522ce9b5acdee7b115adc805703ed5c7cbf85a5346bef8cb2d59d2c93b1bac842ba5eb4a1134aef66025235ab12434db1329e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-nl-BE \
locale-seamonkey-spellchecker-nl-BE \
myspell-dictionary \
myspell-nl-BE"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-nl-NL"

inherit rpm
