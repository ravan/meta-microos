SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.8.1"

RPM_NAME = "python313-h5netcdf-1.8.1-1.4.noarch.rpm"
RPM_HASH = "0fb0c7656f50a0de1c94b600f394dbf001a9091d0264263ca454639a2897a9f3ead7256d7bc5a61d0885e5469580e45536c36d6702424903b4125595927a9885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-h5netcdf \
python3.13dist-h5netcdf \
python313-h5netcdf \
python3dist-h5netcdf"

RDEPENDS:${PN} += "python-abi \
python313-h5py \
python313-packaging"

inherit rpm
