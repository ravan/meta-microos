SUMMARY = "Development data files for netcdf"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains generic files needed to create projects that use \
any version of NetCDF."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "netcdf-devel-data-4.10.1-1.2.aarch64.rpm"
RPM_HASH = "4891571e3434b2c8c0afdbadf459be31131d41d0093bcbd711d7e452cb616b7843c1560b2c1799f84af0e88e05cd7a6102feb669f1d47495a0db7fe87525b214"

RPROVIDES:${PN} += "netcdf-devel-data \
netcdf-rpm-macros \
rpm-macro--netcdf-sonum \
rpm-macro--netcdf-version"

RDEPENDS:${PN} += ""

inherit rpm
