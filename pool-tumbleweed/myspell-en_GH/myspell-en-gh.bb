SUMMARY = "MySpell en_GH Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-en_GH-20240321-1.7.noarch.rpm"
RPM_HASH = "b1f97acfef3d7482245c34beffcaba42ad227a07efa0b7e1475d5c6e97b65609b331cd0571e978b501f75945491410720d96759b146d2f2337c96997e81c2131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-GH \
locale-seamonkey-spellchecker-en-GH \
myspell-dictionary \
myspell-en-GH"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
