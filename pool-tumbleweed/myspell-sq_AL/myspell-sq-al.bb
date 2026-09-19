SUMMARY = "MySpell sq_AL Dictionary"
DESCRIPTION = "Albanian spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sq_AL-20240321-1.7.noarch.rpm"
RPM_HASH = "c81d28bff1f2f026f282824da8a8f8a2b2890d33cde9abd2e9c389820ec61c69f2c7f78a753549eaf1729fcc7cb3da590794dfb0680c2d16a1b9b991e88ac46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sq-AL \
locale-seamonkey-spellchecker-sq-AL \
myspell-dictionary \
myspell-sq-AL"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
