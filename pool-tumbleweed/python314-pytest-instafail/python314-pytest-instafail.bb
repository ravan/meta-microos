SUMMARY = "Pytest Plugin to Show Failures Instantly"
DESCRIPTION = "Pytest-instafail is a plugin for py.test that shows \
failures and errors instantly instead of waiting \
until the end of test session."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python314-pytest-instafail-0.5.0-3.2.noarch.rpm"
RPM_HASH = "8d647ba8773aea9cf620c3aa9cf293357111f648b77ecf8b7432aa00820743c00c1d306c782586aa6df0d9d26400e3b281ca434534286e4f7ba8d9e8c4a624fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-instafail \
python314-pytest-instafail \
python3dist-pytest-instafail"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
