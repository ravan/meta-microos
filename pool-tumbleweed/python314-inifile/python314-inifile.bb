SUMMARY = "A small INI library for Python"
DESCRIPTION = "A small INI library for Python."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python314-inifile-0.4.1-2.5.noarch.rpm"
RPM_HASH = "11c5d98169c1b5cd1b750d8c399c0526341ea85dd43038095e56e607cd965136fbe57e18662f03f5dab6ea3de09623218b70877060b54828cbb8f9e357d4a163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-inifile \
python314-inifile \
python3dist-inifile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
