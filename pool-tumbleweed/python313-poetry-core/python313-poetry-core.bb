SUMMARY = "Poetry PEP 517 Build Backend"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "2.4.0"

RPM_NAME = "python313-poetry-core-2.4.0-2.1.noarch.rpm"
RPM_HASH = "31e67f1489fa76a1a83d4fdc3cf139402019600c30afa417c34b12da33d76a5641f659af92b06b6114a2b408dca6e3bac3f97d73d5958baa1ce90e9718c09e2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry-core \
python3.13dist-poetry-core \
python313-poetry-core \
python3dist-poetry-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
