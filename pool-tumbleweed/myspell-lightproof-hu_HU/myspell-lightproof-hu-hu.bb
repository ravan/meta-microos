SUMMARY = "Lightproof for hu_HU"
DESCRIPTION = "Lightproof grammar checker information for hu_HU."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-lightproof-hu_HU-20240321-1.7.aarch64.rpm"
RPM_HASH = "1f1492699101eedd82472352933df25926c962a05eeb8d1bd76041486f35519752d0a8a84530ce41449ebafa74d6f0f400851dc68b69d7c8005b46cd39cfa0c5"

RPROVIDES:${PN} += "myspell-lightproof-hu-HU"

RDEPENDS:${PN} += "myspell-hu-HU"

inherit rpm
