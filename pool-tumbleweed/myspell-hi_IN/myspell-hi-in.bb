SUMMARY = "MySpell hi_IN Dictionary"
DESCRIPTION = "Hindi spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-hi_IN-20240321-1.7.noarch.rpm"
RPM_HASH = "dc387ac149a42bfb49a2f976ca9fd72ce0f130402f4b7330bec279bd0ea83f518b0a034cbad384f5a80469eab325f2e579ab56902c979f3340a065a300ac3573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-hi-IN \
locale-seamonkey-spellchecker-hi-IN \
myspell-dictionary \
myspell-hi-IN \
myspell-hindi"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
