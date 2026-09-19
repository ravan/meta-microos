SUMMARY = "A Quart extension to provide trio support"
DESCRIPTION = "Quart-Trio is an extension for Quart to support the Trio event loop. This is \
an alternative to using the asyncio event loop present in the Python standard \
library and supported by default in Quart."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python314-quart-trio-0.12.0-1.7.noarch.rpm"
RPM_HASH = "f2f37c269652f6eb990162366f2cf1ecb307ae7564aeec3a080bafc8fb5917e8dc8c8c4ae978e78fe9dc28e8393c88683f4827db387f8401ff4201b1497cb47d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-quart-trio \
python314-quart-trio \
python3dist-quart-trio"

RDEPENDS:${PN} += "python-abi \
python314-Quart \
python314-exceptiongroup \
python314-hypercorn \
python314-trio"

inherit rpm
