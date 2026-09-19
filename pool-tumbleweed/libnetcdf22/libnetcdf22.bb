SUMMARY = "Shared libraries for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
NetCDF (network Common Data Form) is an interface for array-oriented \
data access and a collection of software libraries \
for C, Fortran, C++, and Perl that provides an implementation of the \
interface. The NetCDF library also defines a machine-independent \
format for representing scientific data. Together, the interface, \
library, and format support the creation, access, and sharing of \
scientific data. \
 \
NetCDF data is: \
   - Self-Describing: A NetCDF file includes information about the \
     data it contains. \
   - Network-transparent:  A NetCDF file is represented in a form that \
     can be accessed by computers with different ways of storing \
     integers, characters, and floating-point numbers. \
   - Direct-access:  A small subset of a large dataset may be accessed \
     efficiently, without first reading through all the preceding \
     data. \
   - Appendable:  Data can be appended to a NetCDF dataset along one \
     dimension without copying the dataset or redefining its \
     structure. The structure of a NetCDF dataset can be changed, \
     though this sometimes causes the dataset to be copied. \
   - Sharable:  One writer and multiple readers may simultaneously \
     access the same NetCDF file. \
 \
This package contains the NetCDF runtime libraries."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "libnetcdf22-4.10.1-1.2.aarch64.rpm"
RPM_HASH = "6abf7b18cff07364ef341e7efe2479cdf6c8eb71ff39b5c48b5da6a699491c8af88856c4dba51a9626001322a9ebfdd7ed06f87d56a68b28d55a09350e4fdb23"

RPROVIDES:${PN} += "libnetcdf.so.22 \
libnetcdf22"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libhdf5-310 \
libhdf5-hl.so.310 \
libhdf5-hl310 \
libhdf5.so.310 \
libm.so.6 \
libxml2.so.16"

inherit rpm
