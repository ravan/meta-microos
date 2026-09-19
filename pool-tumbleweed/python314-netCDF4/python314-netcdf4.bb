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

RPM_NAME = "python314-netCDF4-1.7.4-1.5.aarch64.rpm"
RPM_HASH = "96c8932eca86c0f599b80ae8b702f292164fc7fa9dcbfbc1d2e6a1b6bd289425a218e01736310e851aea7b68c8740e498b6ae2dd7275b9fefd2c3b8e8408102c"

RPROVIDES:${PN} += "python3.14dist-netcdf4 \
python314-netCDF4 \
python3dist-netcdf4"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
hdf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf.so.22 \
netcdf \
python-abi \
python314-certifi \
python314-cftime \
python314-numpy \
update-alternatives"

inherit rpm
