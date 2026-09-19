SUMMARY = "MySpell fa_IR Dictionary"
DESCRIPTION = "Lilak, Persian Spell Checking Dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-fa_IR-20240321-1.7.noarch.rpm"
RPM_HASH = "0aefe1d27c4288f777c5ae945cd2989ec6ad2cb26558e8105520746552909213b9abe046850834ffe9b4cfa11cea21992becc0158daee85d587233936983fb6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-fa-IR \
locale-seamonkey-spellchecker-fa-IR \
myspell-dictionary \
myspell-fa-IR"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
