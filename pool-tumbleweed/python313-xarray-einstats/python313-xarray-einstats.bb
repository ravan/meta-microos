SUMMARY = "Stats, linear algebra and einops for xarray"
DESCRIPTION = "Stats, linear algebra and einops for xarray"
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python313-xarray-einstats-0.10.0-1.2.noarch.rpm"
RPM_HASH = "b36aa0364cedade28b3b55e2a5c8b665ad71a938790f0cb3f4d12cd7a9a55ded56f4248bc30137434e7d43373059de5f695c8c3f130537bc6825cb6c7d452e35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray-einstats \
python3.13dist-xarray-einstats \
python313-xarray-einstats \
python3dist-xarray-einstats"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-scipy \
python313-xarray"

inherit rpm
