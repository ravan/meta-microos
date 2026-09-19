SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.8.1"

RPM_NAME = "python314-h5netcdf-1.8.1-1.4.noarch.rpm"
RPM_HASH = "95ce963686ec33bdc512aad95347d4a5309a9e27453d7c8e0979665aa7d62f3f7bff8c54b57942889a175d3cbb858ec3b2d74fc1e682dd32eea8157bb511dc75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-h5netcdf \
python314-h5netcdf \
python3dist-h5netcdf"

RDEPENDS:${PN} += "python-abi \
python314-h5py \
python314-packaging"

inherit rpm
