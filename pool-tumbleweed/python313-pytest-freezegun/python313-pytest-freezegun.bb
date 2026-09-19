SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python313-pytest-freezegun-0.4.2-4.5.noarch.rpm"
RPM_HASH = "63ac8805dfe75b6beccf6610038c1be49ffe808bbf45c0d03b87312afeef88dfa448bae5b4f5d9d2bd033b64dbcecf9ab4ef2e8103dbb25ac47c9c19fe5427cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-freezegun \
python3.13dist-pytest-freezegun \
python313-pytest-freezegun \
python3dist-pytest-freezegun"

RDEPENDS:${PN} += "python-abi \
python313-freezegun \
python313-pytest"

inherit rpm
