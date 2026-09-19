SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python313-pytest-tornado-0.8.1-3.5.noarch.rpm"
RPM_HASH = "b769a0d39e458b57ab558c8bad42d17fd5f28faef17c0376aeac967f2001c154210815541e813ee0ccc9a61bba5e679bdd9e24b4d6e1672d65a07aebab0ea411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-tornado \
python3.13dist-pytest-tornado \
python313-pytest-tornado \
python3dist-pytest-tornado"

RDEPENDS:${PN} += "python-abi \
python313-certifi \
python313-pytest \
python313-tornado"

inherit rpm
