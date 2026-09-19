SUMMARY = "A Source Package for Dictionaries Used by MySpell"
DESCRIPTION = "This source package contains dictionaries for MySpell. \
 \
The MySpell spell-checker is used by the Libreoffice office suite, \
the Mozilla Composer, and the Mozilla Mail message composition window."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-dictionaries-20240321-1.7.aarch64.rpm"
RPM_HASH = "397c44516c51d20533decb966c223336265c263228aa44d742ab0c80045d9e6716952af17040713b37a824870a697bc77d7bec8ee635b89ee5095080fc378487"

RPROVIDES:${PN} += "myspell-dictionaries"

RDEPENDS:${PN} += ""

inherit rpm
