SUMMARY = "Pytest plugin for Click"
DESCRIPTION = "Py.test plugin for Click."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-pytest-click-1.1.0-3.5.noarch.rpm"
RPM_HASH = "6ecc5f2388c38daaaa64a6c7a50426b978b949012e9a28fcdeff130e0ce15328c5ab514b30cca9d320997a2190a3268f6ca3fabdf62faa798c4480bb34fcaa5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-click \
python3.13dist-pytest-click \
python313-pytest-click \
python3dist-pytest-click"

RDEPENDS:${PN} += "python-abi \
python313-click \
python313-pytest"

inherit rpm
