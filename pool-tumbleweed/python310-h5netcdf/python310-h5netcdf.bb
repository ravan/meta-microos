SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python310-h5netcdf-1.3.0-1.1.noarch.rpm"
RPM_HASH = "3f19786382f6c8b67e9900945fb8e17eb1bfb4a7d6cd8f665b1aded69663fca50bbb432c54d3f85f2e5db75c4a83d45ad9c7327632ff3fe60ed597cec953ea85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-h5netcdf \
python310-h5netcdf \
python3dist-h5netcdf"

RDEPENDS:${PN} += "python-abi \
python310-h5py \
python310-packaging"

inherit rpm
