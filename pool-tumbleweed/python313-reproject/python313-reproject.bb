SUMMARY = "Reproject astronomical images"
DESCRIPTION = "Reproject astronomical images"
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python313-reproject-0.21.0-1.3.aarch64.rpm"
RPM_HASH = "c4e1bbdb7934290153279ef6d72df0cf0851061fb61040d3009485ad2066c7bae556f28545783150c0308b2fdc91028a23edc610e76d7d60695597b622ab0606"

RPROVIDES:${PN} += "python3-reproject \
python3.13dist-reproject \
python313-reproject \
python3dist-reproject"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-Pillow \
python313-astropy \
python313-astropy-healpix \
python313-dask-array \
python313-dask-image \
python313-fsspec \
python313-numpy \
python313-pyavm \
python313-scipy \
python313-zarr"

inherit rpm
