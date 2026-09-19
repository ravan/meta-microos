SUMMARY = "The python xarray[parallel] extra"
DESCRIPTION = "The [parallel] extra for xarray, N-D labeled arrays and datasets in Python"
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python314-xarray-parallel-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "ee6d817531b2c439ff6a1e989c5d3219e76f2c19719ce9b447a09048d02054fc0bf3b58854aeac5812500951c954a397448b64bd98d301071a89ad61de2e54f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-xarray-parallel"

RDEPENDS:${PN} += "python314-dask-complete \
python314-xarray"

inherit rpm
