SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python313-mergedeep-1.3.4-4.5.noarch.rpm"
RPM_HASH = "5170f5aba2b2036aeec35f0a094a9b2d60b36bbc3a7ccb0dfcc6c66c697d87fcf9dec858a869a6f89b2f7472a7a80b0ae8a90b88de984878337e123f7cdd7d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mergedeep \
python3.13dist-mergedeep \
python313-mergedeep \
python3dist-mergedeep"

RDEPENDS:${PN} += "python-abi"

inherit rpm
