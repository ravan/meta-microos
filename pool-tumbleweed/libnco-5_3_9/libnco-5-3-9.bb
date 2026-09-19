SUMMARY = "Libraries for accessing nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains a shared library for accessing HDF and netCDF \
files."
LICENSE = "BSD-3-Clause"

PV = "5.3.9"

RPM_NAME = "libnco-5_3_9-5.3.9-1.2.aarch64.rpm"
RPM_HASH = "b6bfe3fae892f8571801a579eb810021fb4b9dc559d335bca0815dfa5e9b75ef12f3ac813fe2f25a2d1f830c123da4c30b4a47f16f16b6f79d3b6228f8f2ef6b"

RPROVIDES:${PN} += "libnco \
libnco-5 \
libnco-5-3-9 \
libnco-5.3.9.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libnetcdf.so.22 \
libudunits2.so.0"

inherit rpm
