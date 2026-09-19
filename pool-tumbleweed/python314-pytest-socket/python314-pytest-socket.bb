SUMMARY = "Pytest Plugin to disable socket calls"
DESCRIPTION = "A plugin to use with Pytest to disable or restrict socket calls during \
tests to ensure network calls are prevented."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python314-pytest-socket-0.7.0-1.9.noarch.rpm"
RPM_HASH = "8413fb87f3481f18a75cbca84d62ed6d6412694df2b149083500e2f94d37f9e0ab4e62672a02a7907a8425bbb50947af77c6e91f771050f6b250dbf8582a3cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-socket \
python314-pytest-socket \
python3dist-pytest-socket"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
