SUMMARY = "Stats, linear algebra and einops for xarray"
DESCRIPTION = "Stats, linear algebra and einops for xarray"
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python314-xarray-einstats-0.10.0-1.2.noarch.rpm"
RPM_HASH = "8c8412d1bb114ca72cd92af9dba57e582205948be50318cf17f3fa2fda99298a7a58f7a0895568424ff51a2b6be27fa26427f5cc9f30177165f3ecb0748b6284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xarray-einstats \
python314-xarray-einstats \
python3dist-xarray-einstats"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-scipy \
python314-xarray"

inherit rpm
