SUMMARY = "MySpell kmr_Latn_SY Dictionary"
DESCRIPTION = "Kurdish (Turkey) spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-kmr_Latn_SY-20240321-1.7.noarch.rpm"
RPM_HASH = "b851e8b60c07aace0d50cc5a475ca8cf167d5b417c2c6a86925ea3192b55fe9c9f56a7f89de7f35c29c0059147b363d62fe569dda01871289ae967d7aca6ca8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-kmr-Latn-SY \
locale-seamonkey-spellchecker-kmr-Latn-SY \
myspell-dictionary \
myspell-kmr-Latn-SY"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-kmr-Latn"

inherit rpm
