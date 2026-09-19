SUMMARY = "Package providing R-core datasets in R-datasets"
DESCRIPTION = "This package provides R-datasets, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-datasets-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "820cf5894e13c7b5ef46abfee434baef26f661291889f1f363f23ce3b3d5f4bff7a66c5ab22dfb0ac365f004f45ec8f4fa2cec812e733c8109523342a550c23c"

RPROVIDES:${PN} += "R-datasets"

RDEPENDS:${PN} += "R-base"

inherit rpm
