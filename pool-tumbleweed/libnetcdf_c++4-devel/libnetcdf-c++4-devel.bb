SUMMARY = "Development files for netcdf_c++"
DESCRIPTION = "This package contains the netcdf_c++4 header files and shared devel libs."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf_c++4-devel-4.3.1-2.3.aarch64.rpm"
RPM_HASH = "5229efcebac9346646b3aec3721018d4b98358a54e10c52bb443e274dca6c7e5a9e171f37b33ebccc2ead68f3af981a21b674b996162b58252c74248b7eda5d5"

RPROVIDES:${PN} += "libnetcdf-c++4-devel \
libnetcdf-devel-/usr/lib64/libnetcdf-c++.so \
netcdf-cxx4-tools \
pkgconfig-netcdf-cxx4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libnetcdf-c++4-1 \
pkgconfig-netcdf"

inherit rpm
