SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python313-whatthepatch-1.0.7-2.1.noarch.rpm"
RPM_HASH = "28900b72388f547a14894d5f08b80f9b8e34d3c5e7f8c35bdf16197f6c5078482bbbd7c5778bafdc2700beeaa9d30d3a8d30a8c857bb5e970b4535361485c4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whatthepatch \
python3.13dist-whatthepatch \
python313-whatthepatch \
python3dist-whatthepatch"

RDEPENDS:${PN} += "ed \
patch \
python-abi"

inherit rpm
