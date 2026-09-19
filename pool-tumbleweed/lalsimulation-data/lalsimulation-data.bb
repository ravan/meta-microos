SUMMARY = "Data files required for analyses using lalsimulation"
DESCRIPTION = "This package provides the data files used when running analyses involving \
lalsimulation."
LICENSE = "GPL-2.0-only"

PV = "6.2.0"

RPM_NAME = "lalsimulation-data-6.2.0-2.2.noarch.rpm"
RPM_HASH = "e18dbea0387656dc055b2fc446d7cccdc97bf782fd8af9d606dfec91a2c05af5eb167ebe5543a61260c0a0b49b23033b57998d05445b2f9707b6669e4361f4f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lalsimulation-data"

RDEPENDS:${PN} += ""

inherit rpm
