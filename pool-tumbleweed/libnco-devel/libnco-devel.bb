SUMMARY = "Development files for nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains headers and development libraries needed to \
build packages that use the libnco HDF and netCDF library."
LICENSE = "BSD-3-Clause"

PV = "5.3.9"

RPM_NAME = "libnco-devel-5.3.9-1.2.aarch64.rpm"
RPM_HASH = "b0a2df83c2c8fb248b484e93ee7410d38150f77ecbf8934d76114dfdbbc8d0ed89ca6e338fa4ace1cfc2eabfeb091dd4b35b29879190dbe3e17ade88331da6d4"

RPROVIDES:${PN} += "libnco-c++-devel \
libnco-devel \
nco-devel"

RDEPENDS:${PN} += "libnco-5-3-9 \
libnco-c++-5-3-9"

inherit rpm
