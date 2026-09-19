SUMMARY = "A set of backgrounds packaged with the MATE desktop"
DESCRIPTION = "This is a collection of desktop wallpapers created with MATE users \
in mind."
LICENSE = "GPL-2.0-only"

PV = "1.28.0"

RPM_NAME = "mate-backgrounds-1.28.0-1.7.noarch.rpm"
RPM_HASH = "d00edfbb6d5d0bf9b0c461420458448b42d0ebc74e2884ddcedb974b619eb4fb27e4990f6edea24f4493e4787c44ea571174113b516c468e84375b8915a538da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-backgrounds"

RDEPENDS:${PN} += ""

inherit rpm
