SUMMARY = "The python xarray[parallel] extra"
DESCRIPTION = "The [parallel] extra for xarray, N-D labeled arrays and datasets in Python"
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python313-xarray-parallel-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "701e3f1b1bd4d653bec8733510b3d35748c80e8b4f7b3e5c41c5ba086ae7eca5447c55b5b15967f9630b120d03186c6df618922e95e0cece536c0f2006e0676e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray-parallel \
python313-xarray-parallel"

RDEPENDS:${PN} += "python313-dask-complete \
python313-xarray"

inherit rpm
