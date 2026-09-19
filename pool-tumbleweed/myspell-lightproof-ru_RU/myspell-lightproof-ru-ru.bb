SUMMARY = "Lightproof for ru_RU"
DESCRIPTION = "Lightproof grammar checker information for ru_RU."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-lightproof-ru_RU-20240321-1.7.aarch64.rpm"
RPM_HASH = "b42ef17a233dcfce664ba8c1c0ccedf1bdeacc1769c017b7a66543b40c77f1d63b93d44ae05b3116fd1cb300b10b35cb30a532eadfbd15635ae46a49a8958f9a"

RPROVIDES:${PN} += "myspell-lightproof-ru-RU"

RDEPENDS:${PN} += "myspell-ru-RU"

inherit rpm
