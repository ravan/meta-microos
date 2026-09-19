SUMMARY = "Python Promises"
DESCRIPTION = "Promises implementation for python."
LICENSE = "BSD-3-Clause"

PV = "5.1.0"

RPM_NAME = "python314-vine-5.1.0-2.9.noarch.rpm"
RPM_HASH = "4af8a94b4bd39f5a6b4d635fd6bf6230ae5453678a8a04a147dec689b6a1ec8f848393f4082f477ea25b9f45a9ae395c22d6c5c6894fc500256f142493a8640a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vine \
python314-vine \
python3dist-vine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
