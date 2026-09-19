SUMMARY = "The python xarray[io] extra"
DESCRIPTION = "The [io] extra for xarray, N-D labeled arrays and datasets in Python"
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python313-xarray-io-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "ddaa04306499e24fe7e08f61d8f95cc4cd673093859664a7eb7af0a6667c2ecda43b7c37053aa536b413e56f9c2000005a1cbc59ac6c28a7bc50df8a37f8ec33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray-io \
python313-xarray-io"

RDEPENDS:${PN} += "python313-cftime \
python313-fsspec \
python313-h5netcdf \
python313-netCDF4 \
python313-pooch \
python313-scipy \
python313-xarray \
python313-zarr"

inherit rpm
