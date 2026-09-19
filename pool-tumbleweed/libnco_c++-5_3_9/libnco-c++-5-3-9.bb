SUMMARY = "Libraries for accessing nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains a C++ shared library for accessing HDF and \
netCDF files."
LICENSE = "BSD-3-Clause"

PV = "5.3.9"

RPM_NAME = "libnco_c++-5_3_9-5.3.9-1.2.aarch64.rpm"
RPM_HASH = "d4bccff59726dd5eed506d98daef6022931b728602300f9bdcaa0ca8ac8882ad8fa5d2a26ddcc53818f5d44210555aecc74802efe1c7ad045049030bcd3f0a6b"

RPROVIDES:${PN} += "libnco-c++ \
libnco-c++-5 \
libnco-c++-5-3-9 \
libnco-c++-5.3.9.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf.so.22 \
libstdc++.so.6"

inherit rpm
