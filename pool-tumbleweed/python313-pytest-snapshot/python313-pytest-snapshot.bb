SUMMARY = "A plugin for snapshot testing with pytest"
DESCRIPTION = "A plugin for snapshot testing with pytest."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-pytest-snapshot-0.9.0-1.6.noarch.rpm"
RPM_HASH = "28ad06c493da526b2b09586f2e12aeba24e3d3464aec0c08c19449a01c75c8ce1e23a4ee881e2a85868b228dca9ac63997bb07f8047d02a71f21806627e9f2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-snapshot \
python3.13dist-pytest-snapshot \
python313-pytest-snapshot \
python3dist-pytest-snapshot"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
