SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python311-h5netcdf-1.3.0-1.1.noarch.rpm"
RPM_HASH = "47be61229f2ed6c4ad01e3defd7071ef618df860b7f4a24aaf7132424347ce381d142de749e020562b7dd922d047f70535834e41666ba3f1bc853ec0cd64abb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-h5netcdf \
python3.11dist-h5netcdf \
python311-h5netcdf \
python3dist-h5netcdf"

RDEPENDS:${PN} += "python-abi \
python311-h5py \
python311-packaging"

inherit rpm
