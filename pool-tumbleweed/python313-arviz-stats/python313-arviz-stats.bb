SUMMARY = "Statistical computation and diagnostics for ArviZ"
DESCRIPTION = "ArviZ computational/numeric features: statistical summaries, diagnostics, model comparison."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python313-arviz-stats-1.3.0-1.1.noarch.rpm"
RPM_HASH = "e8e0754c2fd124f7b2634713caff7b5d3132a2638dcc94a9273a07d0288f1720faca183f142d7f41424d15bdfb7095a56b29e6a7e500b8ef3877cd929578720e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arviz-stats \
python3.13dist-arviz-stats \
python313-arviz-stats \
python3dist-arviz-stats"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-scipy \
python313-xarray-einstats"

inherit rpm
