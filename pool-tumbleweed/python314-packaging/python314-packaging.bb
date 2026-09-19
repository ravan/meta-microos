SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "26.3"

RPM_NAME = "python314-packaging-26.3-1.1.noarch.rpm"
RPM_HASH = "df2116bc18063c4716717ef311bcea2bb36ca7b84dbd4668e57221dd4a5ce517868dd4ea5b7d0c275cac13bb7e6dd96ab7a33dd16b82737a45cc99897c54665e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-packaging \
python314-packaging \
python3dist-packaging"

RDEPENDS:${PN} += "python-abi"

inherit rpm
