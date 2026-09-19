SUMMARY = "Translations for package libconfuse"
DESCRIPTION = "Provides translations for the 'libconfuse' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4"

RPM_NAME = "libconfuse-lang-3.4-1.1.noarch.rpm"
RPM_HASH = "51f1dcc153eca612d2c0940884d10af3da1774d6c731af7c360ea8e80c0002d0f97ea5188493a22bedc4c63931e8b51d0202765967bf738093ab67d8fe082e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libconfuse-lang \
libconfuse-lang-all \
locale-libconfuse-de \
locale-libconfuse-fr \
locale-libconfuse-ka \
locale-libconfuse-sv"

RDEPENDS:${PN} += "libconfuse2"

inherit rpm
