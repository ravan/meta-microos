SUMMARY = "Documentation for conky"
DESCRIPTION = "Conky is an configurable system monitor for X. \
 \
This package provides additional documentation about conky."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.24.2"

RPM_NAME = "conky-doc-1.24.2-1.1.noarch.rpm"
RPM_HASH = "913bb4abbc4d45fd7a133c03934ba656c66c3c284522c2e846513eb458b5814c2a8513699331f7ca00452cf277c4767262e522c0da44e568d4d1c2ecb0c24846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conky-doc"

RDEPENDS:${PN} += ""

inherit rpm
