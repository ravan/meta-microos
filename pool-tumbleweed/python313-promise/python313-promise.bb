SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python313-promise-2.3.0-7.5.noarch.rpm"
RPM_HASH = "1a3e0567c05e3176d3dc7eaa88eedcacaca9a521fd3f9d981b704ab8f6c713e6fa78207b90810d1f475baed82d988819bf385f2b08c3763869a5a0deb5a62aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-promise \
python3.13dist-promise \
python313-promise \
python3dist-promise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
