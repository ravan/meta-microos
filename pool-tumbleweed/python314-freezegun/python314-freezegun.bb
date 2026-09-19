SUMMARY = "Mock time date for Python"
DESCRIPTION = "FreezeGun is a library that allows your python tests to travel through \
time by mocking the datetime module."
LICENSE = "Apache-2.0"

PV = "1.5.5"

RPM_NAME = "python314-freezegun-1.5.5-1.4.noarch.rpm"
RPM_HASH = "fb45d8562613389e4b619c7bffd7fefcc1c658fec386d171de5dcbb5e9d3bdbdcc9cb796ddcea0b50fb7020d26978a633532e6c1147caf8b2f8cfbef524e9dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-freezegun \
python314-freezegun \
python3dist-freezegun"

RDEPENDS:${PN} += "python-abi \
python314 \
python314-python-dateutil"

inherit rpm
