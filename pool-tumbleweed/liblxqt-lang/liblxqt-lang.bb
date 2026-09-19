SUMMARY = "Translations for package liblxqt"
DESCRIPTION = "Provides translations for the 'liblxqt' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "liblxqt-lang-2.4.0-2.2.noarch.rpm"
RPM_HASH = "3777e1220fdf2099236b07cc2183f2b54fd99fe0a5ffa623f540ee041ba25f840a99a6ff350861fbc40b5d8cd81333be69472aded5b25e7b5af137d14e9a0695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblxqt-lang \
liblxqt-lang-all"

RDEPENDS:${PN} += "liblxqt"

inherit rpm
