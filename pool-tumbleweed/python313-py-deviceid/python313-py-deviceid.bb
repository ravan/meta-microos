SUMMARY = "A simple library to get or create a unique device id for a device in Python"
DESCRIPTION = "A simple library to get or create a unique device id for a device in Python."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-py-deviceid-0.1.1-1.5.noarch.rpm"
RPM_HASH = "fc363938d8a2dc0095418519ae39f1f97520211743702435f2516e1f63000757fac694d20e5df8e9a2ac92cb31f40d707d64af2dede345bf81e44c5661487a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-deviceid \
python3.13dist-py-deviceid \
python313-py-deviceid \
python3dist-py-deviceid"

RDEPENDS:${PN} += "python-abi"

inherit rpm
