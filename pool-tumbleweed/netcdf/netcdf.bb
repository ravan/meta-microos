SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "netcdf-4.10.1-1.2.aarch64.rpm"
RPM_HASH = "d0b0e92bec8152e2c01d9a8bcff2b95473061855576db8d2a2baae7b9b6d584ef0f46953346ef9688ed1889af5773a0b158468d8196d809228122c3dc6bcb0fb"

RPROVIDES:${PN} += "netcdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310 \
libnetcdf.so.22 \
libnetcdf22"

inherit rpm
