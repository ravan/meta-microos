SUMMARY = "MySpell et_EE Dictionary"
DESCRIPTION = "Estonian spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-et_EE-20240321-1.7.noarch.rpm"
RPM_HASH = "9ec6685d3e36300c355fa905c12737d4f0aaab65547803c449ca4c5824050b16c1bfc8794098c491ee6ce89c8caa276ce3d16e409eb78bb36edf8b73234549a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-et-EE \
locale-seamonkey-spellchecker-et-EE \
myspell-dictionary \
myspell-estonian \
myspell-et-EE"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
