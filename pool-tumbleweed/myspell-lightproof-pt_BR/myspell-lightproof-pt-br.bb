SUMMARY = "Lightproof for pt_BR"
DESCRIPTION = "Lightproof grammar checker information for pt_BR."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-lightproof-pt_BR-20240321-1.7.aarch64.rpm"
RPM_HASH = "1613bf2db662891e28e7ce752015a37d9375ab3b0ffb617ecba3ebaeff6ce48d9477b87b6d6a367bbf3fb22ed967b0a9d56e162860dfaccb32c3a8012af594b6"

RPROVIDES:${PN} += "myspell-lightproof-pt-BR"

RDEPENDS:${PN} += "myspell-pt-BR"

inherit rpm
