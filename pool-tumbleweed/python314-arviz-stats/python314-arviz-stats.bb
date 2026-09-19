SUMMARY = "Statistical computation and diagnostics for ArviZ"
DESCRIPTION = "ArviZ computational/numeric features: statistical summaries, diagnostics, model comparison."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python314-arviz-stats-1.3.0-1.1.noarch.rpm"
RPM_HASH = "0a60ade6d1a5169832625bf980fbb5307c7543482c1130a448da7a3bc5f82e9a2a444bce41cce7056853365ca3b2d116b6c6d0ac3a8d857cb4cd119a27f78d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-arviz-stats \
python314-arviz-stats \
python3dist-arviz-stats"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-scipy \
python314-xarray-einstats"

inherit rpm
