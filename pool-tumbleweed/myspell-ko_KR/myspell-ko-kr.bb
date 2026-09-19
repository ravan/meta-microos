SUMMARY = "MySpell ko_KR Dictionary"
DESCRIPTION = "Korean spellcheck dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ko_KR-20240321-1.7.noarch.rpm"
RPM_HASH = "78ad23854314e8b0f9aaa486884b021a58bb1d11f5c64225d03280a9e4912dfda1cd6275c1acf9f77b0ea51cc422709dc6000e9b5d88e1ebf4c1413cb4ac1bd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ko-KR \
locale-seamonkey-spellchecker-ko-KR \
myspell-dictionary \
myspell-ko-KR"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
