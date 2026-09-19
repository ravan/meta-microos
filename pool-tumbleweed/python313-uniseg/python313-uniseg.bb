SUMMARY = "Python module for determining Unicode text segmentations"
DESCRIPTION = "A pure Python module to determine Unicode text segmentations."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python313-uniseg-0.7.2-2.5.noarch.rpm"
RPM_HASH = "5c8edae63426491c99a09a459b8824d09676684c76422a9e15b21796b87509644b6ee45aa2123580a6ea0c4591a5754ccf393f308284a77dbccb9ea019c6aa9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uniseg \
python3.13dist-uniseg \
python313-uniseg \
python3dist-uniseg"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
