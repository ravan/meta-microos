SUMMARY = "MySpell kmr_Latn_TR Dictionary"
DESCRIPTION = "Kurdish (Turkey) spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-kmr_Latn_TR-20240321-1.7.noarch.rpm"
RPM_HASH = "1cef54c0b654783a0cb74726315f71e24e87db7fbd857c1a0e231dc1b74ebe85e0749eb6e9f0f21ef4538149c261c2e90d59f1d6b59680e3bbcadf7398377888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-kmr-Latn-TR \
locale-seamonkey-spellchecker-kmr-Latn-TR \
myspell-dictionary \
myspell-kmr-Latn-TR"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-kmr-Latn"

inherit rpm
