SUMMARY = "Lightproof for en"
DESCRIPTION = "Lightproof grammar checker information for en."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-lightproof-en-20240321-1.7.aarch64.rpm"
RPM_HASH = "011bf93449448f676948de76c74e23e3b7f14ce833b61f6792cf584e61c337262e84875efc761d47798db517928fb7de4b56d7751fcae8d808f7413ebfe13af8"

RPROVIDES:${PN} += "myspell-lightproof-en"

RDEPENDS:${PN} += "myspell-en"

inherit rpm
