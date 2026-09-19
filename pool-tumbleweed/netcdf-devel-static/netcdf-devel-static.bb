SUMMARY = "Static development files for netcdf"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "netcdf-devel-static-4.10.1-1.2.aarch64.rpm"
RPM_HASH = "e69a718d272581986f7a8836ca9eaf8355722c07c738f26bf3801edd943eaf2c4d53760e1d2369e2f9c5eb438f9533172a485afa8c5f39d2e5022876a7daba9e"

RPROVIDES:${PN} += "netcdf-devel-static"

RDEPENDS:${PN} += "hdf5-devel \
libcurl-devel \
zlib-devel"

inherit rpm
