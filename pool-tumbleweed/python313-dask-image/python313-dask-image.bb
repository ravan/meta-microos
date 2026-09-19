SUMMARY = "Distributed image processing"
DESCRIPTION = "Distributed image processing"
LICENSE = "BSD-3-Clause"

PV = "2025.11.0"

RPM_NAME = "python313-dask-image-2025.11.0-2.2.noarch.rpm"
RPM_HASH = "4063e455b58f940f4b5cfbffac35934c3682d1d64c734109c6b50bf7033ab5df84319c7a4befa90472365e0077cf6f8d87a5b594adf235d348c687a50170552c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-image \
python3.13dist-dask-image \
python313-dask-image \
python3dist-dask-image"

RDEPENDS:${PN} += "python-abi \
python313-dask-complete \
python313-numpy \
python313-pandas \
python313-pims \
python313-scipy \
python313-tifffile"

inherit rpm
