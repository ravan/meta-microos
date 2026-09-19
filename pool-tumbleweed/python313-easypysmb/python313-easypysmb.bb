SUMMARY = "PySMB wrapper library"
DESCRIPTION = "easypysmb is a Python library that wraps around the pysmb library."
LICENSE = "GPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python313-easypysmb-1.4.4-3.4.noarch.rpm"
RPM_HASH = "448c3c0657b316be28469d6487558ac2db66a52ed8f0959f6f3d407f1f2b07a151d7b7c6f6fd212ad0afb840a096d8a1aaacadf2f383e9e0cf9dbe17d94fe9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easypysmb \
python3.13dist-easypysmb \
python313-easypysmb \
python3dist-easypysmb"

RDEPENDS:${PN} += "python-abi \
python313-pysmb"

inherit rpm
