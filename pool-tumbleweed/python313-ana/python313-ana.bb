SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python313-ana-0.06-5.12.noarch.rpm"
RPM_HASH = "e62a84efe3a5b5cae87071c1eb62fe6fe5c67b2f4f4b34dfc564acc02f5a533b492476cb3d541ef8a7fa3122f207ed018495db78d0edf69c13106b2616782ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ana \
python3.13dist-ana \
python313-ana \
python3dist-ana"

RDEPENDS:${PN} += "python-abi"

inherit rpm
