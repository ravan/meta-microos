SUMMARY = "MySpell te_IN Dictionary"
DESCRIPTION = "Telugu spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-te_IN-20240321-1.7.noarch.rpm"
RPM_HASH = "78dd418f46c900df9df99d60c7ae200795847ef1295670377613c7142b553a7e76609f2539b84b44e258774e0b4bfee84a647b0cdc1a228ebc12564339ceee06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-te-IN \
locale-seamonkey-spellchecker-te-IN \
myspell-dictionary \
myspell-te-IN"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
