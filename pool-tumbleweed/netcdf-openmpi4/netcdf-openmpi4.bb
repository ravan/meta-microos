SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "netcdf-openmpi4-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "c8e1f19655554e5d0df10ec9b05677f2492d7cdc0c02e5bd448108c1c41a35588c178a4b0803b4731e802a098fdc680a8850d6906404746fa2d6a80d6ecaee14"

RPROVIDES:${PN} += "netcdf-openmpi4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310 \
libnetcdf.so.22 \
libnetcdf22-openmpi4"

inherit rpm
