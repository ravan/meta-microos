SUMMARY = "Separate test code from test cases in pytest"
DESCRIPTION = "Separate test code from test cases in pytest."
LICENSE = "BSD-3-Clause"

PV = "3.10.1"

RPM_NAME = "python313-pytest-cases-3.10.1-1.3.noarch.rpm"
RPM_HASH = "82d64a3fd420dfde07455dbc52053faa3ec1f01a03b97aa74b1db6a092c1e022ed385e3b729042675fa3d4c027bb8a2559277dd5891e00a503b8a85b40d32a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-cases \
python3.13dist-pytest-cases \
python313-pytest-cases \
python3dist-pytest-cases"

RDEPENDS:${PN} += "python-abi \
python313-decopatch \
python313-makefun \
python313-packaging"

inherit rpm
