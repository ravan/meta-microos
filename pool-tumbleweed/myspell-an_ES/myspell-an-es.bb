SUMMARY = "MySpell an_ES Dictionary"
DESCRIPTION = "Aragonese spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-an_ES-20240321-1.7.noarch.rpm"
RPM_HASH = "b2329dc934890dd8d2ad3b9fcb825e6fb8991613dff345807708af8658028e375e766b85a7336a63379963ab7a488d706cdeccde7b6215525ecaf1cc0bf97c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-an-ES \
locale-seamonkey-spellchecker-an-ES \
myspell-an-ES \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
