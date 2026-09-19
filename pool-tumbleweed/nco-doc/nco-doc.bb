SUMMARY = "Documentation for nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains the documentation for nco."
LICENSE = "BSD-3-Clause"

PV = "5.3.9"

RPM_NAME = "nco-doc-5.3.9-1.2.noarch.rpm"
RPM_HASH = "6dd5fb19a93c3c73f6d6971b7aed57e5db0099e312117854ed59cb8ad3ef049560ac061e811d2b045408a450f8906d7d4a72de0341a55b1f1aedaa81ec7673d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nco-doc"

RDEPENDS:${PN} += ""

inherit rpm
