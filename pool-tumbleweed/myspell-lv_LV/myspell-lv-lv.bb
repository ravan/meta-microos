SUMMARY = "MySpell lv_LV Dictionary"
DESCRIPTION = "Latvian spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-lv_LV-20240321-1.7.noarch.rpm"
RPM_HASH = "734e794fb336590ee02d6a219bbbc936105006316f821a909f7781815fe5b8db1ce6557f000baf17927547e126a074f0dcce8edc6dd8d331da0171d9529a8ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-lv-LV \
locale-seamonkey-spellchecker-lv-LV \
myspell-dictionary \
myspell-latvian \
myspell-lv-LV"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
