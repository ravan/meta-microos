SUMMARY = "PyTest plugin for testing Tornado code"
DESCRIPTION = "A pytest plugin that provides some fixtures for testing Tornado \
apps and handling of plain (undecoratored) native coroutine tests."
LICENSE = "MIT"

PV = "0.6.0.post2"

RPM_NAME = "python313-pytest-tornasync-0.6.0.post2-3.5.noarch.rpm"
RPM_HASH = "deb04368b094c7bd4cd52139dbc9814abb3b3f8d35f00f07fb1606d378de0d394f0e0b941408bb4a8b919fb3c3f9fe5682eb59c84aa28418d0021eb2dab23e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-tornasync \
python3.13dist-pytest-tornasync \
python313-pytest-tornasync \
python3dist-pytest-tornasync"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-tornado"

inherit rpm
