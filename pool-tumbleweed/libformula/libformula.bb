SUMMARY = "Formula Parser"
DESCRIPTION = "LibFormula provides Excel-Style-Expressions. The implementation provided \
here is very generic and can be used in any application that needs to \
compute formulas."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libformula-1.1.6-2.9.noarch.rpm"
RPM_HASH = "5d26e77fe6fb6aafe2663193d941e01643896eff7c9b823fa2bf5a4dfc6a9b85d6213ae9bfc4fbb9d49faae1e3095291380e25c7cc208c62488cf8d8a345ac8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libformula"

RDEPENDS:${PN} += "apache-commons-logging \
java \
jpackage-utils \
libbase"

inherit rpm
