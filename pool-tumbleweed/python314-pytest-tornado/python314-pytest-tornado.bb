SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python314-pytest-tornado-0.8.1-3.5.noarch.rpm"
RPM_HASH = "815fccc1ea7d39550630ada645d90e4171d57e3b378dcc152a502ef99763b72bc62511622fed3c3f5f39b10cfc09399c397063378b6d54b24d77b2042e275335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-tornado \
python314-pytest-tornado \
python3dist-pytest-tornado"

RDEPENDS:${PN} += "python-abi \
python314-certifi \
python314-pytest \
python314-tornado"

inherit rpm
