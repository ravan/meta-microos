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
This package contains the openmpi4 version of the NetCDF runtime libraries."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "libnetcdf22-openmpi4-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "104400e7dd56ee815b8ba7ea56c64f6ee4a48b50fde05494a48705dec39b62e0f0c81dc3da6710fe0faac309d69dd328acd661e87c9a11db131f2c344195eea8"

RPROVIDES:${PN} += "libnetcdf.so.22 \
libnetcdf22-openmpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libhdf5-310-openmpi4 \
libhdf5-hl.so.310 \
libhdf5-hl310-openmpi4 \
libhdf5.so.310 \
libm.so.6 \
libmpi.so.40 \
libxml2.so.16"

inherit rpm
