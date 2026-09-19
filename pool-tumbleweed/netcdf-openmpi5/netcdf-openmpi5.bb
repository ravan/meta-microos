SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi5 version of utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "netcdf-openmpi5-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "f6adcd43a42177d3c1fd1366e46d560ffc4db8c52431702a1e7dbac6f337e486b765bc0d336cac875895708574b432f5fb908572d7db02999ea62c912d0f4bc7"

RPROVIDES:${PN} += "netcdf-openmpi5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310 \
libnetcdf.so.22 \
libnetcdf22-openmpi5"

inherit rpm
