SUMMARY = "MySpell fr_LU Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-fr_LU-20240321-1.7.noarch.rpm"
RPM_HASH = "690970cad9b20cf3fc67547d4c47ddb3f3142168a8661956e075fbab469c0bb8ae275e4d1944fbc7066791af2ab849cac3509b8a3106d84d71cebb9dc7bff47c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-fr-LU \
locale-seamonkey-spellchecker-fr-LU \
myspell-dictionary \
myspell-fr-LU"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-fr-FR"

inherit rpm
