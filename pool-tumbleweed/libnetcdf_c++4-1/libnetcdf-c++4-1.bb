SUMMARY = "C++ library for the Unidata network Common Data Form version 4"
DESCRIPTION = "NetCDF4 (network Common Data Form) is a set of software libraries and \
machine-independent data formats that support the creation, access, and sharing \
of array-oriented scientific data. \
 \
This package provides the C++ API."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf_c++4-1-4.3.1-2.3.aarch64.rpm"
RPM_HASH = "4e00cdf75c0ca5a93b1910714d425ef35b2b1841e03a64954e045c629dc9a7f2491ae351baf6577ba53880f7a3d79da10cfca69ee0521ac1a534a68271cf312e"

RPROVIDES:${PN} += "libnetcdf-c++4-1 \
libnetcdf-c++4.so.1 \
libnetcdf1-/usr/lib64/libnetcdf-c++.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
