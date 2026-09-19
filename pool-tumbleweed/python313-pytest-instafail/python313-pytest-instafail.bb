SUMMARY = "Pytest Plugin to Show Failures Instantly"
DESCRIPTION = "Pytest-instafail is a plugin for py.test that shows \
failures and errors instantly instead of waiting \
until the end of test session."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python313-pytest-instafail-0.5.0-3.2.noarch.rpm"
RPM_HASH = "92807a1ae2014d1ccb643c13672ef03536e560f715ac1137cbf75b4b9876b35b7398cbbe5729dbc19ac5e96ac6615ee1dc7358e758320977c98149f0d0c70b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-instafail \
python3.13dist-pytest-instafail \
python313-pytest-instafail \
python3dist-pytest-instafail"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
