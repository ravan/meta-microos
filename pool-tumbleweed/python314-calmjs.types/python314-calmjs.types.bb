SUMMARY = "Types for the calmjs framework"
DESCRIPTION = "A collection of types (mostly exception classes) for use with |calmjs|_."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-calmjs.types-1.0.1-4.5.noarch.rpm"
RPM_HASH = "b98d34d721e85780303a10f5abdffb09f110292e48f115e5e1568571e3ece7c348275baf15bdb14420a58dd167a4c948a1f743dd51d90bb9d6fdcc2333440d17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-calmjs.types \
python314-calmjs.types \
python3dist-calmjs.types"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
