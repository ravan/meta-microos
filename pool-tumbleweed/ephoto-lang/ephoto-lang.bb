SUMMARY = "Translations for package ephoto"
DESCRIPTION = "Provides translations for the 'ephoto' package."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ephoto-lang-1.5-1.40.noarch.rpm"
RPM_HASH = "15b3a44d18ab1a794dbac8d649384d4d35666f1232630b5dfd8e9bd3dae43ef377ace8f559796ee84bc27717d22536fb74e1d041e0e6b5cf7e25737d2a2b0b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ephoto-lang \
ephoto-lang-all \
locale-ephoto-cs \
locale-ephoto-de \
locale-ephoto-fr \
locale-ephoto-it \
locale-ephoto-sk \
locale-ephoto-sl"

RDEPENDS:${PN} += "ephoto"

inherit rpm
