SUMMARY = "Pytest Plugin to disable socket calls"
DESCRIPTION = "A plugin to use with Pytest to disable or restrict socket calls during \
tests to ensure network calls are prevented."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python313-pytest-socket-0.7.0-1.9.noarch.rpm"
RPM_HASH = "c383797f10ca1058dadb1005d295342493c28a1450159036cabe20fa017fa834211fb26389631c3037315db805daec6a7a3600ac23bcbfd4b37aa16ec66433c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-socket \
python3.13dist-pytest-socket \
python313-pytest-socket \
python3dist-pytest-socket"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
