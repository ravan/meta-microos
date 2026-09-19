SUMMARY = "Python interface to netCDF 3 and 4"
DESCRIPTION = "netCDF version 4 has many features not found in earlier versions of \
the library and is implemented on  top of HDF5. This module can read \
and write files in both the new netCDF 4 and the old netCDF 3 \
format, and can create files that are readable by HDF5 clients. The \
API modelled after Scientific.IO.NetCDF, and should be familiar to \
users of that module. \
 \
Most new features of netCDF 4 are implemented, such as multiple unlimited \
dimensions, groups and zlib data compression. All the new numeric data types \
(such as 64 bit and unsigned integer types) are implemented. Compound and \
variable length (vlen) data types are supported, but the enum and opaque data \
types are not. Mixtures of compound and vlen data types (compound types \
containing vlens, and vlens containing compound types) are not supported."
LICENSE = "HPND & MIT"

PV = "1.7.4"

RPM_NAME = "python313-netCDF4-1.7.4-1.5.aarch64.rpm"
RPM_HASH = "7b4a744d75af55803bbbf91b19e6bcb9967744abb843fda2a29b5e28987d29df586290dd6e3a84bd42ce308f05640acdd93781b3a029f5a7c9a9c1b3de2768e1"

RPROVIDES:${PN} += "python3-netCDF4 \
python3.13dist-netcdf4 \
python313-netCDF4 \
python3dist-netcdf4"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
hdf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf.so.22 \
netcdf \
python-abi \
python313-certifi \
python313-cftime \
python313-numpy \
update-alternatives"

inherit rpm
