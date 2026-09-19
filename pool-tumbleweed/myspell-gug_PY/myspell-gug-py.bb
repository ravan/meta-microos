SUMMARY = "MySpell gug_PY Dictionary"
DESCRIPTION = "Guarani thesaurus and spell checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-gug_PY-20240321-1.7.noarch.rpm"
RPM_HASH = "5fd3bb60836319bb4917f01cb275a849cf124d04d55e47b70a532e2bdc0e64529cb3357601f8300ced6ff2fdef6fd844355606baaeb5aec62de02c225ece81bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-gug-PY \
locale-seamonkey-spellchecker-gug-PY \
myspell-dictionary \
myspell-gug-PY"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-gug"

inherit rpm
