SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python39-h5netcdf-1.3.0-1.1.noarch.rpm"
RPM_HASH = "83f769a7a5f04a508493c220ed509acf0bf4aad9ba1a88857cfa75cf7ea705df1a18cd87ffcb9cabb214fb399218107490643ddde05bfbc739c4e2909ba8a909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-h5netcdf \
python39-h5netcdf \
python3dist-h5netcdf"

RDEPENDS:${PN} += "python-abi \
python39-h5py \
python39-packaging"

inherit rpm
