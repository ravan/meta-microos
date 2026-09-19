SUMMARY = "Development data files for pnetcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains generic files needed to create projects that use \
any version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-devel-data-1.14.1-1.3.noarch.rpm"
RPM_HASH = "0f58547014ee647b074d3ec0991b1c817ddb34f32c57dd3b10bea4f3f4ac44ac349f84ed7c37f41b9aabd9b4df16cb8a6c380b4fc3cf75dc24237182b4962cc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parallel-netcdf-openmpi4-devel-data \
pnetcdf-devel-data \
rpm-macro--pnetcdf-sonum \
rpm-macro--pnetcdf-version"

RDEPENDS:${PN} += ""

inherit rpm
