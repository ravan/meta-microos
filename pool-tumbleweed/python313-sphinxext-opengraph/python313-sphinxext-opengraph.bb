SUMMARY = "Sphinx Extension to enable OGP support"
DESCRIPTION = "Sphinx Extension to enable OGP support"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python313-sphinxext-opengraph-0.13.0-1.4.noarch.rpm"
RPM_HASH = "4045281c5e5c5d13320b995061dd9e78ce00f5cf083451af9ec462e9e002c1cfb94fdac5b6cbba5d637d45459a6b7f8140b536fea0b57fb537d1e76c657f85fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxext-opengraph \
python3.13dist-sphinxext-opengraph \
python313-sphinxext-opengraph \
python3dist-sphinxext-opengraph"

RDEPENDS:${PN} += "python-abi \
python3-Sphinx"

inherit rpm
