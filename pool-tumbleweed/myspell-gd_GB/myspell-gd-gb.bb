SUMMARY = "MySpell gd_GB Dictionary"
DESCRIPTION = "Scottish Gaelic spell checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-gd_GB-20240321-1.7.noarch.rpm"
RPM_HASH = "b0b8fefb0b75c86db7692677613fb22c98de9a7892fd80a7cb59f7ab42fb6e02b85d0c1fcc2ae88003724126a87e33f19c61270ea7cd3672768f5521c25ff3b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-gd-GB \
locale-seamonkey-spellchecker-gd-GB \
myspell-dictionary \
myspell-gaelic \
myspell-gd-GB"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
