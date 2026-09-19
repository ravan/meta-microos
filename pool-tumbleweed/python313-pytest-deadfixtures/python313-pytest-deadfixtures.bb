SUMMARY = "A simple plugin to list unused fixtures in pytest"
DESCRIPTION = "A simple plugin to list unused fixtures in pytest"
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python313-pytest-deadfixtures-3.1.0-1.4.noarch.rpm"
RPM_HASH = "1201d5ffb33596f7e68bc1d72e9f506212e63fd79f2a34cd288ba478846c113700c0f3578b6c000d72af12291170d87662a81a564bc7478fe859a3d49b23f30e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-deadfixtures \
python3.13dist-pytest-deadfixtures \
python313-pytest-deadfixtures \
python3dist-pytest-deadfixtures"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
