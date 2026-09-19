SUMMARY = "Translations for package lib3270-5_5"
DESCRIPTION = "Provides translations for the 'lib3270-5_5' package."
LICENSE = "LGPL-3.0-only"

PV = "5.5.0+git20250123"

RPM_NAME = "lib3270-5_5-lang-5.5.0+git20250123-1.9.noarch.rpm"
RPM_HASH = "4483645d0cb688f311576d5bd601b48215767f17f5c0edfeb7a854ea6a16de6de148e707aacc7a01d71933e28826607f2d648543799e5be54655f308beec6a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lib3270-5-5-lang \
lib3270-5-5-lang-all \
locale-lib3270-5-5-pt-BR"

RDEPENDS:${PN} += "lib3270-5-5"

inherit rpm
