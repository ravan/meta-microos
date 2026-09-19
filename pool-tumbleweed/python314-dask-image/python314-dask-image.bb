SUMMARY = "Distributed image processing"
DESCRIPTION = "Distributed image processing"
LICENSE = "BSD-3-Clause"

PV = "2025.11.0"

RPM_NAME = "python314-dask-image-2025.11.0-2.2.noarch.rpm"
RPM_HASH = "c3c9a86a651b132878c6efc2148301bf8e978b6071adae14ce0b88057fdcfa8b54f19413482e4334ad25b66a6fbb4374fda381d59e6614af04ad17afbff27ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dask-image \
python314-dask-image \
python3dist-dask-image"

RDEPENDS:${PN} += "python-abi \
python314-dask-complete \
python314-numpy \
python314-pandas \
python314-pims \
python314-scipy \
python314-tifffile"

inherit rpm
