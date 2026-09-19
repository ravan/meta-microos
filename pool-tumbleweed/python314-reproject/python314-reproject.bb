SUMMARY = "Reproject astronomical images"
DESCRIPTION = "Reproject astronomical images"
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python314-reproject-0.21.0-1.3.aarch64.rpm"
RPM_HASH = "eccc94df4658c72bbb5c7c92f48270f80a7a0493faab5bc8f592cfe28e8d55bcb93d283c1be6ee1cacaf6e9c4b2c5ad58c7185caf7d2c711e01fcb0f14d74e8b"

RPROVIDES:${PN} += "python3.14dist-reproject \
python314-reproject \
python3dist-reproject"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-Pillow \
python314-astropy \
python314-astropy-healpix \
python314-dask-array \
python314-dask-image \
python314-fsspec \
python314-numpy \
python314-pyavm \
python314-scipy \
python314-zarr"

inherit rpm
