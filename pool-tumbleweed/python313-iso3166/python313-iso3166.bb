SUMMARY = "Python ISO 3166-1 country definitions"
DESCRIPTION = "ISO 3166-1 defines two-letter, three-letter, and three-digit country \
codes. `python-iso3166` is a self-contained module that converts \
between these codes and the corresponding country name."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python313-iso3166-2.1.1-2.5.noarch.rpm"
RPM_HASH = "e8c76d0ad95946e099b9cf866cd65ef957c8b8cdbb7f1e66a1a31cf014d7dd6f54b9277d0ab987c21238a16cb78b3df5d49fea3b609a6c0219333410738331f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iso3166 \
python3.13dist-iso3166 \
python313-iso3166 \
python3dist-iso3166"

RDEPENDS:${PN} += "python-abi"

inherit rpm
