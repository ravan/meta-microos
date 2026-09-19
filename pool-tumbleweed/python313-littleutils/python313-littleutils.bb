SUMMARY = "Small personal collection of python utility functions"
DESCRIPTION = "Small personal collection of python utility functions"
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python313-littleutils-0.2.4-1.8.noarch.rpm"
RPM_HASH = "9f2ab66a75de803366eac24d2ea8a280303797592d5573aa0b7e1a3181ce6e79135fb21eff7ee30f03ade3b57145509b626493291a6b0e212968445755902611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-littleutils \
python3.13dist-littleutils \
python313-littleutils \
python3dist-littleutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
