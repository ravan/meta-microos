SUMMARY = "MySpell en_GB Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_GB-20240321-1.7.noarch.rpm"
RPM_HASH = "4967ad8dd710bacda535ec2fb51ccd7b7df6522167946243d82aca2f4a196c6359692866011730aa850ef4e647106752b4c94ee6fe2339103f54ad3fe19d7b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-en-GB \
locale-libreoffice-en-GB \
locale-seamonkey-spellchecker-en-GB \
myspell-british \
myspell-dictionary \
myspell-en-GB"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en"

inherit rpm
