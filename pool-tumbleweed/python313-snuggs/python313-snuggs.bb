SUMMARY = "S-expressions tool for Numpy"
DESCRIPTION = "Snuggs are s-expressions for Numpy."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "python313-snuggs-1.4.7-4.12.noarch.rpm"
RPM_HASH = "de1ce79023b9cbb0e41bea50274a5b12f810c7a737808afa6514f511cbaa25cfac76ebb0af2527920050889a9b03e0682c5864dd8a84212c648596c32587061e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-snuggs \
python3.13dist-snuggs \
python313-snuggs \
python3dist-snuggs"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-pyparsing"

inherit rpm
