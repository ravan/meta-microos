SUMMARY = "MySpell hr_HR Dictionary"
DESCRIPTION = "Croatian spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-hr_HR-20240321-1.7.noarch.rpm"
RPM_HASH = "37868a996f0636d8136c27a1713fec8f5d2c2ab094c186af479bfbc31c85da746fc8ae73883dd35f870cbf56ee23e5b7d5615eedd299d243250e703a83bbc8e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-hr-HR \
locale-seamonkey-spellchecker-hr-HR \
myspell-croatian \
myspell-dictionary \
myspell-hr-HR"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
