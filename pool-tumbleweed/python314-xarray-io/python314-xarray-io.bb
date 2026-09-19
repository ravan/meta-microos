SUMMARY = "The python xarray[io] extra"
DESCRIPTION = "The [io] extra for xarray, N-D labeled arrays and datasets in Python"
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python314-xarray-io-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "7a767eed2ccdf2ceccf30fe0492708b818f5b41797baad2e03fdd939794098f79bb2459d356c2846104833b8d0fb6aa480edd8657dd3e9635f5bde3459f1c84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-xarray-io"

RDEPENDS:${PN} += "python314-cftime \
python314-fsspec \
python314-h5netcdf \
python314-netCDF4 \
python314-pooch \
python314-scipy \
python314-xarray \
python314-zarr"

inherit rpm
